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
        long averageSum = calculateSum(purchases) / purchases.length;
        return averageSum;
    }

    public long findMax(long[] purchases) {
        long salesMax = purchases[0];
        int currentMax = 1;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] >= salesMax) {
                salesMax = purchases[i];
                currentMax = i + 1;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {
        long salesMin = purchases[0];
        int currentMin = 1;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] <= salesMin) {
                salesMin = purchases[i];
                currentMin = i + 1;
            }
        }
        return currentMin;
    }

    public long numberOfMounthLessAverageSum(long[] purchases) {

        long averageSum = averageSumPerMounth(purchases);
        long counterOfMounths = 0;

        for (long purchase : purchases) {
            if (purchase < averageSum) {
                counterOfMounths ++;
            }
        }

        return counterOfMounths;
    }

    public long numberOfMounthMoreAverageSum(long[] purchases) {

        long averageSum = averageSumPerMounth(purchases);
        long counterOfMounths = 0;

        for (long purchase : purchases) {
            if (purchase > averageSum) {
                counterOfMounths ++;
            }
        }

        return counterOfMounths;
    }
    }
