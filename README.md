# Gerenciamento de Funcionários

Projeto simples em Java que manipula uma lista de funcionários e executa no console uma série de requisitos (listagem, filtros, agrupamentos e cálculos sobre salários).

**Autor:** Raphael Skarda

---

## Sobre o projeto

Trata-se de um exercício acadêmico/prático, sem API REST nem banco de dados. Os dados são criados em memória e o resultado de cada requisito é exibido no terminal com `System.out.println`.

A lógica fica principalmente em:

- `FuncionarioService` — operações sobre a lista de funcionários
- `Principal` — orquestra e executa os requisitos na ordem definida

O projeto usa **Spring Boot** como base Maven, mas o foco é a execução dos requisitos em console, não um sistema completo de gestão.

---

## Tecnologias

- Java 21
- Maven
- Spring Boot 4.1.1
- Lombok

---

## Requisitos implementados

| Item | Descrição                                                      |
| ---- | -------------------------------------------------------------- |
| 3.2  | Remover o funcionário "João" da lista                          |
| 3.3  | Imprimir todos os funcionários com suas informações            |
| 3.4  | Aplicar aumento de 10% no salário e exibir a lista atualizada  |
| 3.5  | Agrupar funcionários por função em um `Map`                    |
| 3.6  | Imprimir funcionários agrupados por função                     |
| 3.8  | Imprimir funcionários que fazem aniversário nos meses 10 e 12  |
| 3.9  | Imprimir o funcionário mais velho (nome e idade)               |
| 3.10 | Listar funcionários em ordem alfabética                        |
| 3.11 | Imprimir o total dos salários                                  |
| 3.12 | Imprimir quantos salários mínimos (R$ 1.212,00) cada um recebe |

Execute a classe `com.example.funcionarios.application.Principal`.
