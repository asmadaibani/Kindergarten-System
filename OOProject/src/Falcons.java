
public  class Falcons implements Class{

	//Each class shouldn't have more than 10 students
		Student Falconsclass[]=new Student[10];
		
		public final int child_age=4;
		
		 static  int length=0;
		   public boolean classisfull() {
				if(length<=1)
					return false;
				else 
					return true;
			}
		   
			public void addfalcon(int age, String firstname, String lastname, int id) {
//				if(length<=9) {
//					Falconsclass[length++]=new Student(age,firstname,lastname,id);
//
//				}
//				else
//					System.out.println("Sorry! The class is full");
		
				Falconsclass[length++]=new Student(age,firstname,lastname,id);
					
					}
			
	
		
			public void display_falconsclass(int id) {
				boolean av=false;
				System.out.println("Your child is in the BIRDS CLASS");
			for(int i=0; i<length; i++) {
				if(Falconsclass[i].getId()==id)
				{
					av=true;
				System.out.println("Your child's first name: "+Falconsclass[i].getFirstname());
				System.out.println("Your child's last name: "+Falconsclass[i].getLastname());
				System.out.println("Your child's age: "+Falconsclass[i].getAge());
				System.out.println("Your child's ID: "+Falconsclass[i].getId());
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
					if(id==Falconsclass[i].getId()) {
							av=false; 
					       break;
					}
				}
				return av;
			}
			
			//A method that prints the whole class
			public void print_class() {
				for(int i=0; i<length; i++) {
					System.out.println("Child "+(i+1)+":\nFirst Name: "+Falconsclass[i].getFirstname()+" Last Name: "+Falconsclass[i].getLastname()+" Age: "+child_age+" ID: "+Falconsclass[i].getId());
					System.out.println("------------------------------------------");
				}
			}
		
		//This is the an overridden method from the Class interface
		public void print_classinfo() {
			
			System.out.println("\n---------------------------FALCONS CLASS---------------------------------------------\n");
			System.out.println("Your child is going to be in the ~Flacons Class~\nThe Falcons class is for 4 year old kids only!\nTo make our learning plan "
					+ "efficient, we only accept 10 kids in the class.");
			System.out.println("\n-------------------------------------------------------------------------------------\n");
			//Specific things about this class
			
		}
}
