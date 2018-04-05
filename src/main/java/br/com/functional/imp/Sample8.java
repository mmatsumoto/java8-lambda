package br.com.functional.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample8 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println( numbers.stream()
                .filter(e -> e > 4)
                .count() );

        // lazy evaluation, not call until count()
        final Stream<Integer> integerStream = numbers.stream()
                .filter(e -> e > 4);

        numbers.add(6);

        System.out.println( integerStream.count() );
    }
}
