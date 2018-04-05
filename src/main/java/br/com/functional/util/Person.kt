package br.com.functional.util

/**
 * Created by mmatsumoto on 6/28/17.
 */

data class Person(val age: Int, val name: String) {

       companion object {
           fun build() = listOf(
               Person(10, "João"),
               Person(20, "João"),
               Person(18, "Maria"),
               Person(11, "Maria"),
               Person(30, "Paulo"),
               Person(40, "Mariana"))
       }
}
