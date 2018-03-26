package socialnet;

public class MembersList {

	private static MembersList instance = new MembersList();
	
	private MembersList() {}
	
	public static MembersList getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Listing of members added to the network ...   " + getInstance().toString() );
	}
}



