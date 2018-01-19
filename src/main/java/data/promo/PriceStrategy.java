package data.promo;

import data.products.Good;

public interface PriceStrategy {
    double calcCost(Good good, int quantity);
}
