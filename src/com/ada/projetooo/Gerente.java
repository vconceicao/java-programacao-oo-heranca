package com.ada.projetooo;

public class Gerente extends Funcionario{


    private String senha;

    public boolean autentica(String senha){
        if (this.senha.equals(senha)){
            System.out.println("Acesso permitido");
            return true;
        }else {
            System.out.println("Acesso negado");
            return false;
        }


    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
}
