package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Carlos");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[]{50, 70,1650});
        funcionario.imprimir();
        System.out.println("média: "+funcionario.getMedia());
        
    }
}
