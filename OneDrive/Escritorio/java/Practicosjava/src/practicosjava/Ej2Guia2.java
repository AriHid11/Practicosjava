/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicosjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej2Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      String mensaje;
      mensaje=sc.next();
        if (mensaje.equalsIgnoreCase("eureka")) {
            System.out.println("correcto");
        }else{
            System.out.println("incorecto");
        }
    }
}

    
    

