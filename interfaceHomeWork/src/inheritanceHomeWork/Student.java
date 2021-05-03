package inheritanceHomeWork;

public class Student extends User {
	
	private String myCourses;
	private String courseSchedule;
	private String homework;
	private String completionRate;
	private String evaluation;
	
	public Student() {
		
	}

	public Student(String myCourses, String courseSchedule, String homework, String completionRate, String evaluation) {
		this();
		this.myCourses = myCourses;
		this.courseSchedule = courseSchedule;
		this.homework = homework;
		this.completionRate = completionRate;
		this.evaluation = evaluation;
	}

	public String getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses) {
		this.myCourses = myCourses;
	}

	public String getCourseSchedule() {
		return courseSchedule;
	}

	public void setCourseSchedule(String courseSchedule) {
		this.courseSchedule = courseSchedule;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

	public String getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(String completionRate) {
		this.completionRate = completionRate;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	

}
