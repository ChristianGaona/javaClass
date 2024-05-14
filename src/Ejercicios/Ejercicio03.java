/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Christian Gaona
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first value:");
        double value1 = sc.nextDouble();
        
        System.out.println("Enter the second value:");
        double value2 = sc.nextDouble();
        
        double result = value1 / value2;
        System.out.println("The result is " + result);
    }
}