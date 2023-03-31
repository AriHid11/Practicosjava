/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicosjava;

import java.util.Scanner;


public class Ej1Guia2 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x;
        System.out.println("ingrese un numero");
        x=sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("el numero ingresado es impar");
        }
    }
}
        
    
    

