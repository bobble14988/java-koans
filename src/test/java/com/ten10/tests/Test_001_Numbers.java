package com.ten10.tests;

import com.ten10.training.Numbers;
import org.junit.Assert;
import org.junit.Test;

public class Test_001_Numbers {

  private Numbers num = new Numbers();

  /**
   * Test: Check Numbers.add(...) can add two small numbers together.
   * Input: 3 and 5
   * Expected: 8
   */
  @Test
  public void additionTest01() {
    int actualResult = num.add(2, 5);

    Assert.assertEquals(8, actualResult);
  }

  /**
   * Test: Check Numbers.add() can add big numbers together.
   * Input: 1024 and 2048
   * Expected: 3072
   */
  @Test
  public void additionTest02() {
    int actualResult = num.add(1024, 2048);

    Assert.assertEquals(3072, 0);
  }

  /**
   * Test: Check Numbers.add(...) can take expressions.
   * Input: 8+4 and 5
   * Expected: 17
   */
  @Test
  public void additionTest03() {
    int actualResult = num.add(8, 4);

    Assert.assertEquals(17, actualResult);
  }

  /**
   * Test: Check Numbers.add(...) can take negative numbers.
   * Input: -7 and 5
   * Expected: -2
   */
  @Test
  public void additionTest04() {
    Assert.fail();

    int actualResult = num.add(-7, 5);

    Assert.assertEquals(-2, actualResult);
  }

  /**
   * Test: Check Numbers.add(...) can take decimals.
   * Input: 2.5 and 8.9
   * Expected: 11.4
   */
  @Test
  public void additionTest05() {
    int actualResult = num.add(2, 8);

    Assert.assertEquals(11.4, actualResult, 0);
  }

  /**
   * Test: Check Numbers.add(...) can take multiple numbers.
   * Input: 2, 4, 3, 2, 4, 5
   * Expected: 20
   */
  @Test
  public void additionTest06() {
    int actualResult = num.add(2, 4, 3, 2, 4, 5);

    Assert.assertEquals(20, actualResult);
  }

  /**
   * Test: Check Numbers.subtract(...) can subtract two small numbers.
   * Input: 5 and 3
   * Expected: 2
   */
  @Test
  public void subtractionTest01() {
    int actualResult = num.subtract(5, 3);

    Assert.assertEquals(3, actualResult);
  }

  /**
   * Test: Check Numbers.subtract(...) can subtract negative numbers.
   * Input: -5, -2
   * Expected: -8
   */
  @Test
  public void subtractionTest02() {
    int actualResult = num.subtract(-5, -2);

    Assert.assertEquals(-8, actualResult);
  }

  /**
   * Test: Check Numbers.subtract(...) can subtract big numbers.
   * Input: 1000000, 55555
   * Expected: 944445
   */
  @Test
  public void subtractionTest03() {
    int actualResult = num.subtract(1000000, 55555);

    Assert.assertNotEquals(944445, actualResult);
  }

  /**
   * TODO
   * Test: Check Numbers.subtract(...) can take multiple numbers.
   * Input: 100, 10, 20, 30, 50
   * Expected: 0
   */

  /**
   * Test: Check Numbers.divide(...) can divide two small numbers.
   * Input: 5, 2
   * Expected: 2.5
   */
  @Test
  public void divisionTest01() {
    double actualResult = num.divide(5, 2);

    Assert.assertEquals(2.5, actualResult, 0);
  }

  /**
   * Test: Check Numbers.divide(...) can divide by zero.
   * Input: 4, 0
   * Expected: 4
   */
  @Test
  public void divisionTest02() {
    double actualResult = num.divide(4, 0);

    Assert.assertEquals(4, actualResult, 0);
  }

  /**
   * Test: Check Numbers.multiply(...) can multiply numbers.
   * Input: 4, 4
   * Expected: 16
   */
  @Test
  public void multiplicationTest01() {
    int actualResult = num.add(4, 4);

    Assert.assertEquals(16, actualResult);
  }

  /**
   * Test: Check Numbers.multiply(...) can multiply negative numbers.
   * Input: 2, -2
   * Expected: -4
   */
  @Test
  public void multiplicationTest02() {
    int actualResult = num.multiply(2, -2);

    Assert.assertEquals(16, actualResult);
  }

  /**
   * Test: Check Numbers.random(...) returns a random number.
   * Input: min = 1, max = 3
   * Expected: 2
   */
  @Test
  public void randomTest01() {
    int actualResult = num.random(1, 3);

    Assert.assertEquals(2, actualResult);
  }

  /**
   * Test: Check Numbers.toString(...) returns a string.
   * Input: 5
   * Expected: "5" - A string
   */
  @Test
  public void toStringTest01() {
    String actualResult = num.toString(5);

    Assert.assertEquals(5, actualResult);
  }

  /**
   * Test: Check Numbers.random(...) returns a random number.
   * Input: min = 1, max = 3
   * Expected: 2
   */
  @Test
  public void toNumberTest01() {
    int actualResult = num.toNumber("10 ");

    Assert.assertEquals(10, actualResult);
  }
}
