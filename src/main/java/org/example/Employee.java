package org.example;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee() {
        super();
    }

    public Employee(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
