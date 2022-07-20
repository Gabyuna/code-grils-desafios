package br.com.dio.calcdois;


public class Calcdois {

    public static void soma(double numero1, double numero2) {

        double result = numero1 + numero2;

        System.out.println("A soma de " + numero1 + "mais" + numero2 + "é: " + result);
    }
    public static void sub(double numero1, double numero2) {

        double result = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + "menos" + numero2 + "é: " + result);
    }
    public static void mult(double numero1, double numero2) {

        double result = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + "menos" + numero2 + "é: " + result);
    }
    public static void div(double numero1, double numero2) {

        double result = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + "menos" + numero2 + "é: " + result);
    }
}