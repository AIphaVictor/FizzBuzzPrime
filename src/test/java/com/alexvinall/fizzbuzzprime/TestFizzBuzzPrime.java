package com.alexvinall.fizzbuzzprime;

import static org.mockito.Mockito.mock;

import java.io.PrintStream;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/**
 * Test class for {@link FizzBuzzPrime}.
 *
 * @author Alex Vinall 2016
 */
public class TestFizzBuzzPrime {

  @Test
  public void testFizzBuzzPrime() {
    // Given
    PrintStream printStream = mock(PrintStream.class);
    System.setOut(printStream);

    // When
    FizzBuzzPrime.main(new String[]{});

    // Then
    InOrder inOrder = Mockito.inOrder(printStream);
    inOrder.verify(printStream).println("1: ");
    inOrder.verify(printStream).println("2: prime");
    inOrder.verify(printStream).println("3: fizzprime");
    inOrder.verify(printStream).println("4: ");
    inOrder.verify(printStream).println("5: buzzprime");
    inOrder.verify(printStream).println("6: fizz");
    inOrder.verify(printStream).println("7: prime");
    inOrder.verify(printStream).println("8: ");
    inOrder.verify(printStream).println("9: fizz");
    inOrder.verify(printStream).println("10: buzz");
    inOrder.verify(printStream).println("11: prime");
    inOrder.verify(printStream).println("12: fizz");
    inOrder.verify(printStream).println("13: prime");
    inOrder.verify(printStream).println("14: ");
    inOrder.verify(printStream).println("15: fizzbuzz");
    inOrder.verify(printStream).println("16: ");
    inOrder.verify(printStream).println("17: prime");
    inOrder.verify(printStream).println("18: fizz");
    inOrder.verify(printStream).println("19: prime");
    inOrder.verify(printStream).println("20: buzz");
    inOrder.verify(printStream).println("21: fizz");
    inOrder.verify(printStream).println("22: ");
    inOrder.verify(printStream).println("23: prime");
    inOrder.verify(printStream).println("24: fizz");
    inOrder.verify(printStream).println("25: buzz");
    inOrder.verify(printStream).println("26: ");
    inOrder.verify(printStream).println("27: fizz");
    inOrder.verify(printStream).println("28: ");
    inOrder.verify(printStream).println("29: prime");
    inOrder.verify(printStream).println("30: fizzbuzz");
    inOrder.verify(printStream).println("31: prime");
    inOrder.verify(printStream).println("32: ");
    inOrder.verify(printStream).println("33: fizz");
    inOrder.verify(printStream).println("34: ");
    inOrder.verify(printStream).println("35: buzz");
    inOrder.verify(printStream).println("36: fizz");
    inOrder.verify(printStream).println("37: prime");
    inOrder.verify(printStream).println("38: ");
    inOrder.verify(printStream).println("39: fizz");
    inOrder.verify(printStream).println("40: buzz");
    inOrder.verify(printStream).println("41: prime");
    inOrder.verify(printStream).println("42: fizz");
    inOrder.verify(printStream).println("43: prime");
    inOrder.verify(printStream).println("44: ");
    inOrder.verify(printStream).println("45: fizzbuzz");
    inOrder.verify(printStream).println("46: ");
    inOrder.verify(printStream).println("47: prime");
    inOrder.verify(printStream).println("48: fizz");
    inOrder.verify(printStream).println("49: ");
    inOrder.verify(printStream).println("50: buzz");
    inOrder.verify(printStream).println("51: fizz");
    inOrder.verify(printStream).println("52: ");
    inOrder.verify(printStream).println("53: prime");
    inOrder.verify(printStream).println("54: fizz");
    inOrder.verify(printStream).println("55: buzz");
    inOrder.verify(printStream).println("56: ");
    inOrder.verify(printStream).println("57: fizz");
    inOrder.verify(printStream).println("58: ");
    inOrder.verify(printStream).println("59: prime");
    inOrder.verify(printStream).println("60: fizzbuzz");
    inOrder.verify(printStream).println("61: prime");
    inOrder.verify(printStream).println("62: ");
    inOrder.verify(printStream).println("63: fizz");
    inOrder.verify(printStream).println("64: ");
    inOrder.verify(printStream).println("65: buzz");
    inOrder.verify(printStream).println("66: fizz");
    inOrder.verify(printStream).println("67: prime");
    inOrder.verify(printStream).println("68: ");
    inOrder.verify(printStream).println("69: fizz");
    inOrder.verify(printStream).println("70: buzz");
    inOrder.verify(printStream).println("71: prime");
    inOrder.verify(printStream).println("72: fizz");
    inOrder.verify(printStream).println("73: prime");
    inOrder.verify(printStream).println("74: ");
    inOrder.verify(printStream).println("75: fizzbuzz");
    inOrder.verify(printStream).println("76: ");
    inOrder.verify(printStream).println("77: ");
    inOrder.verify(printStream).println("78: fizz");
    inOrder.verify(printStream).println("79: prime");
    inOrder.verify(printStream).println("80: buzz");
    inOrder.verify(printStream).println("81: fizz");
    inOrder.verify(printStream).println("82: ");
    inOrder.verify(printStream).println("83: prime");
    inOrder.verify(printStream).println("84: fizz");
    inOrder.verify(printStream).println("85: buzz");
    inOrder.verify(printStream).println("86: ");
    inOrder.verify(printStream).println("87: fizz");
    inOrder.verify(printStream).println("88: ");
    inOrder.verify(printStream).println("89: prime");
    inOrder.verify(printStream).println("90: fizzbuzz");
    inOrder.verify(printStream).println("91: ");
    inOrder.verify(printStream).println("92: ");
    inOrder.verify(printStream).println("93: fizz");
    inOrder.verify(printStream).println("94: ");
    inOrder.verify(printStream).println("95: buzz");
    inOrder.verify(printStream).println("96: fizz");
    inOrder.verify(printStream).println("97: prime");
    inOrder.verify(printStream).println("98: ");
    inOrder.verify(printStream).println("99: fizz");
    inOrder.verify(printStream).println("100: buzz");
  }
}
