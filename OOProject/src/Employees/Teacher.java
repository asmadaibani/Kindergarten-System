package Employees;

public class Teacher extends Employee {

	public static int teacherSalary=2000;
	Teacher teacherarr[]=new Teacher[12];  // 12 which means 3 for each class 3 x 4 = 12
	static int length=0;
	public Teacher() {}
	Teacher(String fname, String lname, int ID){
		super(fname,lname,ID);
	}
	public void addteacher(String firstname,String lastname, int ID) {
		teacherarr[length++]=new Teacher(firstname,lastname,ID);
	}
	
	public boolean needteacher() {
		boolean need=true;
		if(length>11)
			need=false;
		return need;
	}
	
	public void print_employees() {
		System.out.println("\n-------------------TEACHERS---------------");
		System.out.println("_______________________");
		for(int i=0; i<length; i++) {
				System.out.println("First name: "+teacherarr[i].firstname);
				System.out.println("Last name: "+teacherarr[i].lastname);
				System.out.println("ID: "+teacherarr[i].ID);
				System.out.println("Salary: "+teacherSalary+"$");
				System.out.println("_______________________");
		}
		System.out.println("------------------------------------------\n");
	}
	
	// A method to check if an ID already exists
	public boolean checkID(int id) {
		boolean av=true;
		for(int i=0; i<length; i++) {
			if(id==teacherarr[i].ID) {
					av=false; 
			       break;
			}
		}
		return av;
	}
	
}
