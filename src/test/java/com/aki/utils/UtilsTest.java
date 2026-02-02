package com.aki.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UtilsTest {
  @Test
  @DisplayName("週末判定ロジックテスト")
  void testIsWeekend() {
    // 2026/02/07(土)
    assertEquals(true, Utils.isWeekend(LocalDate.of(2026, 2, 7)));
    // 2026/02/08(日)
    assertEquals(true, Utils.isWeekend(LocalDate.of(2026, 2, 8)));
    // 2026/02/09(月)
    assertEquals(false, Utils.isWeekend(LocalDate.of(2026, 2, 9)));
  }
}
