package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Friend extends Profile{

	private String firstPerson;
	private String secondPerson;
	private String relation;
		
	public Friend(String firstPerson, String secondPerson, String relation) {
		super();
		this.firstPerson = firstPerson;
		this.secondPerson = secondPerson;
		this.relation = relation;
		
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public void connectMembers() {
		
	}
		
	public void buildRelationship() {
				
	}
	
    public void showFamilyConnections() {
    	
    }

	public void showRelationships() {
		
	}
	
	public void connectMembers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first member name:  ");
		String memberA = scanner.nextLine();
		System.out.println("Enter second member name:  ");
		String memberB = scanner.nextLine();
		System.out.println("Enter relationship  ");
		String link = scanner.nextLine();
		ArrayList<Friend> connect =  new ArrayList<>();
		connect.add(new Friend(memberA, memberB, link));
}
