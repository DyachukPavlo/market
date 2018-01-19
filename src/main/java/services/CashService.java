package services;

import core.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashService {
    PromoTable promoTable;
    public CashService() {
        PriceStrategy strategyA = new QuantityStrategy(70, 3);
        PriceStrategy strategyB = new QuantityStrategy(15, 2);

        Map<Class<?>, PriceStrategy> promoGoods = new HashMap<>();
        promoGoods.put(GoodA.class, strategyA);
        promoGoods.put(GoodB.class, strategyB);

        promoTable = new PromoTable();
        promoTable.setPromoMap(promoGoods);
    }

    public double createCashChek(List<Good> goodList){
        Map<Good, Long> countedGoods = Calculator.count(goodList);
        double result = Calculator.calculate(countedGoods, promoTable);
        System.out.println(result);
        return result;
    }
}
