package com.example.halloworldspring.services;

import java.time.LocalDate;
import java.util.Calendar;

public class CalculateDayOfTheWeek {

  public static String day(){

    Calendar cal = Calendar.getInstance();
    int dayOfTheWeek = cal.get(Calendar.DAY_OF_WEEK);

    if(dayOfTheWeek == Calendar.FRIDAY){
      return "YES it FRIDAY, FRIDAY gotta get down on FRIDAY";
    } else {
      return "IT'S NOT FRIDAY YET";
    }

    /*
    String answer = "";

    LocalDate date = LocalDate.of(2021, 9, 27);
    java.time.DayOfWeek day = date.getDayOfWeek();

    if(day.name().equals("WEDNESDAY")){
      answer = "YES";
    } else {
      answer = "NO";
    }

    return answer;

     */
  }
}
