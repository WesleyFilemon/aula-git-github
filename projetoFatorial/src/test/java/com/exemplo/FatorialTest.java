package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FatorialTest {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcularFatorial(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcularFatorial(1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcularFatorial(5));
    }

    @Test
    public void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcularFatorial(10));
    }

    @Test
    public void testFatorialDeNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Fatorial.calcularFatorial(-1));
    }
}