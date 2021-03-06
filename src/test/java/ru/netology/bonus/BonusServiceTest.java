package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv")
    public void test(long amount, boolean isRegistered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
