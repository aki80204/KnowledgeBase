package com.aki.withdrawal;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.aki.utils.Constants;
import com.aki.utils.Utils;

public class Withdrawal {

  /** 出金予定日を管理するドメインモデル。 15:00を締め時間とし、それを過ぎた場合は翌日扱いとする。 */
  public record WithdrawalScheduler(LocalDateTime requestTime) {
    /** 標準の15時締めを適用する */
    public LocalDate calculateScheduledDate() {
      return calculateScheduledDate(Constants.WITHDRAW_CUTOFF_TIME);
    }

    /** 任意の締め時間を指定して算出する */
    public LocalDate calculateScheduledDate(java.time.LocalTime cutoffTime) {
      final LocalDate targetDate;
      if (requestTime.toLocalTime().isBefore(cutoffTime)) {
        targetDate = requestTime.toLocalDate();
      } else {
        targetDate = requestTime.toLocalDate().plusDays(1);
      }

      return adjustToNextBusinessDay(targetDate);
    }

    /** 対象日付が土日、祝日の場合最初の営業日まで日付を調整する。 */
    private LocalDate adjustToNextBusinessDay(LocalDate date) {

      while (true) {
        if (Utils.isWeekend(date)) {
          date = date.plusDays(1);
          continue;
        }

        if (Constants.HOLIDAYS_2026.contains(date)) {
          date = date.plusDays(1);
          continue;
        }

        return date;
      }
    }
  }
}
