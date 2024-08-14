package br.com.rafaelsousa.gestao_vagas.modules.company.controllers;

import br.com.rafaelsousa.gestao_vagas.modules.company.dto.CreateJobDTO;
import br.com.rafaelsousa.gestao_vagas.modules.company.entities.JobEntity;
import br.com.rafaelsousa.gestao_vagas.modules.company.useCases.CreateJobsUseCase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobsUseCase createJobsUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody CreateJobDTO createJobDTO, HttpServletRequest request) {
        var companyId = request.getAttribute("companyId");
        var jobEntity = JobEntity.builder()
                .description(createJobDTO.getDescription())
                .benefits(createJobDTO.getBenefits())
                .level(createJobDTO.getLevel()).companyId(UUID.fromString(companyId.toString()))
                .build();
        return this.createJobsUseCase.execute(jobEntity);
    }
}
