package socialnet;

public class Dependent{
	
	private String dependentName;
	private int dependentAge;

public Dependent(String dependentName, int dependentAge) {
	super();
	this.dependentName = dependentName;
	this.dependentAge = dependentAge;
}
	public String getDependentName() {return dependentName;}

	public void setDependentName(String dependentName) {this.dependentName = dependentName;}

	public int getDependentAge() {return dependentAge;}

	public void setDependentAge(int dependentAge) {	this.dependentAge = dependentAge;}
}
