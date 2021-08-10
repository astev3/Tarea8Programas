/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;


public class Programa7 {
    public static void main(String[] args)
    {
       int th,semana,dias,horas;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("Ingrese el total de horas");
       th=Teclado.nextInt();
       semana=th/(24*7);
       dias=th % (24*7)/24;
       horas=th % 24;
       System.out.println("las horas totales son: " + semana + " semanas " + dias + " dias y " + horas + " horas");
       
    }
}
