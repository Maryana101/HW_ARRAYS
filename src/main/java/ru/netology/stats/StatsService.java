package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];  //вычисление суммы массива в цикле
        }
        return sum;
    }

    public int avgSales(long[] sales) {
        int avg = sumSales(sales) / sales.length;
        return avg;
    }

    public int aboveAvg(long[] sales) {
        int avg = avgSales(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > avg) {   //проверяем, продажа в текущем месяце выше среднего
                countMonth++;  // если да, то увеличиваем счетчик месяцев
            }
        }
        return countMonth;
    }

    public int belowAvg(long[] sales) { // вычисление кол-ва продаже ниже среднего
        int avg = avgSales(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < avg) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
