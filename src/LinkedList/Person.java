package LinkedList;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private Person next = null;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name, String address, Person next) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Person getNext() {
        return next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
