package com.example.funcionarios.application;

import java.util.List;

import com.example.funcionarios.domain.model.Funcionario;

public class Principal {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();
        List<Funcionario> funcionarios = funcionarioService.criarFuncionarios();

        // 3.2 – Remover o funcionário “João” da lista.
        funcionarioService.removerFuncionario(funcionarios, "João");

        // 3.3 – Imprimir todos os funcionários com todas suas informações.
        funcionarioService.imprimirFuncionario(funcionarios);

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista
        // de funcionários com novo valor.
        List<Funcionario> funcionariosAtualizados = funcionarioService.atualizarSalario(funcionarios);
        funcionarioService.imprimirFuncionario(funcionariosAtualizados);

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função”
        // e o valor a “lista de funcionários”.
        funcionarioService.agruparFuncionarios(funcionarios);

    }
}
