package com.ten10.training.objects;

public class Superhero extends Character {

  private String alterEgo;
  private Villain nemesis;

  public Superhero(String name, String alterEgo, Villain nemesis, int strength) {
    super(name, strength);

    this.alterEgo = alterEgo;
    this.nemesis = nemesis;
  }

  public boolean saveTheDay(Location location) {
    boolean savedTheDay = false;

    this.fightBadGuys();
    String result = this.fightNemesis(this.nemesis);

    if (result.equals("Win")) {
      if (location == Location.ROOFTOP)
        this.sayCheesyPun("\"Looks like you fell for that one.\"");

      if (location == Location.ELECTRICAL_STORE)
        this.sayCheesyPun("\"Looks like you blew a fuse.\"");

      if (location == Location.ICE_FACTORY)
        this.sayCheesyPun("\"You need to cool off.\"");

      savedTheDay = true;
    } else {
      System.out.println(this.name + " was unable to save the day. " + this.nemesis + " wins... this time.");
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
