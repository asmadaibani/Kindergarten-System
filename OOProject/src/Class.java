
public interface Class {
		
    int student_count=10;
 
	void print_classinfo();    
	boolean checkID(int id);
	void print_class();
	  public boolean classisfull();
//All these methods are going to be overridden during runtime! (Dynamic Polymorphism)
}
