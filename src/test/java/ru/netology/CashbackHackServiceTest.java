package ru.netology;

import org.testng.annotations.Test;


import static org.testng.Assert.*;
class CashbackHackServiceTest {
    @Test
    void ShouldSeeAdditionalAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void ShouldSeeAdditionalAmountWhenMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSeeAdditionalAmountWhenThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSeeAdditionalAmountWhenFullThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSeeAdditionalAmountWhenAboveThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1020;
        int expected = 980;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
