package ru.netology.stats;
public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int sumOfAllSales(int[] sales) {
        int SumAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            SumAllSales = SumAllSales + sales[i]; // Рассчитываем общую сумму продаж
        }
        return SumAllSales;
    }
    public int averageSalesAmount(int[] sales) {
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        int average = averageSales/sales.length; // Рассчитываем среднюю сумму продаж в месяц
        return average;
    }
    public int monthsWithBelowAverageSales(int[] sales) {
        int owAverage = averageSalesAmount(sales);
        int lowAverageSales = 0;
        for (int sale : sales) {
            if (sale < owAverage) {
                lowAverageSales ++;
            }
        }
        return lowAverageSales;   //  Месяцы с продажей ниже среднего
    }
    public int monthsWithAboveAverageSales(int[] sales) {
        int owAverage = averageSalesAmount(sales);
        int lowAverageSales = 0;
        for (int sale : sales) {
            if (sale > owAverage) {
                lowAverageSales ++;
            }
        }
        return lowAverageSales;   //  Месяцы с продажей выше среднего
    }


}