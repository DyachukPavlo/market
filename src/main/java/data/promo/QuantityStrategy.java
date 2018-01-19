package data.promo;

import data.products.Good;

public class QuantityStrategy implements PriceStrategy {
    private int promoQuantity;
    private double promoPrice;

    @Override
    public double calcCost(Good good, int quantity) {
        int solid = (int)quantity/promoQuantity;
        if(solid>0){
            return solid*promoPrice + quantity%promoQuantity * good.getPrice();
        }
        else{
            return quantity * good.getPrice();
        }
    }

    public QuantityStrategy(double promoPrice, int promoQuantity) {
        this.promoQuantity = promoQuantity;
        this.promoPrice = promoPrice;
    }
}
