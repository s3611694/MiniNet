package socialnet;

public class Couple extends Family {
	
	public String father;
	public String mother;
	public String dependent;
	
	public Couple(String father, String mother, String dependent) {
		super(dependent, dependent, dependent);
		this.father = father;
		this.mother = mother;
		this.dependent = dependent;
	}

//	public Couple() {		
//	}
	
  //  void showFamilyLinks(); 

	
   // void showRelationships();
}
