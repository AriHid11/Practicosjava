
package Clases_y_Objetos;
import java.util.*;
public class Main {
  
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int num; 
     boolean longitud= true;
     int c=1;
        System.out.println("cargar el numero a definir");
     num=sc.nextInt();
     while(longitud){
        if(num/10!=0){
            num= num/10;
            c++;
        }else{
            longitud=false;
        }
    }
        System.out.println("El numero ingresado tiene una longitud de: "+c);
    }
}