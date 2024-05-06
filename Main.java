package com.company;

public class Main {
    public static void main(String[] args) {
        int suma = Calculadora.sumar(5, 3, 2); // Ejemplo de suma con múltiples operandos
        int resta = Calculadora.restar(10, 4);
        int multiplicacion = Calculadora.multiplicar(6, 2);
        double division = Calculadora.dividir(10, 2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
