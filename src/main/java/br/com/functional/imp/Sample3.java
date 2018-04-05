package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;

/**
 * Created by mmatsumoto on 6/28/17.
 */
public class Sample3 {

    public static void main(String[] args) {

        List<Person> people = Person.Companion.build();

        // mutability is good, sharing is good, mutability and sharing is devil work!!!
//        List<Integer> ages = new ArrayList<>();
//        people.forEach(new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//                if (person.getAge() > 20) {
//                ages.add(person.getAge());
//                }
//            }
//        });
//        for (Integer age : ages) {
//            System.out.println(age);
//        }


        // 1 - functional
//        final List<Integer> collect = people.stream()
//                .filter(new Predicate<Person>() {
//                    @Override
//                    public boolean test(Person person) {
//                        return person.getAge() > 20;
//                    }
//                })
//                .map(new Function<Person, Integer>() {
//
//                    @Override
//                    public Integer apply(Person person) {
//                        return person.getAge();
//                    }
//                })
//                .collect(Collectors.toList());
//
//        collect.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });


        // 2 - functional
        people.stream()
                .filter(person -> person.getAge() > 20)
                .map(Person::getAge)
                .forEach(System.out::println);




    }

}
