package br.com.rafaelsousa.gestao_vagas.modules.company.repositories;

import br.com.rafaelsousa.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rafaelsousa.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
