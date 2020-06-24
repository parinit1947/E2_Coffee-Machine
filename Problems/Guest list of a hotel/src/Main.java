//put imports you need here

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            names.add(scanner.next());
        }
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }


 /*Other technical Solution

new Scanner(System.in)
                .tokens()
                .collect(Collectors.toCollection(ArrayDeque::new))
                .descendingIterator()
                .forEachRemaining(System.out::println);*/

    }
}