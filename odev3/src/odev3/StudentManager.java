package odev3;

public class StudentManager {
	
public void record(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursuna kay�t yapt�n�z");
}
public void exit(Instructor instructor) {
	System.out.println(instructor.getCourseName()+" kursundan ayr�ld�n�z");
}
public void uploadinghomework(Instructor instructor)
{
	System.out.println(instructor.getHomework()+ " �devi y�klediniz");
}

}
