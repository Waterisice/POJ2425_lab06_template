package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Address> addresses;

    public Person(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.addresses = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, addresses);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;
        return id == other.id
                && name.equals(other.name)
                && dateOfBirth.equals(other.dateOfBirth)
                && addresses.equals(other.addresses);
    }

    @Override
    public String toString() {

        String result = "(" + id + ", " + name + ", " + dateOfBirth + ")\n";
        result += "Adresy:\n";

        for (Address address : addresses) {
            result += address + "\n";
        }

        return result;
    }

    public Person copy() {
        return new Person(id, name, dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}