package com.ada.projetooo;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setCpf("123456");
        funcionario.setNome("Teste");
        funcionario.setSalario(1000);

Funcionario funcionario2 = new Funcionario();

        funcionario2.setCpf("123456");
        funcionario2.setNome("Teste");
        funcionario2.setSalario(1000);

        Gerente gerente = new Gerente();

        gerente.setCpf("234234");
        gerente.setNome("TesteGerente");
        gerente.setSalario(5000);
        gerente.setSenha("5678");

        System.out.println(gerente.getCpf());

        System.out.println(funcionario.getBonificacao());
        System.out.println(gerente.getBonificacao());
        System.out.println(funcionario.equals(funcionario2));


    }
}
