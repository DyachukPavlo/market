package services;

import data.products.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CashTest {

    @Test
    public void cashChekTest1() {
        CashService cash = new CashService();
        List<Good> list = Arrays.asList(new GoodA(), new GoodB(), new GoodC(), new GoodB(),new GoodA(), new GoodB(), new GoodD());
        assertEquals(160.0, cash.createCashChek(list), 0.0);
    }

    @Test
    public void cashChekTest2() {
        CashService cash = new CashService();
        List<Good> list = Arrays.asList(new GoodA(), new GoodB(), new GoodC(), new GoodB(),new GoodA(), new GoodA(), new GoodB(), new GoodD());
        assertEquals(150.0, cash.createCashChek(list), 0.0);
    }
}