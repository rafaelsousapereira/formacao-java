package br.com.rafaelsousa.gestao_vagas.modules.company.controllers;

import br.com.rafaelsousa.gestao_vagas.modules.company.entities.JobEntity;
import br.com.rafaelsousa.gestao_vagas.modules.company.useCases.CreateJobsUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobsUseCase createJobsUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
       return this.createJobsUseCase.execute(jobEntity);
    }
}
