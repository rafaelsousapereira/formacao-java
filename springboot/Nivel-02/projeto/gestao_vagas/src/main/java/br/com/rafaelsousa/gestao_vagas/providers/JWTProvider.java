package br.com.rafaelsousa.gestao_vagas.providers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JWTProvider {

    @Value("${security.token.secret}")
    private String secretKey;

    public String validateToken(String token) {
        // Sobrescrever Bearer
        token = token.replace("Bearer ", "");

        // Validar token
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        try {
            return JWT.require(algorithm).build().verify(token).getSubject();
        } catch (JWTVerificationException ex) {
            throw new JWTVerificationException("Invalid token", ex);
        }
    }
}
