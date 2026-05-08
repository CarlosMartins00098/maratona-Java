/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.java.introducaoclasses;

/**
 *
 * @author carlos
 */
public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 15;
        dias[0][1] = 14;
        dias[0][2] = 45;
        
        dias[1][0] = 30;
        dias[1][1] = 70;
        dias[1][2] = 160;
        
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("------------------------------");
        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
        
    }
}
