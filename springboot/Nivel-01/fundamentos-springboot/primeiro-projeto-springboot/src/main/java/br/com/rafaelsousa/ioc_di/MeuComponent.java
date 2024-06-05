package br.com.rafaelsousa.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

    public String chamarMeuComponente() {
        return "Chamando meu componente";
    }
}
