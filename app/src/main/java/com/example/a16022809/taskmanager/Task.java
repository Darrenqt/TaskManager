package com.example.a16022809.taskmanager;

import java.io.Serializable;

public class Task implements Serializable {
    private int id;
    private String task_name;
    private String description;

    public Task(int id, String task_name, String description) {
        this.id = id;
        this.task_name = task_name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
