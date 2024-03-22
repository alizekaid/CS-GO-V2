package org.example;

import java.util.Arrays;


public class PersonCollection {
    private Person[] p_array;
    private int size;

    public PersonCollection(int capacity) {
        p_array = new Person[capacity];
        size = 0;
    }

    public void add(String name, String surname) {
        if (size < p_array.length) {
            Person person = new Person(name, surname);
            p_array[size] = person;
            size++;
        }
    }

    public void sort() {
        Arrays.sort(p_array, 0, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < size; k++) {
            sb.append(p_array[k].toString()).append("\n");
        }
        return sb.toString();

    }
}