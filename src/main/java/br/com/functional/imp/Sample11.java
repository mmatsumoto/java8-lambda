package br.com.functional.imp;

import br.com.functional.util.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * Created by mmatsumoto on 6/29/17.
 */
public class Sample11 {

    public static void main(String[] args) {

        List<Person> people = Person.Companion.build();

        // imperative style
        Map<String, List<Person>> nameMap = new HashMap<>();
        for(Person p : people) {
            if (! nameMap.containsKey(p.getName())) {
                nameMap.put(p.getName(), new ArrayList<>());
            }
            nameMap.get(p.getName()).add(p);
        }
        System.out.println(nameMap);

        // 1 functional style
        nameMap.clear();
        for(Person p : people) {
            nameMap.computeIfAbsent(p.getName(), key -> new ArrayList<>())
                    .add(p);
        }
        System.out.println(nameMap);

        // 2 functional style
        final Map<String, List<Person>> map = people.stream()
                .collect(groupingBy(Person::getName));
        System.out.println(map);


        // 3 functional return map<name, age: List>
        final Map<String, List<Integer>> collect1 = people.stream()
                .collect(
                        groupingBy(Person::getName, mapping(Person::getAge, toList())));
        System.out.println(collect1);

    }
}
