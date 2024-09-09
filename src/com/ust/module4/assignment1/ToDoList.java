package com.ust.module4.assignment1;



public class ToDoList {
	
	private TaskDemo[] tasks;
    private int taskCount;

    public ToDoList(int size) {
        tasks = new TaskDemo[size];
        taskCount = 0;
    }

    public void addTask(String description, String dueDate) {
        if (taskCount < tasks.length) {
            tasks[taskCount++] = new TaskDemo(description, dueDate);
        } else {
            System.out.println("Task list is full. Cannot add more tasks.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < taskCount) {
            for (int i = index; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[--taskCount] = null;
        } else {
            System.out.println("Invalid index. Cannot remove task.");
        }
    }

    public void displayTasks() {
    	
        if (taskCount == 0) {
            System.out.println("No tasks to display.");
            return;
        }
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }

}
