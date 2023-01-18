package Employees;

public abstract class Employee {


	 String firstname;
	 String lastname;
	 int ID;
	 
	 public abstract void print_employees();
	 public Employee( String fname, String lname, int ID) {
		this.firstname=fname;
		this.lastname=lname;
		this.ID=ID;
	
	}
	 Employee(){
		 
	 }

	public static void hiringCriteria() {
		 //print out our rules
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Kindergarten teachers instruct children in their first year (or years) of school. \nSo they must have at least half of these skills:\n");
		System.out.println("• Patience and flexibility\n• Creative and artistic abilities\n• Planning and organizational skills\n• Excellent communication skills for interacting "
				+ "\n   with children, coworkers and parents or guardians\n ");
		System.out.println("----------------------------------------------------------------------------------");
	 }
	
	public abstract boolean checkID(int id);
	
}
