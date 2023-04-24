package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldSeeAdditionalAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSeeAdditionalAmountWhenMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSeeAdditionalAmountWhenThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSeeAdditionalAmountWhenFullThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSeeAdditionalAmountWhenAboveThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1020;
        int expected = 980;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
