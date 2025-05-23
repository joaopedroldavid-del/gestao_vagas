package br.com.joaodavid.gestao_vagas.candidates.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaodavid.gestao_vagas.candidates.entitys.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
}
