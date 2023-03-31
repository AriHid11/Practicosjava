/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicosjava.guia2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej3Guia2 {


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      String mensaje;
      int longitud;
      mensaje=sc.next();
      longitud=mensaje.length();
        if (longitud==8) {
            System.out.println("correcto");
        }else{
            System.out.println("incorecto");
        }
    }
}
    

