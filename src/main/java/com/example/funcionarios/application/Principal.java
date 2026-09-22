package com.example.funcionarios.application;

import java.time.LocalDate;
import java.util.*;

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
        Map<String, List<Funcionario>> funcionariosAgrupados = funcionarioService.agruparFuncionarios(funcionarios);

        // 3.6 – Imprimir os funcionários, agrupados por função.
        funcionarioService.imprimirFuncionariosAgrupados(funcionariosAgrupados);

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        funcionarioService.imprimirFuncionarioBirthdayBetweenDates(funcionarios);

        // 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e
        // idade.
        funcionarioService.imprimirFuncionarioMaiorIdade(funcionarios);

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética.
        funcionarioService.funcionariosOrdemAlfabetica(funcionarios);

        // 3.11 – Imprimir o total dos salários dos funcionários.
        funcionarioService.imprimirTotalSalarios(funcionarios);

        // 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando
        // que o salário mínimo é R$1212.00.
        funcionarioService.imprimirQuantosSalariosMinimos(funcionarios);
    }
}
