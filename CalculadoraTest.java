package com.company;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        assertEquals(10, Calculadora.sumar(5, 5));
        assertEquals(15, Calculadora.sumar(10, 3, 2));
        assertEquals(0, Calculadora.sumar());
    }

    @Test
    public void testRestar() {
        assertEquals(5, Calculadora.restar(10, 5));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(20, Calculadora.multiplicar(4, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, Calculadora.dividir(10, 4), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora.dividir(10, 0);
    }
}