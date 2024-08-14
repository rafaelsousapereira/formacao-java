package br.com.rafaelsousa.gestao_vagas.modules.company.useCases;

import br.com.rafaelsousa.gestao_vagas.exceptions.UserFoundException;
import br.com.rafaelsousa.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import br.com.rafaelsousa.gestao_vagas.modules.company.repositories.CompanyRepository;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

@Service
public class AuthCompanyUseCase {

    @Value("${security.token.secret}")
    private String secretKey;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String execute(AuthCompanyDTO authCompanyDTO) throws AuthenticationException {

        var company = companyRepository.findByUsername(authCompanyDTO.getUsername())
                .orElseThrow(() -> new UserFoundException("Username or password incorrect"));

        // Verificar se as senhas são iguais
        var isPasswordMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());

        // Se não for iguais -> Erro
        if (!isPasswordMatches) {
            throw new AuthenticationException();
        }

        // Se for iguais -> Gerar token
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        return JWT.create().withIssuer("javagas").withSubject(company.getId().toString()).sign(algorithm);
    }
}
