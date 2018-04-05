package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;
import java.util.Optional;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample4 {

    public static void main(String[] args) {


        List<Person> people = Person.Companion.build();

//        final Integer reduce = people.stream()
//                .filter(p -> p.getAge() > 20)
//                .map(p -> p.getAge())
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer total, Integer e) {
//                        return total += e;
//                    }
//                });

//        final Integer reduce = people.stream()
//                .filter(p -> p.getAge() > 20)
//                .map(Person::getAge)
//                .reduce(0, (total, e) -> total += e);

        final Integer reduce = people.stream()
                .filter(p -> p.getAge() > 20)
                .map(Person::getAge)
                .reduce(0, Integer::sum);


        final Optional<Integer> oReduce = people.stream()
                .filter(p -> p.getAge() > 20)
                .map(Person::getAge)
                .reduce(Integer::sum);

//        if (oReduce.isPresent()) {
//            System.out.println(oReduce.get());
//        }

        oReduce.ifPresent(System.out::println);


        System.out.println(reduce);

    }
}
