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
public class Programa2 {
    public static void main(String[] args)
    {
       int horast,s,st;
       Scanner Teclado = new Scanner(System.in);
       
       System.out.println("Ingrese horas trabajadas en la semana: ");
       horast = Teclado.nextInt();
       System.out.println("Ingrese su sueldo por hora: ");
       s = Teclado.nextInt();
       st = horast*s;
       System.out.println("Su sueldo semanal es de: " + st);
       
      
    }
}
