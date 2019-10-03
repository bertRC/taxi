package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiFareServiceTest {

    @Test
    void shouldCalculateTaxiFareWithoutDiscount() {
        TaxiFareService service = new TaxiFareService();
        int distance = 1;
        int expectedFare = 80;

        int actualFare = service.taxiFare(distance);

        assertEquals(expectedFare, actualFare);
    }

    @Test
    void shouldCalculateTaxiFareWithDiscount() {
        TaxiFareService service = new TaxiFareService();
        int distance = 50;
        int expectedFare = 1_007;

        int actualFare = service.taxiFare(distance);

        assertEquals(expectedFare, actualFare);
    }

    @Test
    void shouldCalculateTaxiFareWithMaxDiscount() {
        TaxiFareService service = new TaxiFareService();
        int distance = 100;
        int expectedFare = 1_960;

        int actualFare = service.taxiFare(distance);

        assertEquals(expectedFare, actualFare);
    }
}