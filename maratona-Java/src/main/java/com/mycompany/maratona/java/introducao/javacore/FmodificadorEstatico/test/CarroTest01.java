package com.mycompany.maratona.java.introducao.javacore.FmodificadorEstatico.test;

import com.mycompany.maratona.java.introducao.javacore.FmodificadorEstatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi",290);
        Carro.setVelocidadeLimite(160); // o metodo static afeta todos os objetos de forma iqual
        c1.imprime();
        c2.imprime();
        c3.imprime();
        
    }
}
