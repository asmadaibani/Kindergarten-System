public  class Birds implements Class{

	//Each class shouldn't have more than 10 students
	Student birdsclass[]=new Student[Class.student_count];
	public final int child_age=2;
   static int length=0;


   public boolean classisfull() {
		if(length<=1)
			return false;
		else 
			return true;
	}
   
	public void addbird(int age, String firstname, String lastname, int id) {
//			if(length<=Class.student_count) {  //student_count=9 in the Class interface
//				birdsclass[length++]=new Student(age,firstname,lastname,id);
//			}
//			else
//				System.out.println("Sorry! The class is full");
		birdsclass[length++]=new Student(age,firstname,lastname,id);
		}

	
	public void display_birdsclass(int id) {
		boolean av=false;
		System.out.println("Your child is in the BIRDS CLASS");
	for(int i=0; i<length; i++) {
		if(birdsclass[i].getId()==id)
		{
			av=true;
		System.out.println("Your child's first name: "+birdsclass[i].getFirstname());
		System.out.println("Your child's last name: "+birdsclass[i].getLastname());
		System.out.println("Your child's age: "+birdsclass[i].getAge());
		System.out.println("Your child's ID: "+birdsclass[i].getId());
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
			if(id==birdsclass[i].getId()) {
					av=false; 
			       break;
			}
		}
		return av;
	}
	
	//A method that prints the whole class
	public void print_class() {
		for(int i=0; i<length; i++) {
			System.out.println("Child "+(i+1)+":\nFirst Name: "+birdsclass[i].getFirstname()+" Last Name: "+birdsclass[i].getLastname()+" Age: "+child_age+" ID: "+birdsclass[i].getId());
			System.out.println("------------------------------------------");
		}
	}

	
	//This is the an overridden method from the Class interface
	public void print_classinfo() {
		System.out.println("\n------------------------------BIRDS CLASS------------------------------------------\n");
		System.out.println("Your child is going to be in the ~Birds Class~\nThe Birds class is for 2 year old kids only!\nTo make our learning plan "
				+ "efficient, we only accept 10 kids in the class.");
		System.out.println("\n-----------------------------------------------------------------------------------\n");
		//Specific things about this class
	}
}
