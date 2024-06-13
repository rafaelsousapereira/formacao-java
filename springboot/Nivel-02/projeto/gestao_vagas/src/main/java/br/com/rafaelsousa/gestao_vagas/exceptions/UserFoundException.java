package br.com.rafaelsousa.gestao_vagas.exceptions;

import java.io.Serial;

public class UserFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UserFoundException(String message) {
        super(message);
    }
}
