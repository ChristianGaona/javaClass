/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Christian Gaona
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a = 10;
        //String name = "Christian"
        System.out.println("Write your name:");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome, " + name);
        
        System.out.println("Write your age:");
        int age = sc.nextInt();
        
        System.out.println("Hello " + name + ", your age is: " + age + " years old");
    }
}
