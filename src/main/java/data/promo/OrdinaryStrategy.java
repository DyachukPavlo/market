package data.promo;

import data.products.Good;

public class OrdinaryStrategy implements PriceStrategy {
    @Override
    public double calcCost(Good good, int quantity) {
        return good.getPrice()*quantity;
    }
}
