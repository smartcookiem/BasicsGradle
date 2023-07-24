package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    @Test

    public void belowValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void higherValues() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void equalToValue() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(actual, expected);
    }
}}