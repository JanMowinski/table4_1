package main;

import java.util.Objects;
import java.util.UUID;

public class CrewMember {
    private final String id;
    private String name;
    private int age;

    public CrewMember(String name, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CrewMember)) return false;
        CrewMember that = (CrewMember) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age);
    }
}
