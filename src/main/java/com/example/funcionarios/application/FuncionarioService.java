package com.example.funcionarios.application;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

import com.example.funcionarios.domain.model.Funcionario;

public class FuncionarioService {

    public void removerFuncionario(List<Funcionario> funcionarios, String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public void imprimirFuncionario(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            String formattedDate = UtilsFormatter.formatDate(funcionario.getDataNascimento());
            String formattedSalary = UtilsFormatter.formatSalary(funcionario.getSalario());

            System.out.println(funcionario.getNome() + " - " + funcionario.getFuncao() + " - "
                    + formattedSalary + " - " + formattedDate);
        }
    }

    public List<Funcionario> atualizarSalario(List<Funcionario> funcionarios) {
        BigDecimal percentual = new BigDecimal("0.10");
        for (Funcionario funcionario : funcionarios) {

            BigDecimal aumento = funcionario.getSalario().multiply(percentual);

            BigDecimal novoSalario = funcionario.getSalario().add(aumento);
            funcionario.setSalario(novoSalario);
        }

        return funcionarios;
    }

    public Map<String, List<Funcionario>> agruparFuncionarios(List<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> funcionariosFuncaoMap = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
        return funcionariosFuncaoMap;
    }

    public void imprimirFuncionariosAgrupados(Map<String, List<Funcionario>> funcionariosFuncaoMap) {
        funcionariosFuncaoMap.forEach((funcao, lista) -> {
            System.out.println("Função: " + funcao);
            lista.forEach((e) -> {
                String formattedDate = UtilsFormatter.formatDate(e.getDataNascimento());
                String formattedSalary = UtilsFormatter.formatSalary(e.getSalario());
                System.out
                        .println(e.getNome() + " - " + formattedSalary + " - " + formattedDate);
            });
        });
    }

    public void imprimirFuncionarioBirthdayBetweenDates(List<Funcionario> funcionarios) {
        funcionarios.stream().filter(funcionario -> {
            int mes = funcionario.getDataNascimento().getMonthValue();
            return mes >= 10 && mes <= 12;
        }).forEach((funcionario) -> System.out.println(funcionario.getNome()));
    }

    public void imprimirFuncionarioMaiorIdade(List<Funcionario> funcionarios) {
        Funcionario maisVelho = funcionarios.stream().min(Comparator.comparing(Funcionario::getDataNascimento)).get();
        long idade = ChronoUnit.YEARS.between(maisVelho.getDataNascimento(), LocalDate.now());
        System.out.println("Funcionário mais velho: " + maisVelho.getNome() + " - " + idade + " anos");
    }

    public void funcionariosOrdemAlfabetica(List<Funcionario> funcionarios) {
        funcionarios.stream().sorted(Comparator.comparing(Funcionario::getNome))
                .forEach((funcionario) -> System.out.println(funcionario.getNome()));
    }

    public List<Funcionario> criarFuncionarios() {
        return new ArrayList<>(List.of(
                new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"),
                new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente")));
    }

}
