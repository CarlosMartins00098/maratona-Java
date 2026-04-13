package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salario = new double[3];
    private double media;
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (this.salario != null) {
            System.out.println("Salário¹ R$:" + this.salario[0]);
            System.out.println("Salário² R$:" + this.salario[1]);
            System.out.println("Salário³ R$:" + this.salario[2]);
        }
        media();
    }
    public void media(){// imprime uma média dos 3 salários
        double media = 0;
        if (this.salario != null) {
            for (double num: this.salario) {
                media += num;
            }
            media /= this.salario.length;
        }
        System.out.println("a média salárial é: "+media);
        
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    
}
