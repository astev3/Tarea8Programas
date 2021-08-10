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
public class Programa4 {
    public static void main(String[] args)
    {
        int cantidad, monto;
        double c, s;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidada de carros vendidos: ");
        cantidad = Teclado.nextInt();
        System.out.println("Ingrese el monto : ");
        monto = Teclado.nextInt();
        c = monto * 0.05;
        s = 1000 + (150 * cantidad) + c;
        System.out.println("El salario es de: " + s);
        
    }
}
