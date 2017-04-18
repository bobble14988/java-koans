package com.ten10.tests;

import com.ten10.training.objects.Superhero;
import com.ten10.training.objects.Villain;
import org.junit.Assert;
import org.junit.Test;

public class Test_004_Objects {

  /**
   * Test: Test that we can create a Superhero.
   * Input: Superman, Clark Kent, (Lex Luthor, 6), 10
   * Expected: Suprthero.getName() method returns 'Superman'.
   */
  @Test
  public void SuperheroTest01() {
    Superhero superman = new Superhero("Superman", "Clark Kent", new Villain("Lex Luthor", 6), 10);

    Assert.assertEquals("Superman", superman);
  }

  /**
   * Test: Test that Batman can save the day against Joker.
   * Input: Batman, Bruce Wayne, (The Joker, 6), 8
   * Expected: Result of Superhero.savedTheDay is true.
   */
  @Test
  public void SuperheroTest02() {
    Assert.fail("TODO");
  }

  /**
   * Test: Test that Hawk Eye cannot save the day against Hulk.
   * Input: Hawk Eye, [can't remember], (The Hulk, 11), 4
   * Expected: Result of Superhero.savedTheDay is false.
   */
  @Test
  public void SuperheroTest03() {
    Assert.fail("TODO");
  }

  /**
   * Test: Who would win a Showdown out of the Justice League and The Avengers?
   * Input: You choose.
   * Expected: You choose.
   */
  @Test
  public void SuperheroTest04() {
    Assert.fail("TODO");
  }
}
