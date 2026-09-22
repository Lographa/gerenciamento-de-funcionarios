package com.example.funcionarios.domain.model;

import java.time.LocalDate;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
}
