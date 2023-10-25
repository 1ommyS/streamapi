import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @author 1ommy
 * @version 25.10.2023
 */
public class Main {

    public static void doSomething(Function<Integer, String> func, int a) {
        func.apply(a);
    }

    public static void main(String[] args) {
   /*     var names = new ArrayList<String>();
        names.add("Antondsadas");
        names.add("Vanyafasfsaf");
        names.add("Petyagcxvxc");
        names.add("Alexeyxzxz");
        names.add("Jhoncccvv");

        // вывести на экран имена,которые содержат y и их длина > 7

        for (String name : names) {
            if (name.contains("y") && name.length() > 7) {
                System.out.println(name);
            }
        }

        System.out.println();

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
*//*
        Stream;
        IntStream;
        DoubleStream;
        LongStream;*//*


//        names.stream().map(el -> el += "pyat").forEach(System.out::println);

        names.sort((o1, o2) -> o1.length() - o2.length());

        names
                .stream() // Stream<String>
                .filter(x -> x.contains("y") && x.length() > 7)
                .forEach(System.out::println); // reference to method


        boolean res = names
                .stream()
                .anyMatch(x -> x.equals("Antondsadas"));

        boolean b = names.stream()
                .allMatch(x -> x.equals("Antondsadas"));
*//*
        names.stream()
                .filter(x -> x.length() > 3)
                .count();*//*

        IntStream.of(1, 1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 5, 5, 5)
                .distinct()
                .forEach(System.out::println); // оставляет только уникальные элементы

        names
                .stream()
                .skip(5)
                .forEach(System.out::println);

        names.stream()
                .dropWhile(x -> x.length() > 5)
                .forEach(System.out::println);

        Optional<String> first = names.stream()
                .findFirst();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Optional<Integer> max = Stream.of(-5, -7, -4, -2, 3, 1, 7, 0, 9)
                .max((a, c) -> a - c);
        System.out.println("Результат:" + max.get());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(res);
        System.out.println(b);

*//*
        IntStream.range(1, 10000)
                .filter(x -> x % 7 == 0 && x % 4 == 0)
                .collect();
        *//*

        List<String> collect = names.stream()
                .filter(x -> x.length() > 5)
                .toList();
*//*
        User user = new User();
        if (user.email.isEmpty()) { // isEmpty тож самое что и == налл
            // puk
        }

        if (user.email.isPresent()) { // isPresent тож самое что и != налл

        }

        user.email.orElse(""); // кладем какое-то значение если поле null

        user.email.orElseThrow(() -> {
            return new IllegalArgumentException("аливедчери");
        });

        *//*

         *//*
        имееется массив строк, нужно вывести только уникальные строки,отсортированные в алфавитном порядке и
        содержащие слово Java.
         *//*


        ArrayList<String> strings = new ArrayList<>();

        List<String> java = strings
                .stream()
                .filter(x -> x.contains("Java"))
                .distinct()
                .sorted()
                .toList();

        *//*    Collections.sort(strings);*//*

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        ); // [[1,2,3],[4,5,6],[7,8,9]]

        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream) // [1,2,3,4,5,6,7,8,9]
                .collect(Collectors.toList());

        System.out.println(flattenedNumbers);


*/

        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }

        long startTime = System.currentTimeMillis();

        List<Integer> list = numbers.stream()
                .map(x -> x * 2)
                .toList();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println(executionTime);

        System.out.println();

        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers1.add(i);
        }
        long startTime1 = System.currentTimeMillis();

        List<Integer> list1 = numbers1.parallelStream()
                .map(x -> x * 2)
                .toList();

     

        long endTime1 = System.currentTimeMillis();
        long executionTime1 = endTime1 - startTime1;

        System.out.println(executionTime1);
    }
}