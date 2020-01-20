package katas.romannumeral;

import org.junit.Assert;
import org.junit.Test;

//
public class EntryTest {

    @Test
    public void Arabic_to_Roman_Positive() {
        Assert.assertEquals("I", RomanNumerals.arabicToRoman(1));
        Assert.assertEquals("I", RomanNumerals.arabicToRoman(1));
        Assert.assertEquals("II", RomanNumerals.arabicToRoman(2));
        Assert.assertEquals("III", RomanNumerals.arabicToRoman(3));
        Assert.assertEquals("IV", RomanNumerals.arabicToRoman(4));
        Assert.assertEquals("6", "VI", RomanNumerals.arabicToRoman(6));
        Assert.assertEquals("90", "XC", RomanNumerals.arabicToRoman(90));
        Assert.assertEquals("99", "XCIX", RomanNumerals.arabicToRoman(99));
        Assert.assertEquals("999", "CMXCIX", RomanNumerals.arabicToRoman(999));
        Assert.assertEquals("1000", "M", RomanNumerals.arabicToRoman(1000));
        Assert.assertEquals("1999", "MCMXCIX", RomanNumerals.arabicToRoman(1999));
    }

    @Test
    public void Arabic_to_Roman_Negative() {
        Assert.assertNotEquals("6", "IV", RomanNumerals.arabicToRoman(6));

    }

}