package com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.text;

import com.mycompany.maratona.java.introducao.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        //pessoa.imprime();
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
