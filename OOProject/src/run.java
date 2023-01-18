import java.util.Scanner;

import Employees.Employee;
import Employees.Janitor;
import Employees.Receptionist;
import Employees.Supervisor;
import Employees.Teacher;

public class run {

	public static void main(String [] args) {
	
		Scanner console=new Scanner(System.in);
	
		int x=1;  //To keep the while loop going
		
		Receptionist resUP=new Supervisor();  //Upcasting  //Deals with the parent class only
		Supervisor resUP2=(Supervisor) resUP;  //Downcasting  //Deals with both parent and child stuff
	
		
		
		 /*-------------------------------------------------------------------------------*/
						Teacher      teacher      = new Teacher();
						Janitor      janitor      = new Janitor();
						Receptionist receptionist = new Receptionist();
		/*an object for each employee class so I can invoke any method from these classes!*/
		
		
		/*an object for each student class so I can invoke any method from these classes!*/
							 Birds   bird  =new Birds();
							 Pigeons pigeon=new Pigeons();
							 Falcons falcon=new Falcons();
							 Parrots parrot=new Parrots();
		 /*-------------------------------------------------------------------------------*/
		while(x!=0) {
			System.out.println("Make sure you give a unique ID to every student/employee even in DIFFERENT classes/jobs!");
			System.out.println("--------------------Students and employees can have similar IDs!------------------------");
			System.out.println();
			System.out.println("-----------------PARENTS ONLY------------------------");
			System.out.println("| 0. Exit                                           |");
			System.out.println("| 1. Add a child                                    |");
			System.out.println("| 2. Display your child's info                      |");
			System.out.println("| 3. Display your child's whole class               |");
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("----------------EMPLOYEES ONLY-----------------------");
			System.out.println("| 0. Exit                                           |");
			System.out.println("| 4. Display our hiring criteria                    |");
			System.out.println("| 5. Get hired (add an employee)                    |");
			System.out.println("| 6. Display all employees                          |");
			System.out.println("-----------------------------------------------------");
			 x=console.nextInt();
			switch(x) {
			case 1:
					
				
				System.out.println("How old is your child?");
					int age=console.nextInt();	
//				   try {
//				        // Get input 
//				        System.out.print(" ");
//				        age = console.nextInt();
//				    } catch (InputMismatchException e) {
//				        System.out.print("Invalid number. ");
//				    }
		

				if(age==2) {
					if(bird.classisfull()) {
						System.out.println("Sorry! The class is full");
						break;
					}
					bird.print_classinfo();
					System.out.println("What's your child's first name? ");
					String childfirstname=console.next();
					System.out.println("What's your child's last first name? ");
					String childlastname=console.next();
					System.out.println("Pick a number to be your child's id:");
				boolean idav=true;  //idav= ID Availble 
					do {
						int id=console.nextInt();
					if(bird.checkID(id) && pigeon.checkID(id)&& falcon.checkID(id)&&parrot.checkID(id)) {//a function that checks if the ID exists or not!
						bird.addbird(age, childfirstname, childlastname,id);
						idav=false;
					}
					else 
						System.out.println("This ID already exists! Pick another one");
					}while(idav);
				
				}
				else if(age==3) { //Another way: age==Pigeons.child_age
					if(pigeon.classisfull()) {
						System.out.println("Sorry! The class is full");
						break;
					}
					pigeon.print_classinfo();
					System.out.println("What's your child's first name? ");
					String childfirstname=console.next();
					System.out.println("What's your child's last first name? ");
					String childlastname=console.next();
					System.out.println("Pick a number to be your child's id:");
					boolean idav=true;  //idav= ID Availble 
					do {
						int id=console.nextInt();
					if(bird.checkID(id) && pigeon.checkID(id)&& falcon.checkID(id)&&parrot.checkID(id)) {//a function that checks if the ID exists or not!
						pigeon.addpigeon(age, childfirstname, childlastname,id);
						idav=false;
					}
					else 
						System.out.println("This ID already exists! Pick another one");
					}while(idav);
				}
				else if(age==4) {
					if(falcon.classisfull()) {
						System.out.println("Sorry! The class is full");
						break;
					}
					falcon.print_classinfo();
					System.out.println("What's your child's first name? ");
					String childfirstname=console.next();
					System.out.println("What's your child's last first name? ");
					String childlastname=console.next();
					System.out.println("Pick a number to be your child's id:");
					boolean idav=true;  //idav= ID Availble 
					do {
						int id=console.nextInt();
					if(bird.checkID(id) && pigeon.checkID(id)&& falcon.checkID(id)&&parrot.checkID(id)) {//a function that checks if the ID exists or not!
						falcon.addfalcon(age, childfirstname, childlastname,id);
						idav=false;
					}
					else 
						System.out.println("This ID already exists! Pick another one");
					}while(idav);
					
					
				}
				else if(age==5) {
					if(parrot.classisfull()) {
						System.out.println("Sorry! The class is full");
						break;
					}
					parrot.print_classinfo();
					System.out.println("What's your child's first name? ");
					String childfirstname=console.next();
					System.out.println("What's your child's last first name? ");
					String childlastname=console.next();
					System.out.println("Pick a number to be your child's id:");
					boolean idav=true;  //idav= ID Available 
					do {
						int id=console.nextInt();
					if(bird.checkID(id) && pigeon.checkID(id)&& falcon.checkID(id)&&parrot.checkID(id)) {//a function that checks if the ID exists or not!
						parrot.addparrot(age, childfirstname, childlastname,id);
						idav=false;
					}
					else 
						System.out.println("This ID already exists! Pick another one");
					}while(idav);
				
					
				}
				else if(age>5 || age<2)
					System.out.println("Our kindergarten age range is 2-5");
	
				break;
			case 2:
				System.out.println("What is your child's id?");
				int id=console.nextInt();
				if(!bird.checkID(id)) { 
					bird.display_birdsclass(id);   //No need to put the id but it's needed if it's done the other way (commented out)
				}
				else if(!pigeon.checkID(id)) {
					pigeon.display_pigeonsclass(id);
				}
				else if(!falcon.checkID(id)) {
					falcon.display_falconsclass(id);
				}
				else if(!parrot.checkID(id)) {
					parrot.display_parrotsclass(id);
				}
				else 
					System.out.println("Not in our school!");
				
//				System.out.println("how old is your child?");
//				 age=console.nextInt();
//				if(age==2) {5
				
//						bird.display_birdsclass(id);
//				}
//				else if(age==3) {
//					pigeon.display_pigeonsclass(id);
//				}
//				else if(age==4) {
//					falcon.display_falconsclass(id);
//				}
//				else if(age==5) {
//					parrot.display_parrotsclass(id);
//				}
//				else 
//					System.out.println("Our kindergarten age range is 2-5");
				
				break;
			case 3:
				System.out.println("how old is your child?");
				 age=console.nextInt();
				 if(age==2) {
						bird.print_class();
				}
				else if(age==3) {
					pigeon.print_class();
				}
				else if(age==4) {
					falcon.print_class();
				}
				else if(age==5) {
				parrot.print_class();
				}
				else 
					System.out.println("Our kindergarten age range is 2-5");
			break;
			case 4:
				Employee.hiringCriteria();
				break;
			case 5:
				System.out.println("What job are you looking for?");
				System.out.println("A. Teacher");
				System.out.println("B. Receptionist");
				System.out.println("C. Janitor");
				char empchoice=console.next().charAt(0);  //empchoice=employee choice: janitor/teacher/receptionist
				switch(empchoice) {
				case 'a': //teacher
				case 'A':
					if(teacher.needteacher()) {
						System.out.println("What is your first name: ");
						String empfirstname=console.next();
						System.out.println("What is your last name: ");
						String emplastname=console.next();
						System.out.println("Pick a number to be your ID:");
						
						boolean idav=true;  //idav= ID Availble 
						do {
							int empID=console.nextInt();
						
						if(teacher.checkID(empID)&&receptionist.checkID(empID)&&janitor.checkID(empID)) {//a function that checks if the ID exists or not!
							teacher.addteacher(empfirstname, emplastname, empID);
							idav=false;
						}
						else 
							System.out.println("This ID already exists! Pick another one");
						}while(idav);
					}
					else 
						System.out.println("We have enough teachers!");
					
					break;
				case 'b':  //receptionist
				case 'B':
					if(receptionist.needreceptionist()) {
						System.out.println("What is your first name: ");
						String empfirstname=console.next();
						System.out.println("What is your last name: ");
						String emplastname=console.next();
						System.out.println("Pick a number to be your ID:");
						boolean idav=true;  //idav= ID Availble 
						do {
							int empID=console.nextInt();
						
						if(teacher.checkID(empID)&&receptionist.checkID(empID)&&janitor.checkID(empID)) {//a function that checks if the ID exists or not!
						receptionist.addreceptionist(empfirstname, emplastname, empID);
							idav=false;
						}
						else 
							System.out.println("This ID already exists! Pick another one");
						}while(idav);
						
					}
					else 
						System.out.println("We have enough receptionist!");
					break;
				case 'c':  //janitor
				case 'C':
					if(janitor.needjanitor()) {
									System.out.println("What is your first name: ");
					String empfirstname=console.next();
					System.out.println("What is your last name: ");
					String emplastname=console.next();
					System.out.println("Pick a number to be your ID:");
					boolean idav=true;  //idav= ID Availble 
					do {
						int empID=console.nextInt();
					
					if(teacher.checkID(empID)&&receptionist.checkID(empID)&&janitor.checkID(empID)) {//a function that checks if the ID exists or not!
						janitor.addjanitor(empfirstname, emplastname, empID);
						idav=false;
					}
					else 
						System.out.println("This ID already exists! Pick another one");
					}while(idav);
				
					}
					else 
						System.out.println("We have enough janitors!");
					break;
					default:
						System.out.println("INVALID OPTION! TRY AGAIN");
				}
				break;
			case 6:
				teacher.print_employees();
				receptionist.print_employees();
				janitor.print_employees();
				break;
			}
		}
	}
}
