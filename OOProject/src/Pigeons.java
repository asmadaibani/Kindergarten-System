
public class Pigeons implements Class{
	//Each class shouldn't have more than 10 students
		Student pigeonsclass[]=new Student[10];
		
		public static final int child_age=3;
		
	   static  int length=0;
	
	   public boolean classisfull() {
			if(length<=1)
				return false;
			else 
				return true;
		}
	   
		public void addpigeon(int age, String firstname, String lastname, int id) {
//			if(length<=9) {
//				pigeonsclass[length++]=new Student(age,firstname,lastname,id);
//
//			}
//			else
//				System.out.println("Sorry! The class is full");
			pigeonsclass[length++]=new Student(age,firstname,lastname,id);
				}
		
		
		public void display_pigeonsclass(int id) {
			boolean av=false;
			System.out.println("Your child is in the BIRDS CLASS");
		for(int i=0; i<length; i++) {
			if(pigeonsclass[i].getId()==id)
			{
				av=true;
			System.out.println("Your child's first name: "+pigeonsclass[i].getFirstname());
			System.out.println("Your child's last name: "+pigeonsclass[i].getLastname());
			System.out.println("Your child's age: "+pigeonsclass[i].getAge());
			System.out.println("Your child's ID: "+pigeonsclass[i].getId());
				break;
			}
		}
		if(!av)
			System.out.println("Not in our Class!");
		}
	
		
		// A method to check if an ID already exists
		public boolean checkID(int id) {
			boolean av=true;
			for(int i=0; i<length; i++) {
				if(id==pigeonsclass[i].getId()) {
						av=false; 
				       break;
				}
			}
			return av;
		}
		
		//A method that prints the whole class
		public void print_class() {
			for(int i=0; i<length; i++) {
				System.out.println("Child "+(i+1)+":\nFirst Name: "+pigeonsclass[i].getFirstname()+" Last Name: "+pigeonsclass[i].getLastname()+" Age: "+child_age+" ID: "+pigeonsclass[i].getId());
				System.out.println("------------------------------------------");
			}
		}
		
		
		//This is the an overridden method from the Class interface
		public void print_classinfo() {
			
			System.out.println("\n----------------------------PIGEONS CLASS--------------------------------------------\n");
			System.out.println("Your child is going to be in the ~Pigeons Class~\nThe Pigeons class is for 3 year old kids only!\nTo make our learning plan "
					+ "efficient, we only accept 10 kids in the class.");
			System.out.println("\n-------------------------------------------------------------------------------------\n");
			//Specific things about this class
			
		}
}
