package com.ten10.training;

public class Strings {

  /**
   * Returns the given String in reverse.
   * @param input - The String to be reversed.
   * @return The reversed String.
   */
  public String reverseString(String input) {
    StringBuilder newString = new StringBuilder();

    char[] chars = input.toCharArray();

    for (int i = chars.length - 1; i > 0; i--) {
      newString.append(chars[i]);
    }

    return newString.toString();
  }

  /**
   * Checks whether a given String is a palindrome (same forwards as backwards, e.g. hannah).
   * @param input - The String to be checked.
   * @return True if it is a palindrome, false otherwise.
   */
  public boolean isPalindrome(String input) {
    return input.equals(reverseString(input));
  }

  /**
   * Transforms an array of chars into a String.
   * @param chars - The char array to be transformed.
   * @return A String of the char array.
   */
  public String charsToString(char[] chars) {
    return String.copyValueOf(chars);
  }

  /**
   * Transforms a given String into an array of chars.
   * @param input - The String to be transformed.
   * @return An array of chars from the String.
   */
  public char[] stringToChars(String input) {
    return input.toCharArray();
  }

  /**
   * Combines the given series of elements together, separated by the delimiter.
   * @param delimiter - The character or word used to separate the elements.
   * @param elements - A series of elements to combine.
   * @return A combination of the elements, separated by the delimiter.
   */
  public String join(String delimiter, String... elements) {
    return String.join(delimiter, elements);
  }

  /**
   * Splits the given String into an array, with each element determined by the position of a delimiter.
   * @param delimiter - The delimiter present in the input.
   * @param input - The String containing elements to separate.
   * @return An array of elements.
   */
  public String[] split(String delimiter, String input) {
    return input.split(delimiter);
  }
}
