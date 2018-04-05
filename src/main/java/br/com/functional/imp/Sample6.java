package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample6 {

    public static void main(String[] args) {

        List<Person> people = Person.Companion.build();

//        boolean hasOnePerson = false;
//        for (Person person : people) {
//            if( person.getAge() > 30) {
//                hasOnePerson = true;
//                break;
//            }
//        }
//        if (hasOnePerson) {
//            System.out.println("OK!!!");
//        }

        if (people.stream()
                  .anyMatch(p -> p.getAge() > 30) ) {
            System.out.println("age > 30");
        }

        if (people.stream()
                .noneMatch(p -> p.getAge() > 300) ) {
            System.out.println("age > 300 not found");
        }

    }
}
