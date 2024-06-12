package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/WorkAndRest.csv")

    public void testCalcBalance(int income, int expenses, int threshold, byte expected) {
        WorkRestService service = new WorkRestService();
        byte actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
