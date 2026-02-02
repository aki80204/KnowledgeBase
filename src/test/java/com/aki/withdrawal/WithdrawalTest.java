package com.aki.withdrawal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.aki.withdrawal.Withdrawal.WithdrawalScheduler;

public class WithdrawalTest {

  @Test
  @DisplayName("15時前（14:59）の申請は、当日が予定日になること")
  void testBeforeCutoff() {
    // 2026/02/02(月) 14:59:59
    LocalDateTime requestTime = LocalDateTime.of(2026, 2, 2, 14, 59, 59);
    WithdrawalScheduler scheduler = new WithdrawalScheduler(requestTime);

    assertEquals(LocalDate.of(2026, 2, 2), scheduler.calculateScheduledDate());
  }

  @Test
  @DisplayName("15時ジャストの申請は、翌日が予定日になること")
  void testAfterCutoff() {
    // 2026/02/02(月) 15:00:00
    LocalDateTime requestTime = LocalDateTime.of(2026, 2, 2, 15, 0, 0);
    WithdrawalScheduler scheduler = new WithdrawalScheduler(requestTime);

    assertEquals(LocalDate.of(2026, 2, 3), scheduler.calculateScheduledDate());
  }

  @Test
  @DisplayName("金曜日の15時以降の申請は、翌週の月曜日になること（土日スキップ）")
  void testWeekendSkip() {
    // 2026/02/06(金) 15:00:00
    LocalDateTime requestTime = LocalDateTime.of(2026, 2, 6, 15, 0, 0);
    WithdrawalScheduler scheduler = new WithdrawalScheduler(requestTime);

    // 金曜の15時以降 -> 本来は土曜(2/7)だが、スキップして月曜(2/9)
    assertEquals(LocalDate.of(2026, 2, 9), scheduler.calculateScheduledDate());
  }

  @Test
  @DisplayName("祝日の前日15時以降の申請は、祝日明けの日付になること")
  void testHolidaySkip() {
    // 2026/02/10(火) 15:00:00 -> 翌日は2/11(建国記念の日)
    LocalDateTime requestTime = LocalDateTime.of(2026, 2, 10, 15, 0, 0);
    WithdrawalScheduler scheduler = new WithdrawalScheduler(requestTime);

    assertEquals(LocalDate.of(2026, 2, 12), scheduler.calculateScheduledDate());
  }
}
