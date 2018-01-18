package core;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HolderCreator {
    public static Map<Good, Long> create(List<Good> goodList) {
        Map<Good, Long> counts =
                goodList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return counts;
    }
}
