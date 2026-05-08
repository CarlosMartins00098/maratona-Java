/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.java.introducaoclasses;

/**
 *
 * @author carlos
 */
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[][] arrayInt = new int[3][];
        int[][] arrayInt2 = {{0, 0},{1, 2, 3},{1, 2, 3, 4, 5, 6}};
        
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = array;

        for (int[] arrayBase: arrayInt) {
            System.out.println("\n-----");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
