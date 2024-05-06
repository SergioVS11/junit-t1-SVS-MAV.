package com.company;

public class Calculadora {
    public static int sumar(int... operandos) {
        int resultado = 0;
        for (int operando : operandos) {
            resultado += operando;
        }
        return resultado;
    }

    public static int restar(int operando1, int operando2) {
        return operando1 - operando2;
    }

    public static int multiplicar(int operando1, int operando2) {
        return operando1 * operando2;
    }

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
}