package lambda.model;

public class Course {
	
	private String name;
	private int student;
	
	public Course(String name, int student) {
		super();
		this.name = name;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", student=" + student + "]";
	}

}
