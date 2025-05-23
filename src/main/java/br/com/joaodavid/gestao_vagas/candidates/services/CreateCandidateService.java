package  br.com.joaodavid.gestao_vagas.candidates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joaodavid.gestao_vagas.candidates.controllers.CandidateRepository;
import br.com.joaodavid.gestao_vagas.candidates.entitys.CandidateEntity;
import br.com.joaodavid.gestao_vagas.candidates.exceptions.UserFoundExecption;

@Service
public class CreateCandidateService{

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
        this.candidateRepository
            .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
            .ifPresent((user) -> {
                throw new UserFoundExecption();
            });
        
        return this.candidateRepository.save(candidateEntity);
            
    }

}