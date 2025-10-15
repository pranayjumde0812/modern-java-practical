package imperativedeclerative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 3, 0, 2, 3, 3, 4, 5, 5, 0, 6, 7, 8, 8, 9);
        /**
         * Imperative
         */

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }

        System.out.println("Unique List with imperative " + uniqueList);

        /**
         * Declarative
         */

        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .toList();

        System.out.println("Unique list 2 " + uniqueList1);

    }
}
