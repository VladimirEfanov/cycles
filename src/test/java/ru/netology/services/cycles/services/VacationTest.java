package ru.netology.services.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationTest {

    @Test
    public void VacationTest() /*(int expected, int income, int expenses, int threshold)*/ {
        Vacation service = new Vacation();
        int expected = 3;
        int income = 10_000; // доход от работы
        int expenses = 3_000; // обязательные месячные траты
        int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

      @Test
      public void VacationTest1() /*(int expected, int income, int expenses, int threshold)*/ {
      Vacation service = new Vacation();
      int expected = 2;
      int income = 100_000; // доход от работы
      int expenses = 60_000; // обязательные месячные траты
      int threshold = 150_000; // есть возможность отдохнуть
      int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}