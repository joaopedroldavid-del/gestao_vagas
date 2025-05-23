package br.com.joaodavid.gestao_vagas.candidates.exceptions;

public class UserFoundExecption extends RuntimeException {
    public UserFoundExecption(){
        super("User already exists");
    }
}