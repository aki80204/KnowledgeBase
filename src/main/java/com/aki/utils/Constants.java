package com.aki.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Constants {
  /** 出金可能時間の境界 */
  public static final LocalTime WITHDRAW_CUTOFF_TIME = LocalTime.of(15, 0);

  /** 2026年 日本の祝日・振替休日リスト */
  public static final List<LocalDate> HOLIDAYS_2026 =
      List.of(
          LocalDate.of(2026, 1, 1), // 元日
          LocalDate.of(2026, 1, 12), // 成人の日
          LocalDate.of(2026, 2, 11), // 建国記念の日
          LocalDate.of(2026, 2, 23), // 天皇誕生日
          LocalDate.of(2026, 3, 20), // 春分の日
          LocalDate.of(2026, 4, 29), // 昭和の日
          LocalDate.of(2026, 5, 3), // 憲法記念日
          LocalDate.of(2026, 5, 4), // みどりの日
          LocalDate.of(2026, 5, 5), // こどもの日
          LocalDate.of(2026, 5, 6), // 振替休日
          LocalDate.of(2026, 7, 20), // 海の日
          LocalDate.of(2026, 8, 11), // 山の日
          LocalDate.of(2026, 9, 21), // 敬老の日
          LocalDate.of(2026, 9, 22), // 国民の休日
          LocalDate.of(2026, 9, 23), // 秋分の日
          LocalDate.of(2026, 10, 12), // スポーツの日
          LocalDate.of(2026, 11, 3), // 文化の日
          LocalDate.of(2026, 11, 23) // 勤労感謝の日
          );
}
