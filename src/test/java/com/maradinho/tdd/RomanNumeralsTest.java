package com.maradinho.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    @Before
    public void setup() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testOneRoman() {
        String roman = romanNumerals.toRoman(1);
        assertEquals("I", roman);
    }

    @Test
    public void testTwoRoman() {
        String roman = romanNumerals.toRoman(2);
        assertEquals("II", roman);
    }

    @Test
    public void testThreeRoman() {
        String roman = romanNumerals.toRoman(3);
        assertEquals("III", roman);
    }

    @Test
    public void testFourRoman() {
        String roman = romanNumerals.toRoman(4);
        assertEquals("IV", roman);
    }

    @Test
    public void testFiveRoman() {
        String roman = romanNumerals.toRoman(5);
        assertEquals("V", roman);
    }

    @Test
    public void testSixRoman() {
        String roman = romanNumerals.toRoman(6);
        assertEquals("VI", roman);
    }
}
