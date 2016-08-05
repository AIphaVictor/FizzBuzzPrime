package com.alexvinall.fizzbuzzprime;

import static java.lang.String.valueOf;

/**
 * Much like a regular fizzbuzz solution, this
 * program prints "fizz" and "buzz" to standard
 * out to indicate multiples of 3 and 5.
 * <p>
 * However, it also prints out "prime" in
 * cases where the number is prime.
 * <p>
 * The number 3 is "fizzprime", and the number 5
 * is "buzzprime", but no number can be "fizzbuzzprime".
 *
 * @author Alex Vinall 2016
 */
public class FizzBuzzPrime {


  /**
   * Prints the output to standard out.
   *
   * @param args
   */
  public static void main(String[] args) {

    int max = 100;

    for (int i = 1; i <= max ; i++) {
      String s = valueOf(i).concat(": ");
      if (i % 3 == 0) s = s.concat("fizz");
      if (i % 5 == 0) s = s.concat("buzz");
      if (isPrime(i)) s = s.concat("prime");
      System.out.println(s);
    }
  }


  private static boolean isPrime(int num) {
    if (num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    for (int i = 3; i * i <= num; i += 2)
        if (num % i == 0) return false;
    return true;
  }
}