/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Christian Gaona
 */
public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        try {
            int a = 90 / 0;
            System.out.println("The result is " + a);
            
        } catch (Exception ex) {
            System.out.println("Its not possible to divide by zero");
        }
    }
}
