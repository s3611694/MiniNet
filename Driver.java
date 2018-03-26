package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.prism.Image;

public class Driver {
	
	public static void main(String[] args) { 
		
		//Loading profiles of members
		ArrayList<Profile> member = new ArrayList<>();
		member.add(new Profile("001", "Homer", "Simpson", "homer@hotmail.com", " ", "0" ));
		member.add(new Profile("002", "Tim", "Johnson", "tim@hotmail.com", " ", "0" ));
		member.add(new Profile("003", "Pardon", "Gumbo", "pardon@hotmail.com", " ", "1" ));
		member.add(new Profile("004", "Juda", "BenHur", "juda@hotmail.com", " ", "1" ));
		member.add(new Profile("005", "James", "Miller", "james@hotmail.com", " ", "0" ));
		
		//Loading friends' Linkships
		ArrayList<Link> link = new ArrayList<>();
		link.add(new Link("James", "Rob", "friend"));
		link.add(new Link("Philip", "Elizabeth", "friend"));
		link.add(new Link("John", "Linda", "friend"));
		link.add(new Link("Tim", "Andy", " friend"));
		link.add(new Link("Pardon", "Eddie", "friend"));
		link.add(new Link("Ben", "Maggie", "friend"));
		link.add(new Link("Ben", "Maggie", "friend"));
		link.add(new Link("James", "Rob", "friend"));
		//ArrayList<Family> family = new ArrayList<>();
		link.add(new Link("Homer", "Lisa", "dependent"));
		link.add(new Link("Homer", "Margie", "couple"));
		link.add(new Link("Philip", "Elizabeth", "coupler"));
		link.add(new Link("John", "Linda", "couple"));
		link.add(new FLink("Pardon", "Eddie", "brothers"));
		
		System.out.println("Starting the run ....");
		
		Menu menu = new Menu();
		menu.startMenu();
	}
}
