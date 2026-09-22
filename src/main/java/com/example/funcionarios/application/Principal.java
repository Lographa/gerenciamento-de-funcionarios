package com.example.funcionarios.application;

import java.util.*;

import com.example.funcionarios.domain.model.Funcionario;

public class Principal {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();
        List<Funcionario> funcionarios = funcionarioService.criarFuncionarios();

        // 3.2 – Remover o funcionário “João” da lista.
        System.out.println("requisito 3.2");
        funcionarioService.removerFuncionario(funcionarios, "João");

        // 3.3 – Imprimir todos os funcionários com todas suas informações.
        System.out.println("requisito 3.3");
        funcionarioService.imprimirFuncionario(funcionarios);

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista
        // de funcionários com novo valor.
        System.out.println("requisito 3.4");
        List<Funcionario> funcionariosAtualizados = funcionarioService.atualizarSalario(funcionarios);
        funcionarioService.imprimirFuncionario(funcionariosAtualizados);

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função”
        // e o valor a “lista de funcionários”.
        System.out.println("requisito 3.5");
        Map<String, List<Funcionario>> funcionariosAgrupados = funcionarioService.agruparFuncionarios(funcionarios);

        // 3.6 – Imprimir os funcionários, agrupados por função.
        System.out.println("requisito 3.6");
        funcionarioService.imprimirFuncionariosAgrupados(funcionariosAgrupados);

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        System.out.println("requisito 3.8");
        funcionarioService.imprimirFuncionarioBirthdayBetweenDates(funcionarios);

        // 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e
        // idade.
        System.out.println("requisito 3.9");
        funcionarioService.imprimirFuncionarioMaiorIdade(funcionarios);

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética.
        System.out.println("requisito 3.10");
        funcionarioService.funcionariosOrdemAlfabetica(funcionarios);

        // 3.11 – Imprimir o total dos salários dos funcionários.
        System.out.println("requisito 3.11");
        funcionarioService.imprimirTotalSalarios(funcionarios);

        // 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando
        // que o salário mínimo é R$1212.00.
        System.out.println("requisito 3.12");
        funcionarioService.imprimirQuantosSalariosMinimos(funcionarios);
    }
}
