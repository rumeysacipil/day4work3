package odev3;

public class Main {

	public static void main(String[] args) {
		User user=new User(1, "rumeysa", "�ipil", "dfhdjkjfhfdjsws", "1234");
				
		UserManager userManager=new UserManager();
		userManager.adduser(user);
		
		Instructor instructor=new Instructor(1, "engin", "demiro�", "engindemirog", "engin123", "java", "inheritance");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addcourse(instructor);
		
		Student student=new Student(1, "tu�ba", "y�ld�z", "tugbayildiz", "tugba123", "1425");
		StudentManager studentManager=new StudentManager();
		studentManager.uploadinghomework(instructor);
        
	}

}
