package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int monthsMinSales = service.minSales(sales);
        System.out.println("Месяц c минимальными продажами " + monthsMinSales);
    }
    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int monthsMaxSales = service.maxSales(sales);
        System.out.println("Месяц c максимальными продажами " + monthsMaxSales);
    }
    @Test
    public void shouldSumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int SumOfAllSales = service.sumOfAllSales(sales);
        System.out.println("Сумма всех продаж " + SumOfAllSales);
    }
    @Test
    public void shouldAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int AverageSalesAmount = service.averageSalesAmount(sales);
        System.out.println("Средняя сумма продаж " + AverageSalesAmount);
    }
    @Test
    public void shouldMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int monthsWithBelowAverageSales = service.monthsWithBelowAverageSales(sales);
        System.out.println("Месяцы с продажами ниже среднего " + monthsWithBelowAverageSales);
    }
    @Test
    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18 };

        int monthsWithBelowAverageSales = service.monthsWithAboveAverageSales(sales);
        System.out.println("Месяцы с продажами выше среднего " + monthsWithBelowAverageSales);
    }
}
