package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CaladoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double res = calculadora.divideDoisNumeros(20, 0);
        System.out.println(res);
    }
}
