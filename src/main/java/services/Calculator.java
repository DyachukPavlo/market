package services;

import core.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculator {


    public static double calculate(Map<Good, Long> gm, PromoTable promoTable){
       return gm.entrySet().stream().map(map->{
              PriceStrategy ps = promoTable.getItem(map.getKey().getClass());
              if (ps != null) {
                  return new GoodHolder(Math.toIntExact(map.getValue()), map.getKey(), ps).giveCost();
              }
              else{
                  return new GoodHolder(Math.toIntExact(map.getValue()), map.getKey(), new OrdinaryStrategy()).giveCost();
              }
          }).mapToDouble(d->d).sum();
    }

    public static Map<Good, Long> count(List<Good> goodList) {

        Map<Good, Long> countMap =
                goodList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return countMap;
    }

}
