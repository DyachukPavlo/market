package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Good> goodList = new ArrayList<>();
        PriceStrategy strategyA = new QuantityStrategy(70, 3);

        GoodA.setPrice(2.58);
        GoodB.setPrice(3);
        GoodC.setPrice(5.80);
        GoodD.setPrice(8);

        GoodA.setName("Apple");
        GoodB.setName("Bread");
        GoodC.setName("Milk");
        GoodD.setName("Fish");

        List<Good> list = Arrays.asList(new GoodA(), new GoodB(), new GoodC(), new GoodB(),new GoodA(), new GoodB());
        Map<Good, Long> gm = HolderCreator.create(list);
      //  double r =gm.entrySet().stream().map(map->new GoodHolder(Math.toIntExact(map.getValue()), map.getKey(), strategyA).giveCost());
        //GoodHolder gh = new GoodHolder(gm.get())



       /* Good A = new GoodA();
        Good B = new GoodB();
        Good C = new GoodC();
        Good D = new GoodD();

        goodList.add(A);
        goodList.add(B);
        goodList.add(C);
        goodList.add(D);

        Calculator calculator = new Calculator(goodList);
        System.out.println(calculator.calculate());*/
       // System.out.println(r);

    }
}
