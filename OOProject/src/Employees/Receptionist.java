package Employees;

public class Receptionist extends Employee{
	
	public static int receptionistSalary=1000;
	Receptionist [] receptionistarr=new Receptionist[4]; // 4 so each one can also work as a supervisor for each class
	static int length=0;
	public Receptionist(){}
	
	Receptionist(String fname, String lname, int ID){
		super(fname,lname,ID);
	}
	
	public void addreceptionist(String firstname,String lastname, int ID) {
		receptionistarr[length++]=new Receptionist(firstname,lastname,ID);
	}
	
	public boolean needreceptionist() {
		boolean need=true;
		if(length>3)
			need=false;
		return need;
	}
	
	public void print_employees() {
		System.out.println("\n-------------------RECEPTIONIST---------------");
		System.out.println("_______________________");
		for(int i=0; i<length; i++) {
				System.out.println("First name: "+receptionistarr[i].firstname);
				System.out.println("Last name: "+receptionistarr[i].lastname);
				System.out.println("ID: "+receptionistarr[i].ID);
				System.out.println("Salary: "+receptionistSalary+"$");
				System.out.println("_______________________");
		}
		System.out.println("------------------------------------------\n");
	}
	
	// A method to check if an ID already exists
		public boolean checkID(int id) {
			boolean av=true;
			for(int i=0; i<length; i++) {
				if(id==receptionistarr[i].ID) {
						av=false; 
				       break;
				}
			}
			return av;
		}
}
