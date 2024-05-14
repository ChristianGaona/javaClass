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
public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte age = sc.nextByte();
        
        if(age >= 18){
            System.out.println("You are of legal age"); 
        } else{
            System.out.println("You are a minor");
        }
    }
}
