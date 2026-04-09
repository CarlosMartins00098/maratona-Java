package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.nome = "Carlos";
        funcionario.idade = 22;
        funcionario.salario[0] = 50;
        funcionario.salario[1] = 70;
        funcionario.salario[2] = 1650;
        
        funcionario.imprimir();
        
    }
}
