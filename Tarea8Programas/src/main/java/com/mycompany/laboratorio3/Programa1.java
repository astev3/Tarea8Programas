/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
/**
 *
 * 
 */
public class Programa1 {
    public static void main(String[] args)
    {
        int n1,n2,n3,s,prom;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese la nota 1: ");
        n1=Teclado.nextInt();
        System.out.println("Ingrese la nota 2: ");
        n2=Teclado.nextInt();
        System.out.println("Ingrese la nota 3: ");
        n3=Teclado.nextInt();
        s = n1 + n2 +n3;
        prom = s/3;
        System.out.println("El promedio es : " + prom);   
       
    }
}
