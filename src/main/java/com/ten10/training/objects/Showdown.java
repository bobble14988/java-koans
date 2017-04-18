package com.ten10.training.objects;

import java.util.ArrayList;

public class Showdown {

  private ArrayList<Character> goodGuys = new ArrayList<>();
  private ArrayList<Character> badGuys = new ArrayList<>();

  public void addGoodGuy(Character character) {
    goodGuys.add(character);
  }

  public void addBadGuy(Character character) {
    badGuys.add(character);
  }

  /**
   * TODO
   * Determins which team would win based upon the sum each team's strengths.
   * @return "Good guys win!" if the good guys' sum strength is greater.
   *         "Bad guys win!" if the bad guys' sum strength is greater.
   */
  public String fight() {
    return "";
  }
}
