package core;

public class GoodHolder {
    private int quantity;
    private Good good;
    private PriceStrategy priceStrategy;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public double giveCost(){
       return priceStrategy.calcCost(good, quantity);
    }

    public GoodHolder(int quantity, Good good, PriceStrategy priceStrategy) {
        this.quantity = quantity;
        this.good = good;
        this.priceStrategy = priceStrategy;
    }
}
