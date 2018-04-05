package br.com.functional.imp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample10 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        LocalDateTime start = LocalDateTime.now();
        numbers.stream()
                .map(Sample10::doSomethingVerySlow)
                .collect(Collectors.toList());
        LocalDateTime end = LocalDateTime.now();
        System.out.println("duration: " + Duration.between(start, end));


        System.out.println("-> using parallelStream()");
        start = LocalDateTime.now();
        numbers.parallelStream()
                .map(Sample10::doSomethingVerySlow)
                .collect(Collectors.toList());
        end = LocalDateTime.now();

        System.out.println("duration: " + Duration.between(start, end));
    }

    public static String doSomethingVerySlow(Integer i) {
        System.out.println("processing ("+ i + ")");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "done (" + i + ")";
    }
}
