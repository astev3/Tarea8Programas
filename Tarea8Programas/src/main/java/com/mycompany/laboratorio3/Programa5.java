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
public class Programa5 {
    public static void main(String[] args)
    {
        int nparti,parcial1,parcial2,examenf;
        double p1,p2,p3,p4,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de participacion: ");
        nparti=Teclado.nextInt();
        System.out.println("Ingrese la nota del primer parcial: ");
        parcial1=Teclado.nextInt();
        System.out.println("Ingrese la nota del segundo parcial: ");
        parcial2=Teclado.nextInt();
        System.out.println("Ingrese la nota del examen final: ");
        examenf=Teclado.nextInt();
        p1=nparti*0.1;
        p2=parcial1*0.25;
        p3=parcial2*0.25;
        p4=examenf*0.4;
        total=p1+p2+p3+p4;
        System.out.println("La nota final es de:" + total);
        
       
    }
}
