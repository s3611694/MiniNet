package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Link implements Relation{
	
	private String firstPerson;
	private String secondPerson;
	private String connection;
	
	public Link(String firstPerson, String secondPerson, String connection) {
		super();
		this.firstPerson = firstPerson;
		this.secondPerson = secondPerson;
		this.connection = connection;
	}

	public String getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(String firstPerson) {
		this.firstPerson = firstPerson;
	}

	public String getSecondPerson() {
		return secondPerson;
	}

	public void setSecondPerson(String secondPerson) {
		this.secondPerson = secondPerson;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	abstract void buildRelation();
	
	abstract void connectMembers(); 
	
    abstract void showFamilyLinks(); 

	abstract void showRelationships();
}
