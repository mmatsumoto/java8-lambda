package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mmatsumoto on 6/28/17.
 */
public class Sample2 {
    public static void main(String[] args) {

        final List<Person> people = Person.Companion.build();

//        System.out.println(
//                getTotalGreaterThan10(people) );
//
//        System.out.println(
//                getTotalGreaterThan20(people) );

//        System.out.println(
//                getTotal(people, new Predicate<Person>() {
//                    @Override
//                    public boolean test(Person person) {
//                        return person.getAge() > 20;
//                    }
//                }));

        System.out.println(
                getTotalFilter(people, (person) -> person.getAge() > 20)
            );

    }

    public static int getTotalFilter(List<Person> people, Predicate<Person> predicate) {
        return (int) people.stream()
                .filter(predicate)
                .count();
    }

//    public static int getTotalFilter(List<Person> people, Predicate<Person> predicate) {
//        // dont do it
//        int[] total = {0};
//
//        people.stream()
//                .filter(predicate)
//                .forEach(new Consumer<Person>() {
//                    @Override
//                    public void accept(Person person) {
//                        total[0]++;
//                    }
//                });
//
//        return total[0];
//    }

//    public static int getTotal(List<Person> people, Predicate<Person> predicate) {
//        int total = 0;
//        for(Person p : people) {
//            if ( predicate.test(p) ) {
//                total++;
//            }
//        }
//        return total;
//    }

//    public static int getTotalGreaterThan10(List<Person> people) {
//        int total = 0;
//        for(Person p : people) {
//            if ( p.getAge() > 10 ) {
//                total++;
//            }
//        }
//        return total;
//    }
//
//    public static int getTotalGreaterThan20(List<Person> people) {
//        int total = 0;
//        for(Person p : people) {
//            if ( p.getAge() > 20 ) {
//                total++;
//            }
//        }
//        return total;
//    }
}
