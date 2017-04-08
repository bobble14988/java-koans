package com.ten10.tests;

import com.ten10.training.Strings;
import org.junit.Assert;
import org.junit.Test;

public class Test_002_Strings {

  private Strings strings = new Strings();

  /**
   * Test: Check whether Strings.reverseString reverses a given string.
   * Input: Hello, World!
   * Expected: !dlroW ,olleH
   */
  @Test
  public void stringTest01() {
    String actualResult = strings.reverseString("Hello, World!");

    Assert.assertEquals("!dlroW ,olleH", actualResult);
  }

  /**
   * Test: Check whether Strings.isPalindrome can detect a palindrome.
   * Input: Hannah
   * Expected: true
   */
  @Test
  public void stringTest02() {
    boolean actualResult = strings.isPalindrome("Hannah");

    Assert.assertTrue(actualResult);
  }

  /**
   * Test: Check whether Strings.charsToString works successfully.
   * Input: Array containing T, e, n, 1, 0, A, c, a, d, e, m, y
   * Expected: The string Ten10
   */
  @Test
  public void stringTest03() {
    String actualResult = strings.charsToString(new char[] {'T', 'e', 'n', '1', '0', 'A', 'c', 'a', 'd', 'e', 'm', 'y'});

    Assert.assertEquals("Ten10 Academy", actualResult);
  }

  /**
   * TODO
   * Test: Check whether Strings.stringToChars works successfully.
   * Input: Ten10
   * Expected: An array containing T, e, n, 1, 0
   */

  /**
   * TODO
   * Test: Check whether Strings.join works successfully.
   * Input: Delimiter = - (a hyphen). Elements = Stan,Carl,Eric,Kenny
   * Expected: The string Stan-Carl-Eric-Kenny
   */

  /**
   * TODO
   * Test: Check whether Strings.split works successfully.
   * Input: Delimiter = , (a comma). Input = Stewie,Lois,Peter,Meg,Chris,Brian
   * Expected: An array containing the elements from the input string.
   */
}