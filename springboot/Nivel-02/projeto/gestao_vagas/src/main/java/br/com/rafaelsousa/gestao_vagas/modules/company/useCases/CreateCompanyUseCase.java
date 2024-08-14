package br.com.rafaelsousa.gestao_vagas.modules.company.useCases;

import br.com.rafaelsousa.gestao_vagas.exceptions.UserFoundException;
import br.com.rafaelsousa.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.rafaelsousa.gestao_vagas.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    public CompanyRepository companyRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;
    private String password;

    public CompanyEntity execute(CompanyEntity companyEntity) {

        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException("Empresa já existe");
                });
        var password = passwordEncoder.encode(companyEntity.getPassword());
        companyEntity.setPassword(password);

        return this.companyRepository.save(companyEntity);
    }
}
