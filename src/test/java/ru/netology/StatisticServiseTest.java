package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiseTest {
    @Test
    void findMax (){
        StatsService servise= new StatsService();

        long [] incomesInBillion={12,5,8,4,5,3,8,6,11,11,12};
        long expected =12;

        long actual=servise.findMax (incomesInBillion);

        assertEquals (expected,actual);
    }
}
