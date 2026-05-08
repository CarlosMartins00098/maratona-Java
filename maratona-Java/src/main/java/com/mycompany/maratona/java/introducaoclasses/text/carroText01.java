package com.mycompany.maratona.java.introducaoclasses.text;

import com.mycompany.maratona.java.introducao.javacore.Aintroducaoclasses.dominio.Carro;

public class carroText01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1.Nome = "carro";
        carro1.Modelo = "corrola";
        carro1.ano = 2013;
        
        carro2.Nome = "fusca";
        carro2.Modelo = "Sport";
        carro2.ano = 1969;
        
        carro1 = carro2;
        
        System.out.println("o nome "+carro1.Nome +" do modelo "+carro1.Modelo+" do ano "+carro1.ano);
        System.out.println("o nome "+carro2.Nome +" do modelo "+carro2.Modelo+" do ano "+carro2.ano);
    }
}
