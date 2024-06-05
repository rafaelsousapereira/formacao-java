package br.com.rafaelsousa.controller;

import br.com.rafaelsousa.ioc_di.MeuComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponente {

    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String chamandoComponent() {
        var resultado = meuComponent.chamarMeuComponente();
        return resultado;
    }
}
