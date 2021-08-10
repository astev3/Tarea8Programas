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
public class Programa8 {
    public static void main(String[] args)
    {
      double a,b,c;
      double D,R,RDOS,GT;
      Scanner Teclado = new Scanner(System.in);
      
      System.out.println("Ingrese el valor de a: ");
      a=Teclado.nextDouble();
      System.out.println("Ingrese el valor de b: ");
      b=Teclado.nextDouble();
      System.out.println("Ingrese el valor de c: ");
      c=Teclado.nextDouble();
      
      D=((Math.pow(b,2))-((4*a*c)));
      R=((-b+Math.sqrt(Math.pow(b, 2)-((4*a*c)))));
      RDOS=((-b-(Math.sqrt(Math.pow(b, 2)-((4*a*c))))));
      GT=(-((b)/(2*a)));
      
      if(D>0){
          System.out.println("x1 = " +R/(2*a));
          System.out.println("x2 = " +RDOS/(2*a));
      }else if(D==0) {
          System.out.println("x1 = " +GT);
          System.out.println("x2 = " +GT);      
      }else if(D<0){
          System.out.println("No hay solucion");
      }
      
      
    }
}
