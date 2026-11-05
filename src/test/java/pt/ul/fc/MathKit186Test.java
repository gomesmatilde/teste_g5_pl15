package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class MathKit186Test {

    @Test
    void loudWorks() {
        assertEquals("HELLO", MathKit186.loud("hello"));
        assertEquals("ABC", MathKit186.loud("aBc"));
    }

    @Test
    void positiveWorks() {
        assertTrue(MathKit186.positive(3));
        assertFalse(MathKit186.positive(-3));
        assertFalse(MathKit186.positive(0));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 3, MathKit186.multiply(5));
        assertEquals(0, MathKit186.multiply(0));
    }

    @Test
    void magnitudeworks() {
        assertEquals(5, MathKit186.magnitude(-5));
        assertEquals(9, MathKit186.magnitude(-9));
        assertEquals(0, MathKit186.magnitude(0));
    }

    @Test
    void pickMaxworks() {
        assertEquals(0, MathKit186.pickMax(0, -2));
        assertEquals(9, MathKit186.pickMax(9, -2));
        assertEquals(-2, MathKit186.pickMax(-7, -2));
    }
}
