package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample5 {

    public static void main(String[] args) {


        List<Person> people = Person.Companion.build();


        StringBuffer names = new StringBuffer();
        for (int i = 0; i < people.size(); i++) {
            names.append(people.get(i).getName());
            if(i < people.size() - 1) {
                names.append(",");
            }
        }
        System.out.println(names);


        final String collect = people.stream()
                .map(Person::getName)
                .collect(joining(","));

        System.out.println(collect);

    }

}
