package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 23:19
 */
public class Person {
    String firstName;
    String lastName;

    Person(){}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String fullName(){
        return this.firstName + " " + this.lastName;
    }
    public static void main(String[] args) {
        //Instead of implementing the factory manually,
        // we glue everything together via constructor references:
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Andy", "Liu");
        System.out.println(person.fullName());//Andy Liu
    }
}
