package br.com.rafaelsousa.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "<h1>Parabéns! Você criou a primeira rota.</h1>";
    }
}
