package ru.koptev.taskmanager.entity;

public class Task {

    private long id = System.nanoTime();

    private String name = "";

    private String description = "";

    public Task() {

    }

    public Task(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

}
