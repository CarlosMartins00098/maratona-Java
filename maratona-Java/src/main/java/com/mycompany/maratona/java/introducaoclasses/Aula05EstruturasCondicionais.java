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
        double salario = 70000;
        double taxa;
        
        if (salario < 34713) {
            taxa = salario * 0.0970; 
        } else if (salario >= 34713 && salario <= 68508){
            taxa = salario * 0.3735;
        } else {
            taxa = salario * 0.4950;
        }
        
        System.out.println("o salário é "+salario+": e a taxa è "+taxa);
    
        
    }
}
