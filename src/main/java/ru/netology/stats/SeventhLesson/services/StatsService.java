package ru.netology.stats.SeventhLesson.services;

import java.util.stream.Stream;

public class StatsService {

    public int mounthWithMinSales(int[] sales) { // месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int mounthWithMaxSales(int[] sales) { // месяц с максимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int sumSalesOfAllMounth(int[] sales) { // сумма всех продаж
        int sumSales = 0;
        for (int t : sales) {
            if (t > 0) {
                sumSales = sumSales + t;
            }
        }
        return sumSales;
    }

    public int averageSalesOfMounth(int[] sales) { // усредненная продажа в месяц
        int averageSales = sumSalesOfAllMounth(sales) / Stream.of(sales).mapToInt(m -> m.length).sum();
        return averageSales;
    }

    public int moreThenAverageSalesInMounth(int[] sales) { // количество месяцев с продажами выше среднего
        int minMonth = 0;
        int averageSales = sumSalesOfAllMounth(sales) / Stream.of(sales).mapToInt(m -> m.length).sum();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

    public int lessThenAverageSalesInMounth(int[] sales) { // количество месяцев с продажами ниже среднего
        int minMonth = 0;
        int averageSales = sumSalesOfAllMounth(sales) / Stream.of(sales).mapToInt(m -> m.length).sum();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

}


