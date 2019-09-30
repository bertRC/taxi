package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiFareServiceTest {

    @Test
    void taxiFareWithoutDiscount() {
        TaxiFareService service = new TaxiFareService();
        int distance = 1;
        int expectedFare = 80;

        int actualFare = service.taxiFare(distance);

        assertEquals(expectedFare, actualFare);

    }
}