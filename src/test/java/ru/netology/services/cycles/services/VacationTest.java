package ru.netology.services.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationTest {

    @ParameterizedTest
/*    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    }) */
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void VacationTest(int expected, int income, int expenses, int threshold) {
        Vacation service = new Vacation();
        /*int expected = 3;
        int income = 10_000; // доход от работы
        int expenses = 3_000; // обязательные месячные траты
        int threshold = 20_000; // есть возможность отдохнуть */
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

/*    @Test
    public void VacationTest1() (int expected, int income, int expenses, int threshold) {
        Vacation service = new Vacation();
        int expected = 2;
        int income = 100_000; // доход от работы
        int expenses = 60_000; // обязательные месячные траты
        int threshold = 150_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    } */

}