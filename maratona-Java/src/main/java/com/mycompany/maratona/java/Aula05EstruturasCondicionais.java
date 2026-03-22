/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.java;

/**
 *
 * @author carlos
 */
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 45;
        
        if(idade < 15){
            System.out.println("Categoria Infantil");
        } else if(idade >=15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else if(idade >18){
            System.out.println("Categoria Adulto");
        } else  {
            System.out.println("erro");
        }
        
        
        System.out.println("Fora do if");
        
    }
}
