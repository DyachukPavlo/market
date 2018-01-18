package core;

public class QuantityStrategy implements PriceStrategy {
    private int promoQuantity;
    private double promoPrice;

    @Override
    public double calcCost(Good good, int quantity) {
        int reminder = quantity%promoQuantity;
        if(reminder>0){
            return (quantity - reminder)/promoQuantity*promoPrice + reminder * good.getPrice();
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
