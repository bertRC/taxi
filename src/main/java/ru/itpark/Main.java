package ru.itpark;

public class Main {
    public static void main(String[] args) {
        TaxiFareService service = new TaxiFareService();
        int cost = service.taxiFare(100);
        System.out.println(cost);
    }
}
