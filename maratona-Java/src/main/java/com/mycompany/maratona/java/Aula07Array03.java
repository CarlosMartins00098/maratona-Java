/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.java;

/**
 *
 * @author carlos
 */
public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int num: numeros2) {
            System.out.println(num);
        }
        
    }
}
