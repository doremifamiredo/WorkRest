//package ru.netology.javaqa;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//public class WorkRestServiceTest {
//    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/balance.csv")
//
//    public void testCalcBalance(int income, int expenses, int threshold) {
//        WorkRestService service = new WorkRestService();
//        service.calcBalance(income, expenses, threshold);
//
//    }
//}
