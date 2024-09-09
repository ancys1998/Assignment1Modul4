package com.ust.module4.assignment1;

import java.text.ParseException;
import java.util.Scanner;

public class TaskMain {

	public static void main(String[] args) throws ParseException {
		
	Scanner sc=new Scanner(System.in);
	ToDoList myToDoList = new ToDoList(5);


    myToDoList.addTask("Complete work", "10/09/2024");
	myToDoList.addTask("Shopping","12/09/2024");
	myToDoList.addTask("Pickup Dad", "11/09/2024");

      
	System.out.println("Tasks in the To-Do List:");
	myToDoList.displayTasks();

	System.out.println("Which task to be remove?");
	int tasknum=sc.nextInt();
	myToDoList.removeTask(tasknum);

	System.out.println("Tasks after removal:");
	myToDoList.displayTasks();
}
}
