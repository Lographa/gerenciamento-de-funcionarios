package com.example.funcionarios.application;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.funcionarios.domain.model.Funcionario;

public class Principal {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();
        List<Funcionario> funcionarios = funcionarioService.criarFuncionarios();

        // 3.2 – Remover o funcionário “João” da lista.
        funcionarioService.removerFuncionario(funcionarios, "João");

    }
}
