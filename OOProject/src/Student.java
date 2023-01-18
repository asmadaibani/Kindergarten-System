public class Student {

	private int age;
	private String firstname,lastname;
	private int id;
	
	Student(int age, String firstname, String lastname, int id){
		this.age=age; 
		this.firstname=firstname;
		this.lastname=lastname;
        this.id=id;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}

	public int getId() {
		return id;
	}


	
}
