package ru.netology.stats.SeventhLesson.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServicesTest {

    @Test
    public void shouldMounthWithMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 9;
        int actualSales = service.mounthWithMinSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldMounthWithMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 6;
        int actualSales = service.mounthWithMaxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldSumSalesOfAllMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.sumSalesOfAllMounth(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageSalesOfMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 15;
        int actualSales = service.averageSalesOfMounth(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void moreThenAverageSalesInMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.moreThenAverageSalesInMounth(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void lessThenAverageSalesInMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.lessThenAverageSalesInMounth(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}
