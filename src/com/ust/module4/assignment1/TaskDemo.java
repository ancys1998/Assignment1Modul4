package com.ust.module4.assignment1;


public class TaskDemo {
	
	private String description;
    private String dueDate;

    public TaskDemo(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task: " + description + ", Due: " + dueDate;
    }

}
