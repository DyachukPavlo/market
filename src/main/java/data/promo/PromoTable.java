package data.promo;

import data.products.Good;

import java.util.HashMap;
import java.util.Map;

public class PromoTable <T extends Good>{
    private Map<Class<T>, PriceStrategy> promoMap;

    public PromoTable() {
        this.promoMap = new HashMap<>();
    }

    public Map<Class<T>, PriceStrategy> getPromoMap() {
        return promoMap;
    }

    public void setPromoMap(Map<Class<T>, PriceStrategy> promoMap) {
        this.promoMap = promoMap;
    }

    public void setItem(Class<T> type, PriceStrategy priceStrategy){
        this.promoMap.put(type, priceStrategy);
    }

    public PriceStrategy getItem(Class<T> type){
        return this.promoMap.get(type);
    }
}
