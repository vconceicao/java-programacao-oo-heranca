package com.ada.projetooo;

public class TestaControleBonificacao {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setCpf("123456");
        funcionario.setNome("Teste");
        funcionario.setSalario(1000);

        Funcionario gerente = new Gerente();

        gerente.setCpf("234234");
        gerente.setNome("TesteGerente");
        gerente.setSalario(5000);
       // gerente.setSenha("5678");

        ControleBonificacao controleBonificacao = new ControleBonificacao();

        controleBonificacao.registrar(funcionario);
        controleBonificacao.registrar(gerente);
        controleBonificacao.registrar("Uma String");
        System.out.println(controleBonificacao.getTotal());


    }
}
