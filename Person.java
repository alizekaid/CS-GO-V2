package org.example;


public class Person implements Comparable <Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.name.compareTo(anotherPerson.name);
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname;
    }
}

