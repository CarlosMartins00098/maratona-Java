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
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a Comprar Bebida alcólica");
        }
        
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a Comprar Bebida alcólica");
        }
        
        
        System.out.println("Fora do if");
        
    }
}
