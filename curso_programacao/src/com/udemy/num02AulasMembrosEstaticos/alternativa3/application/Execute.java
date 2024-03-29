package com.udemy.num02AulasMembrosEstaticos.alternativa3.application;


import com.udemy.num02AulasMembrosEstaticos.alternativa3.utilitario.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = sc.nextDouble();
        double c = Calculator.circunferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

    }

}
