package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        cal.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro de CalculadoraTest04");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
