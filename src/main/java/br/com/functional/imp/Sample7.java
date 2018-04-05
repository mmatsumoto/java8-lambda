package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample7 {

    public static void main(String[] args) {

        List<Person> people = Person.Companion.build();

        // or use Set<String>

//        List<String> distinct = new ArrayList<>();
//        for (Person person : people) {
//            boolean has = false;
//            for (String name : distinct) {
//                if ( name.equals(person.getName()) ) {
//                    has = true;
//                    break;
//                }
//            }
//
//            if (! has) {
//                distinct.add(person.getName());
//            }
//        }
//        for (String d : distinct) {
//            System.out.println(d);
//        }


        people.stream()
                .map(Person::getName)
                .distinct()
                .forEach(System.out::println);
    }
}
