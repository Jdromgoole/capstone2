package com.capManagers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import capstone.domain.*;;

public class DataBaseManager {

	// Static variables aka Class variables
	// sharedInstnace is a Singelton
	private static DataBaseManager sharedInstance;

	// Instance Variables
	ArrayList<Musician> people = new ArrayList<Musician>();

	private DataBaseManager() {
		// Initialize the people into the instance
		this.addMusician(new Musician("sam@foo.com", "sam", UUID.randomUUID(), "abc"));
		this.addMusician(new Musician("bob@foo.com", "bob", UUID.randomUUID(), "def"));
		this.addMusician(new Musician("jill@foo.com", "jill", UUID.randomUUID(), "hij"));
		this.addMusician(new Musician("mary@apple.com", "mary", UUID.randomUUID(), "klm"));
		this.addMusician(new Musician("sam@apple.com", "sam", UUID.randomUUID(), "nop"));
		this.addMusician(new Musician("melba@ibm.com", "melba", UUID.randomUUID(), "qrs"));
	}

	private void addMusician(Musician musician) {
		// TODO Auto-generated method stub
		
	}

	// Initialize the sharedInstance singleton here
	public static DataBaseManager sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = new DataBaseManager();
		}

		return sharedInstance;
	}

	public void addUser(Musician Musician) {
		// TODO Auto-generated method stub
		people.add(Musician);
	}

	public ArrayList<Musician> getPeople() {

		Collections.sort(people);

		return people;
	}

	public Musician findUserWithNameAndEmail(String name, String email) {

		ArrayList<Musician> thePeople = getPeople();

		// Loop thru the users and find the one who has
		// the name and email we are looking for and return it.
		// If they are not found return null.
		for (Musician user : thePeople) {
			if ((user.getName().equalsIgnoreCase(name))
					&& (user.getEmail().equalsIgnoreCase(email))) {
				return user;
			}
		}
		// No user found matching name and email
		return null;
	}

	public Musician findUserWithNameAndPassword(String name, String password) {

		ArrayList<Musician> thePeople = getPeople();

		// Loop thru the users and find the one who has
		// the name and email we are looking for and return it.
		// If they are not found return null.
		for (Musician user : thePeople) {
			if ((user.getName().equalsIgnoreCase(name))
					&& (user.getPassword().equalsIgnoreCase(password))) {
				return user;
			}
		}
		// No user found matching name and email
		return null;
	}

	public Musician findUserWithID(String theUserID) {

		return findUserWithID(UUID.fromString(theUserID));

	}

	public Musician findUserWithID(UUID theUserID) {

		ArrayList<Musician> thePeople = getPeople();

		UUID id = theUserID;

		// Loop thru the users and find the one who has
		// the name and email we are looking for and return it.
		// If they are not found return null.
		for (Musician user : thePeople) {
			if ( user.getID().equals(id) ) {
				return user;
			}
		}
		// No user found matching name and email
		return null;

	}

}
