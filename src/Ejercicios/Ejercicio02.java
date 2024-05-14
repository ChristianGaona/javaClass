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
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // We declare a variable type int called value1,
        // that will be equal to what the users enters into terminal.
        System.out.println("Enter the first value:");
        int value1 = sc.nextInt();
        
        // We make another variable with the second value entered by the user
        System.out.println("Enter the second value:");
        int value2 = sc.nextInt();
        
        // Now we declare another variable that will be equal to the sum of both values
        // entered by the user.
        int result = value1 + value2;
        System.out.println("The sum of the values is: " + result);          
    }
}