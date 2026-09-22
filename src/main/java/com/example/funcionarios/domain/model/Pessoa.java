package com.example.funcionarios.domain.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

}
