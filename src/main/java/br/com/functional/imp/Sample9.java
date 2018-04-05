package br.com.functional.imp;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample9 {

    public static void main(String[] args) {

        // TERMINAL NON TERMINAL

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // this imperative code takes 5 UNIT TIMES to finish
        // 4 tests if (i > 3)
        // 1 doubleFirst - i * 2
        Integer doubleFirst = null;
        for (Integer i : numbers) {
            if (i > 3) {
                doubleFirst = i * 2;
                break;
            }
        }
        System.out.println(doubleFirst);

        // how many here??? 17?
        OptionalInt first = numbers.stream()
                .filter(i -> i > 3) // 10
                .mapToInt(i -> i * 2) // 6
                .findFirst(); // 1
        first.ifPresent(System.out::println);


        // testing how many = ONLY 8!!!
        first = numbers.stream()
                .filter(Sample9::filter)
                .mapToInt(Sample9::doubleit)
                .findFirst();
        first.ifPresent(System.out::println);

    }

    public static boolean filter(Integer i) {
        System.out.println("filter i " + i);
        return i > 3;
    }

    public static Integer doubleit(Integer i) {
        System.out.println("double it i " + i);
        return i * 2;
    }



}
