package com.ada.projetooo;

public class ControleBonificacao {

    private double total;

//    public void registrar(Funcionario funcionario){
//        this.total+=funcionario.getBonificacao();
//    }

    public void registrar(Object object){

        if (object instanceof Funcionario) {

            System.out.println(object);
            Funcionario funcionario = (Funcionario) object;
            this.total+=funcionario.getBonificacao();
        }
    }

    public double getTotal() {
        return total;
    }
}
