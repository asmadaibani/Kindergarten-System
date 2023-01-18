
public class Parrots implements Class{
	//Each class shouldn't have more than 10 students
		Student Parrotsclass[]=new Student[10];
		
		public final int child_age=5;
		
		
		static int length=0;
			 
		   public boolean classisfull() {
				if(length<=1)
					return false;
				else 
					return true;
			}
			public void addparrot(int age, String firstname, String lastname, int id) {
//				if(length<=9) {
//					Parrotsclass[length++]=new Student(age,firstname,lastname,id);
//
//				}
//				else
//					System.out.println("Sorry! The class is full");
				Parrotsclass[length++]=new Student(age,firstname,lastname,id);

					}
			public void display_parrotsclass(int id) {
				boolean av=false;
				System.out.println("Your child is in the BIRDS CLASS");
			for(int i=0; i<length; i++) {
				if(Parrotsclass[i].getId()==id)
				{
					av=true;
				System.out.println("Your child's first name: "+Parrotsclass[i].getFirstname());
				System.out.println("Your child's last name: "+Parrotsclass[i].getLastname());
				System.out.println("Your child's age: "+Parrotsclass[i].getAge());
				System.out.println("Your child's ID: "+Parrotsclass[i].getId());
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
					if(id==Parrotsclass[i].getId()) {
							av=false; 
					       break;
					}
				}
				return av;
			}
			
			//A method that prints the whole class
			public void print_class() {
				for(int i=0; i<length; i++) {
					System.out.println("Child "+(i+1)+":\nFirst Name: "+Parrotsclass[i].getFirstname()+" Last Name: "+Parrotsclass[i].getLastname()+" Age: "+child_age+" ID: "+Parrotsclass[i].getId());
					System.out.println("------------------------------------------");
				}
			}
			
		//This is the an overridden method from the Class interface
		public void print_classinfo() {
			
			System.out.println("\n----------------------------PARROTS CLASS--------------------------------------------\n");
			System.out.println("Your child is going to be in the ~Parrots Class~\nThe Parrots class is for 5 year old kids only!\nTo make our learning plan "
					+ "efficient, we only accept 10 kids in the class.");
			System.out.println("\n--------------------------------------------------------------------------------------\n");
			//Specific things about this class
		}
}
