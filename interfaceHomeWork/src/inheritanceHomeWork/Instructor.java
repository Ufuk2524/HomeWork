package inheritanceHomeWork;

public class Instructor extends User{
	private String course;
	private String resume;

	public Instructor() {

	}

	public Instructor(String course, String resume) {
		super();
		this.course = course;
		this.resume = resume;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}
