/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Christian Gaona
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        int age = 4;
        Integer quantity = 7;
        
        int result = age + quantity;
        System.out.println(age + quantity);
        
        short a = 3;
        Short b = 5;
        
        Double kiloPrice = 90.3;
        
        boolean isValid = true;
        
        try {
            // Try to do whats in this block
            // int a = 5 / 0;
            
        } catch (Exception ex) {
            // If you cant, do this another
            System.out.println("It cant be divided by zero");
        }
    }
}
