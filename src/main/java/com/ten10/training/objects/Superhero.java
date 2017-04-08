package com.ten10.training.objects;

public class Superhero {

  private String name;
  private String alterEgo;
  private Villain nemesis;
  private int strength;

  public Superhero(String name, String alterEgo, Villain nemesis, int strength) {
    this.name = name;
    this.alterEgo = alterEgo;
    this.nemesis = nemesis;
    this.strength = strength;
  }

  public boolean saveTheDay(Location brawlLocation) {
    boolean savedTheDay = false;

    this.fightBadGuys();
    String result = this.fightNemesis(this.nemesis);

    if (result.equals("Win")) {
      if (brawlLocation == Location.ROOFTOP)
        this.sayCheesyPun("\"Looks like you fell for that one.\"");

      if (brawlLocation == Location.ELECTRICAL_STORE)
        this.sayCheesyPun("\"Looks like you blew a fuse.\"");

      if (brawlLocation == Location.ICE_FACTORY)
        this.sayCheesyPun("\"You need to cool off.\"");

      savedTheDay = true;
    }

    return savedTheDay;
  }

  private void fightBadGuys() {
    System.out.println("POW! WACK! CLOBBER! SPLAZAAM!");
  }

  private String fightNemesis(Villain nemesis) {
    if (this.strength > nemesis.getStrength()) {
      return "Win";
    } else if (this.strength == nemesis.getStrength()) {
      return "Draw";
    } else {
      return "Lose";
    }
  }

  private void sayCheesyPun(String pun) {
    System.out.println(pun);
  }

  public String getName() {
    return this.name;
  }

  public String getAlterEgo() {
    return this.alterEgo;
  }

  public Villain getNemesis() {
    return this.nemesis;
  }

  public int getStrength() {
    return this.strength;
  }
}
