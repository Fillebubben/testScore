package com.example.testscore;

public class Person implements Comparable<Person>{ //Detta fixxa s� att man kan j�mf�ra 2 personer
	//Men vad skall man j�mf�ra? Kolla p� metoden Compare
	private String firstName;
 	private String lastName;
 	private int points;
 	public Person(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
 		this.firstName = firstName;
 		this.lastName = lastName;
 		setPoints(0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName + " Points: " + getPoints();	
	}

	
	public void addPoints(int pointsToAdd){
		setPoints(getPoints() + pointsToAdd);
	}

	private int getPoints() {
		return points;
	}

	private void setPoints(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(Person another) {
		return this.points - another.points; //Fundera p� detta och l�s
	}
}
