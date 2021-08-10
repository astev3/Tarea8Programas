/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;

/**
 *
 
 */
public class Programa6 {
    public static void main(String[] args)
    {
        double a,b,tot;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A: ");
        a=Teclado.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b=Teclado.nextInt();
        tot=Math.pow(a,2)+ Math.pow(b,2) + (2*a*b);
        System.out.println("El resultado es: " + tot);
        
        
    }
}
