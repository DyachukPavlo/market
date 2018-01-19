import data.products.*;
import data.products.GoodA;
import services.CashService;

import java.util.Arrays;
import java.util.List;

public class main{
    public static void main(String[] args) {

        CashService cash = new CashService();
        List<Good> list = Arrays.asList(new GoodA(), new GoodB(), new GoodC(), new GoodB(),new GoodA(), new GoodB(), new GoodD());
        cash.createCashChek(list);
    }
}
