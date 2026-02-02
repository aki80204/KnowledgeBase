package com.aki.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Utils {

  /** 週末判定ロジック */
  public static boolean isWeekend(LocalDate date) {
    final DayOfWeek day = date.getDayOfWeek();
    if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
      return true;
    }
    return false;
  }
}
