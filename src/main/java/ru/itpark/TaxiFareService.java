package ru.itpark;

public class TaxiFareService {
    int taxiFare(int distance) {
        int boardingCost = 60;
        int kilometerCost = 20;
        int minimalCostForDiscount = 1000;
        int discountPercent = 5;
        int maximumDiscount = 100;

        int totalCost = boardingCost + distance * kilometerCost;
        if (totalCost > minimalCostForDiscount) {
            int discount = totalCost * discountPercent / 100;
            if (discount > maximumDiscount) {
                discount = maximumDiscount;
            }
            totalCost = totalCost - discount;
        }
        return totalCost;
    }
}
