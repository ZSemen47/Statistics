package ru.netology.stats;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long averageSumPerMounth(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        long averageSum = sum / purchases.length;
        return averageSum;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long numberOfMounthLessAverageSum(long[] purchases) {

        StatisticsService service = new StatisticsService();
        long averageSum = service.averageSumPerMounth(purchases);

        long counterOfMounths = 0;
        for (long purchase : purchases) {
            if (purchase < averageSum) {
                long index = 0;
                purchase = index;
                counterOfMounths += purchase + 1;
            }
        }

        return counterOfMounths;
    }

    public long numberOfMounthMoreAverageSum(long[] purchases) {

        StatisticsService service = new StatisticsService();
        long averageSum = service.averageSumPerMounth(purchases);

        long counterOfMounths = 0;
        for (long purchase : purchases) {
            if (purchase < averageSum) {
                long index = 0;
                purchase = index;
                counterOfMounths += purchase + 1;
            }
        }

        return counterOfMounths;
    }
    }
