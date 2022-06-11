package com.mycompany.prepare.lambda_expressions_and_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    static void terminalOperations() {
        final List<Integer> integerList = Arrays.asList(50, 10, 80, 30, 70);

        Stream<Integer> stream = integerList.stream();
        System.out.println("forEach: ");
        stream.forEach((element) -> System.out.print(element * element + " "));
        System.out.println();

        Stream<Integer> stream2 = integerList.stream();
        System.out.println("toArray: ");
        Object[] arr = stream2.toArray();
        System.out.println(Arrays.toString(arr));

        Stream<Integer> stream3 = integerList.stream();
        System.out.println("reduce: ");
        BinaryOperator<Integer> binaryOperator = (s1, s2) -> s1 + s2;
        Optional<Integer> optional = stream3.reduce(binaryOperator);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        Stream<Integer> stream4 = integerList.stream();
        System.out.println("collect: ");
        List<Integer> list = stream4.map(i -> i * 2).collect(Collectors.toList());
        System.out.println(list);

        Stream<Integer> stream5 = integerList.stream();
        System.out.println("min: ");
        Optional<Integer> min = stream5.min((i, j) -> i - j);
        if(min.isPresent()) {
            System.out.println(min.get());
        }

        Stream<Integer> stream6 = integerList.stream();
        System.out.println("max: ");
        Optional<Integer> max = stream6.max((i, j) -> i - j);
        if(max.isPresent()) {
            System.out.println(max.get());
        }

        Stream<Integer> stream7 = integerList.stream();
        System.out.println("count: ");
        long count = stream7.count();
        System.out.println(count);

        Stream<Integer> stream8 = integerList.stream();
        System.out.println("anyMatch: "); // ete voreve mek@ ham@nknum e
        System.out.println(stream8.anyMatch(i -> i > 30));

        Stream<Integer> stream9 = integerList.stream();
        System.out.println("allMatch: "); // ete bolor@ ham@nknum e
        System.out.println(stream9.allMatch(i -> i > 30));

        Stream<Integer> stream10 = integerList.stream();
        System.out.println("noneMatch: "); // ete bolor elementner@ chen bavararum paymanin, veradardznum e false, hakarak depqum true
        System.out.println(stream10.noneMatch(i -> i > 100));

        Stream<Integer> stream11 = integerList.stream();
        System.out.println("findFirst: "); // ete parunakum e gone mek element veradardznum e arajin elementov optional@, hakarak depqum datark optional
        Optional<Integer> integerOptional1 = stream11.findFirst();
        if(integerOptional1.isPresent()) {
            System.out.println(integerOptional1.get());
        } else {
            System.out.println("No element");
        }

        Stream<Integer> stream12 = integerList.stream();
        System.out.println("findAny: "); // ete parunakum e gone mek element veradardznum e arajin elementov optional@, hakarak depqum datark optional
        Optional<Integer> integerOptional2 = stream12.findAny();
        if(integerOptional2.isPresent()) {
            System.out.println(integerOptional2.get());
        } else {
            System.out.println("No element");
        }



    }

    //
    static void findAny() {
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16)
                .parallel();

        // Using Stream findAny().
        // Executing the source code multiple times
        // may not return the same result.
        // Every time you may get a different
        // Integer which is divisible by 4.
        stream = stream.filter(i -> i % 4 == 0);

        OptionalInt answer = stream.findAny();
        if (answer.isPresent())
        {
            System.out.println(answer.getAsInt());
        }
    }

    static void nonTerminalOperations() {
        final List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50, 60);

        Stream<Integer> intStream = integerList.stream().filter(i -> i > 30);
        System.out.println(intStream.collect(Collectors.toList()));

        Stream<Integer> intStream2 = integerList.stream().map((i) -> i + 1);
        System.out.println(intStream2.collect(Collectors.toList()));

        List<Integer> sortedList =
                integerList.stream().sorted((i,j) -> j - i).collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void main(String[] args) {
       // terminalOperations();
        nonTerminalOperations();
        // findAny();



    }
}
