package Employees;

public class Janitor extends Employee{

	public static int janitorSalary=1500;
	Janitor [] janitorarr=new Janitor[2];
	
	public Janitor(){}
	
	static int length=0;
	Janitor(String fname, String lname, int ID){
		super(fname,lname,ID);
	}
	
	public void addjanitor(String firstname,String lastname, int ID) {
		janitorarr[length++]=new Janitor(firstname,lastname,ID);
	}
	public boolean needjanitor() {   //janitor array is full or not
		boolean need=true;
		if(length>1)
			need=false;
		return need;
	}
	
	public void print_employees() {
		
		System.out.println("\n-------------------JANITORS---------------");
		System.out.println("_______________________");
		for(int i=0; i<length; i++) {
				System.out.println("First name: "+janitorarr[i].firstname);
				System.out.println("Last name: "+janitorarr[i].lastname);
				System.out.println("ID: "+janitorarr[i].ID);
				System.out.println("Salary: "+janitorSalary+"$");
				System.out.println("_______________________");
		}
		System.out.println("------------------------------------------\n");
	
	}
	
	// A method to check if an ID already exists
		public boolean checkID(int id) {
			boolean av=true;
			for(int i=0; i<length; i++) {
				if(id==janitorarr[i].ID) {
						av=false; 
				       break;
				}
			}
			return av;
		}
	
	
}
