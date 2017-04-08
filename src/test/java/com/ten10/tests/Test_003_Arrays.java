package com.ten10.tests;

import com.ten10.training.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Test_003_Arrays {

  private Arrays arrays = new Arrays();

  /**
   * TODO
   * Test: Check that Arrays.createIntArray returns an array of the correct size.
   * Input: n/a
   * Expected: An array of size 10
   */

  /**
   * TODO
   * Test: Check that Arrays.createIntArray returns an array of the given size.
   * Input: size = 5
   * Expected: An array of size 5
   */

  /**
   * Test: Check that Arrays.createIntArrayFilledWithRandomNumbers works as expected.
   * Input: size = 10, min = 1, max = 100
   * Expected: An array of random numbers between 1 and 100.
   */
  @Test
  public void arraysTest03() {
    int[] actualResult = arrays.createIntArrayFilledWithRandomNumbers(10, 1, 100);

    // TODO - What do we do next?
    Assert.fail();
  }

  /**
   * Test: Check that Arrays.sortArray works as expected.
   * Input: array = { 2, 13, 11, 7, 3, 5 }
   * Expected: An array containing { 2, 3, 5, 7, 11, 13 }
   */
  @Test
  public void arraysTest04() {
    int[] input = new int[] {2, 13, 11, 7, 3, 5};

    int[] actualResult = arrays.sortArray(input);

    // TODO - What do we do next?
  }

}
