// Write your code here
// Write your code here
package com.example.todo.model;

public class Todo {
    private int id;
    private String todo;
    private String priority;
    private String status;

    public Todo(int id, String todo, String priority, String status) {
        this.id = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}