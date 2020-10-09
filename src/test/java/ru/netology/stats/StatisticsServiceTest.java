package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageSumPerMounth() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSumPerMounth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfMounthWithLessAverageSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberOfMounthLessAverageSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfMounthWithMoreAverageSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.numberOfMounthMoreAverageSum(purchases);

        assertEquals(expected, actual);
    }
}