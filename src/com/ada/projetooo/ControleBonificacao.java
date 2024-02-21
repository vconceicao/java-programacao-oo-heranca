package com.ada.projetooo;

public class ControleBonificacao {

    private double total;

    public void registrar(Funcionario funcionario){
        this.total+=funcionario.getBonificacao();
    }

    public double getTotal() {
        return total;
    }
}
