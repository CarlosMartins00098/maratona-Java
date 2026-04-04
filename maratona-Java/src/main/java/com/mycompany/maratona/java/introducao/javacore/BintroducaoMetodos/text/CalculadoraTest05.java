package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);
        
        
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
        
    }
}
