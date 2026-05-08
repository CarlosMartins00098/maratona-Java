package com.mycompany.maratona.java.introducao.javacore.FmodificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
    public void imprime(){
        System.out.println("------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("velocidade Máxima "+ this.velocidadeMaxima);
        System.out.println("velocidade Limite "+ this.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        // this.velocidadeLimite não pode ser usado por que não tem garantia que ele exita na instancia diferente do objeto que tem a garantia de que ele vai existir
        Carro.velocidadeLimite = velocidadeLimite;
    }
    
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


    
    
    
    
    
    
    
}
