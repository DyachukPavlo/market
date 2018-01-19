package core.promo;

import core.products.Good;

public interface PriceStrategy {
    double calcCost(Good good, int quantity);
}
