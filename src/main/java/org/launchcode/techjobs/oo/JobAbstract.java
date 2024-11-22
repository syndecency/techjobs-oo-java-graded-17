package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobAbstract {
    private int id;
    private static int nextId = 1; //shared across all instances of the class
    private String value;

    public JobAbstract() {
        id = nextId;
        nextId++;
    }

    public JobAbstract(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobAbstract that = (JobAbstract) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
