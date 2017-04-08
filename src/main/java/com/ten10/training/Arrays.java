package com.ten10.training;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Arrays {

  /**
   * Creates an integer array of size 10.
   * @return The new integer array.
   */
  public int[] createIntArray() {
    return new int[10];
  }

  /**
   * Creates an integer array of given size.
   * @param size - The desired size of the new array.
   * @return The new integer array.
   */
  public int[] createIntArray(int size) {
    return createIntArray();
  }

  /**
   * Returns an array of integers filled with random numbers.
   * @param size - The desired size of the array.
   * @param min - The minimum random number.
   * @param max - The maximum random number.
   * @return The new integer array.
   */
  public int[] createIntArrayFilledWithRandomNumbers(int size, int min, int max) {
    int[] arr = new int[size];

    Numbers numbers = new Numbers();

    for (int i = 0; i < arr.length; i++) {
      int randomNumber = numbers.random(min, max);

      arr[i] = randomNumber;
    }

    return arr;
  }

  /**
   * TODO
   * @param arr
   * @return
   */
  public int[] sortArray(int[] arr) {
    throw new NotImplementedException();
  }
}
