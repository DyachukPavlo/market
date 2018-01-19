package data.products;

public class GoodC extends Good {
    private static double price;
    private static String name;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void setPrice(double price_) {
        price = price_;
    }

    public static void setName(String name_) {
        name = name_;
    }

    public GoodC() {
        price = 30.0;
        name = "Fish";
    }
}
