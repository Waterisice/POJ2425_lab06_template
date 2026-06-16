package com.pjatk.objects;

import java.util.ArrayList;
import java.util.Objects;

public class Address {
    private int id;
    private String city;
    private String postalCode;
    private ArrayList<String> addressLines;

    public Address(int id, String city, String postalCode) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.addressLines = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, postalCode, addressLines);
    }

    public ArrayList<String> getAddressLines() {
        return addressLines;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Address other = (Address) obj;

        return id == other.id
                && city.equals(other.city)
                && postalCode.equals(other.postalCode)
                && addressLines.equals(other.addressLines);
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + city + ", " + postalCode + ", " + addressLines + ")";
    }
}
