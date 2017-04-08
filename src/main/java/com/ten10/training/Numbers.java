package com.ten10.training;

public class Numbers {

  /**
   * Adds two numbers together and returns the result.
   * @param a - The first number.
   * @param b - The second number.
   * @return The result of the addition.
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * Adds multiple numbers to a number and returns the result;
   * @param a - The first number.
   * @param b - An array of subsequent numbers.
   * @return The result of the addition.
   */
  public int add(int a, int... b) {
    int result = a;

    for (int i = 0; i < b.length; i++) {
      result = result + i;
    }

    return result;
  }

  /**
   * Subtracts one number from another and returns the result.
   * @param a - The first number.
   * @param b - The number to be subtracted.
   * @return The result of the subtraction.
   */
  public int subtract(int a, int b) {
    return a - b;
  }

  /**
   * Subtracts multiple numbers from a number and returns the result.
   * @param a - The first number.
   * @param b - An array of subsequent numbers to subtract.
   * @return The result of the subtraction.
   */
  public int subtract(int a, int... b) {
    int result = a;

    for (int i = 0; i < b.length; i++) {
      result -= b[i];
    }

    return result;
  }

  /**
   * Divides one number from another and returns the result.
   * @param a - The numerator.
   * @param b - The denominator.
   * @return The result of the division.
   */
  public double divide(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }

  /**
   * Multiplies two numbers together and returns the result;
   * @param a - The first number.
   * @param b - The second number.
   * @return The result of the multiplication.
   */
  public int multiply(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("No negative numbers, thanks!");
    }

    return a * b;
  }

  /**
   * Applies a coefficient to a number and returns the result.
   * @param a - The number the coefficient will be applied to.
   * @param b - The coefficient.
   * @return The result of the multiplication.
   */
  public double power(int a, int b) {
    return Math.pow(a, b);
  }

  /**
   * Obtains a random number between a min and max value and returns the result.
   * @param min - The minimum number allowed to be returned.
   * @param max - The maximum number allowed to be returned.
   * @return The random number.
   */
  public int random(int min, int max) {
    return (int)((Math.random() * max) + min);
  }

  /**
   * Returns the given number as a String.
   * @param a - The number.
   * @return The given number as a String.
   */
  public String toString(int a) {
    return Integer.toString(a);
  }

  /**
   * Parses a given String to a number.
   * @param a - The number as a string.
   * @return The number as an int.
   */
  public int toNumber(String a) {
    return Integer.parseInt(a);
  }
}
