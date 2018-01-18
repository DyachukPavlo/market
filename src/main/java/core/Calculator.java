package core;

import java.util.List;

public class Calculator {
    private List<Good> goodList;
    private double result;


    public Calculator(List<Good> goodList) {
        this.goodList = goodList;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    public void setItem(Good good){
        this.goodList.add(good);
    }

    public double calculate(){
        goodList.forEach(good -> {
            result = result + good.getPrice();
        });
        return result;
    }
}
