
package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void calcInLimit(int expected, int borderX, int borderY) {
        SQRService service = new SQRService();

        int actual = service.sqrNumber(borderX, borderY);

        Assertions.assertEquals(expected, actual);
    }

}
