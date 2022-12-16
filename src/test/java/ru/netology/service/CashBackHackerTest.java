package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackerTest {

    @Test
    public void returnCashback999() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test // failed test
    public void returnCashback1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void returnCashback1001() {
        CashBackHacker service = new CashBackHacker();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

    @Test
    public void returnCashbackIfZero() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void returnCashbackIfLess50() {
        CashBackHacker service = new CashBackHacker();

        int expected = 955;
        int actual = service.remain(45);

        assertEquals(actual, expected);
    }

    @Test // failed test
    public void returnCashbackIf2000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(2000);

        assertEquals(actual, expected);
    }


}
