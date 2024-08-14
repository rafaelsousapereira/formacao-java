package br.com.rafaelsousa.gestao_vagas.modules.candidate.controllers.useCases;

import br.com.rafaelsousa.gestao_vagas.exceptions.UserNotFoundException;
import br.com.rafaelsousa.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rafaelsousa.gestao_vagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    public CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserNotFoundException("Usuário já existe");
                });
        return candidateRepository.save(candidateEntity);
    }
}
