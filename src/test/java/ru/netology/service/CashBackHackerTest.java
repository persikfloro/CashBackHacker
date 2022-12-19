package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @Test
    public void returnCashback1() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test //failed test
    public void returnCashbackZero() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashbackIf999() {
        CashBackHacker service = new CashBackHacker();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashback1001() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashback1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @Test //failed test
    public void returnCashback2000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashback50() {
        CashBackHacker service = new CashBackHacker();

        int expected = 950;
        int actual = service.remain(50);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashback445() {
        CashBackHacker service = new CashBackHacker();

        int expected = 445;
        int actual = service.remain(555);
        assertEquals(expected, actual);
    }

    @Test
    public void returnCashbackIf1999() {
        CashBackHacker service = new CashBackHacker();

        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(expected, actual);
    }
}