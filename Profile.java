package socialnet;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.sun.prism.Image;

public class Profile {

	ArrayList<Profile> member = new ArrayList<>();
	
	//Profile attributes
	private String uID, fName, lName, email, image, status;
	Menu menu = new Menu();
	private boolean isAMember;
	private String selection;
	
	//Constructors
	public Profile(String uID, String fName, String lName, String email, String image, String status) {
		super();
		this.uID    = uID;
		this.fName  = fName;
		this.lName  = lName;
		this.email  = email;
		this.image  = image;
		this.status = status;
	
	}
	
	public Profile() {}

	//Getters and Setters
	public String getuID() {return uID;	}

	public void setuID(String uID) { this.uID = uID; }

	public String getfName() { return fName;}

	public void setfName(String fName) {this.fName = fName;	}

	public String getlName() { return lName; }

	public void setlName(String lName) { this.lName = lName; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public String getImage() {return image;	}

	public void setImage(String im) {this.image = image;}

	public String getStatus() {	return status;	}

	public void setStatus(String status) {this.status = status;	}
	
	public String getSelection() {return selection;	}

	public void setSelection(String selection) {this.selection = selection;	}
	
	//Methods
	public void listAll() {
	/*
	 * This will list all members of the social network
	 */
	//	ArrayList<Profile> member = new ArrayList<>();
		System.out.println("Listing of All Members of   MiniNet");
		for (int i=0; i < member.size(); i++) {
			System.out.println(member.get(i).getuID()  + " " + member.get(i).getfName() + " " +
					member.get(i).getlName() + " " + member.get(i).getEmail() + " " +
					member.get(i).getImage() + " " + member.get(i).getStatus());		
			}
		}
	
	public void addMember( ) {
		//ArrayList<Profile> member = new ArrayList<>();
		boolean more = true;
		do  {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Member ID:- ");
			String id = scanner.nextLine();
			setuID(id);
		
			System.out.println("Enter Member First Name:- ");
			String fn = scanner.nextLine();
			setfName(fn);
		
			System.out.println("Enter Member Last Name:- ");
			String ln = scanner.nextLine();
			setlName(ln);
		
			System.out.println("Enter Member email:- ");
			String em = scanner.nextLine();
			setEmail(em);
		
			System.out.println("Enter Member image:- ");
			String im = scanner.nextLine();
			setImage(im);
		
			System.out.println("Enter Member status:- ");
			String st = scanner.nextLine();
			setStatus(st);
	    	member.add(new Profile(getuID(), getfName(), getlName(), getEmail(), getImage(), getStatus()));
			
	    	System.out.println("Any more Input? --- Y/N");
			String ch = scanner.next();
			if (ch.equals('N') || ch.equals('n')) {
				more = false;
			}
		}while 	(more);
	}
		
	public String getPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person Name:- ");
		String input = scanner.nextLine();
		for (int i=0; i < member.size(); i++) {
			if (input.equals(member.get(i).getfName()))
				selection = input;
				return selection;
			}
			System.out.println("Person entered not yet a member ");
			System.out.println("Want to try another?  -  1 for Yes; 0 for No");
			int yn = scanner.nextInt();
			if (yn == 1)
				menu.startMenu();
			else
				menu.startSubMenu();
			{
		return selection;
		}
	}
	
	public void displayProfile() {
		/*
		 * This method will display the profile of a selected member
		 */
		getPerson();
		for (int i=0; i < member.size(); i++) {
			if (getSelection().equals(member.get(i).getfName()))
				{
					System.out.print("Member Name:  ");
					System.out.print(member.get(i).getfName() + "  ");
					System.out.println(member.get(i).getlName() + "  ");
					System.out.println(" ");
					System.out.print("Email Address:  ");
					System.out.println(member.get(i).getEmail() + "  ");
					System.out.print("Image :  ");
					System.out.println(member.get(i).getImage() + "  ");
					System.out.print("Status :  ");
					System.out.println(member.get(i).getStatus());
				}
			}
		}
	
	
	public void updateProfile() {
		getPerson();
		//ArrayList<Profile> member = new ArrayList<>();
		for (int i=0; i < member.size(); i++) {
			if (getSelection().equals(member.get(i).getfName())) {
				System.out.print("Member Name:  ");
				System.out.print(this.getfName() + "  ");
				System.out.println(this.getlName() + "  Change? " + "   Y/N");
				System.out.println(" ");
				System.out.print("Email Address:  ");
				System.out.println(this.getEmail() + "  Change eMail ?   Y/N ");
				System.out.print("Image :  ");
				System.out.println(this.getImage()  +  "  Change image?    Y/N");
				System.out.println("Status   ");
				System.out.println(this.getStatus()  +  "  Change status?  Y/N" );
			}
		}
	}
	
	public void deleteMember() {
	//	Scanner scanner = new Scanner(System.in);
	//	System.out.println("Enter member name to delete :-");
	//	String  memberName = scanner.nextLine();
	//	ArrayList<Profile> member = new ArrayList<>();
		getPerson();
		for (int i=0; i < member.size(); i++) {
			if (getSelection().equals(member.get(i).getfName())) {
					member.remove(i);
					System.out.print("Item removed ...  ");
					break;
					}
				}
		}
	}
