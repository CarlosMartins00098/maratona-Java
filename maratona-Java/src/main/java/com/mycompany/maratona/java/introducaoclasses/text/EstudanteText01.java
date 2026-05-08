/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.java.introducaoclasses.text;

import com.mycompany.maratona.java.introducao.javacore.Aintroducaoclasses.dominio.Estudante;

/**
 *
 * @author carlos
 */
public class EstudanteText01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
        
    }
}
