package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Family extends Profile{
	
		private String firstPerson;
		private String secondPerson;
		private String dependent;
	
	
	public Family(String firstPerson, String secondPerson, String dependent) {
			super();
			this.firstPerson = firstPerson;
			this.secondPerson = secondPerson;
			this.dependent = dependent;
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

	public String getDependent() {
		return dependent;
	}

	public void buildRelation() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first member name:  ");
			String memberA = scanner.nextLine();
			System.out.println("Enter second member name:  ");
			String memberB = scanner.nextLine();
			System.out.println("Enter relationship  ");
			String link = scanner.nextLine();
			ArrayList<Family> connect =  new ArrayList<>();
			connect.add(new Family(memberA, memberB, link));
		}
			
	public Profile connectFamily() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first member name:  ");
		String memberA = scanner.nextLine();
		System.out.println("Enter second member name:  ");
		String memberB = scanner.nextLine();
		System.out.println("Enter relationship  ");
		String link = scanner.nextLine();
		ArrayList<Family> connect =  new ArrayList<>();
		connect.add(new Family(memberA, memberB, link));
	}
	
	
    public void showFamilyLinks() {
    	ArrayList<Family> link = new ArrayList<>();
    	String firstPeson = link.get(0).getFirstPerson();
    	for (int i=0; i < link.size(); i++) {
    		if (!link.get(i).getDependent().equals("friend")){
    			System.out.println(link.get(i).getFirstPerson() + " " + 
    		         link.get(i).getDependent() + "   of "  + link.get(i).getSecondPerson());		
    			}
    		}
    	}	
   
	public void showRelation() {
		ArrayList<Profile> member;
		ArrayList<Link> link = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name Of Second Member:  ");
		String memberName = scanner.nextLine();
		System.out.println(":Link between  " +  fName + " " + memberName);
			//String firstPeson = connection.getFirstPerson();
		for (int i=0; i < link.size(); i++) {
			if (memberName.equals(link.get(i).getFirstPerson())) {
				if (link.get(i).getConnection().equals("family")
					||link.get(i).getConnection().equals("dependent" )
					||link.get(i).getConnection().equals("child")
					||link.get(i).getConnection().equals("daughter")
					||link.get(i).getConnection().equals("son" )
					||link.get(i).getConnection().equals("wife" ))
					System.out.println(memberName  + "  is a " + 
						link.get(i).getConnection() + " Of  " + 
						link.get(i).getSecondPerson());		
					}
					System.out.println("Member does not exist or  has no Link ...");
				}
			}
		}

