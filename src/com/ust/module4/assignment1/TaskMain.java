package com.ust.module4.assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TaskMain {

	public static void main(String[] args) {
		
	
	ToDoList myToDoList = new ToDoList(5);

   
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
        
        myToDoList.addTask("Finish homework", sdf.parse("10/09/2024"));
        myToDoList.addTask("Grocery shopping", sdf.parse("12/09/2024"));
        myToDoList.addTask("Call mom", sdf.parse("11/09/2024"));

       
        System.out.println("Tasks in the To-Do List:");
        myToDoList.displayTasks();

        myToDoList.removeTask(1);

        System.out.println("Tasks after removal:");
        myToDoList.displayTasks();
    } catch (ParseException e) {
        System.out.println("Date format is incorrect.");
    }
}
}
