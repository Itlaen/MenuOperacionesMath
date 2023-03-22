/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuoperacionesmath;

import java.util.Scanner;

/**
 *
 * @author zeta_
 */
public class MenuOperacionesMath {
static Scanner reader = new Scanner(System.in);
static int o;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    menu();
    
    
    
    
    }
    
    static void menu(){
    System.out.println("Menu");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");     
    System.out.println("3. Dividir");  
    System.out.println("4. Multiplicar");
    System.out.println("5. Salir");
    System.out.println("Elija opcion:");
    o = reader.nextInt();
    switch(o) {
        case 1:
            suma();
                break;
        case 2:
            resta();
                break;
        case 3:
            dividir();
                break;
        case 4:
            multiplicar();
                break;
        case 5:
            salir();
                break;
        default:
            System.out.println("Opcion no valida");
            menu();
    }
    }

    static void suma(){
           int n, n1, s;
           
           System.out.println("Bienvenido al Metodo Suma");
           System.out.println("Ingrese el primer numero a sumar");
           n = reader.nextInt();
           System.out.println("Ingrese el segundo numero");
           n1 = reader.nextInt();
           
           s = n + n1;
           
           System.out.println("El resultado de su suma es: " + s);
           
           menu();
    }
    static void resta() {
        int n, n1, r;
           
           System.out.println("Bienvenido al Metodo Resta");
           System.out.println("Ingrese el primer numero a restar");
           n = reader.nextInt();
           System.out.println("Ingrese el segundo numero");
           n1 = reader.nextInt();
           
           r = n - n1;
           
           System.out.println("El resultado de su resta es: " + r);
           
           menu();
    }
    
    static void dividir() {
        int n, n1, d;
           
         System.out.println("Bienvenido al Metodo Dividir");
           System.out.println("Ingrese el dividendo");
           n = reader.nextInt();
           System.out.println("Ingrese divisor");
           n1 = reader.nextInt();
           
           d = n / n1;
           
           System.out.println("El cociente de su division es: " + d);
           
           menu();
        
    }
    
    static void multiplicar() {
        int n, n1, m;
           
           System.out.println("Bienvenido al Metodo Multiplicar");
           System.out.println("Ingrese el numero a multiplicar");
           n = reader.nextInt();
           System.out.println("Ingrese por cuanto desea hacerlo");
           n1 = reader.nextInt();
           
           m = n * n1;
           
           System.out.println("El producto de su multoplicacion es: " + m);
           
           menu();
        
    }

    static void salir() {
    String op;
    Scanner r = new Scanner(System.in);
            
    System.out.println("Seguro que desea salir? (S/N)");
    op = r.nextLine();
    
    
   if(op.equalsIgnoreCase("n")){ 
       menu();
               }else{
       System.out.println("Gracias por utilizar nuestra aplicacion");
   }
    
    }
}