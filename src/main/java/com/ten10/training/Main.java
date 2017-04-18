package com.ten10.training;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
    String dayOfWeek = getDayOfTheWeek();

    if (dayOfWeek.equals("Monday")) {
      System.out.println("I hate Mondays!!");
    } else if (dayOfWeek.equals("Tuesday")) {
      System.out.println("This week is horrible!");
    } else if (dayOfWeek.equals("Wednesday")) {
      System.out.println("Hump day, half way through.");
    } else if (dayOfWeek.equals("Thursday")) {
      System.out.println("I can feel Friday is just around the corner.");
    } else if (dayOfWeek.equals("Friday")) {
      System.out.println("IT'S FRRRRIIIIDDDAAAAYYYYYY!!!");
    } else if (dayOfWeek.equals("Saturday")) {
      System.out.println("Free time, WOO!!");
    } else if (dayOfWeek.equals("Sunday")) {
      System.out.println("Weekends need to be longer.");
    } else {
      System.out.println("Something must have gone wrong!");
    }
  }

  private static String getDayOfTheWeek() {
    Date now = new Date();

    SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely

    return simpleDateformat.format(now);
  }
}




