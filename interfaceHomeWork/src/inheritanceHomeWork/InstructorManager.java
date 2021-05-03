package inheritanceHomeWork;

public class InstructorManager extends UserManager {
	@Override
	
	public void addDuty(Student student) {
		System.out.println("Hello everyone, your new assignments have been added to the system. ");
	}

	public void addCourse(Instructor ınstructor) {
		System.out.println(ınstructor.getCourse() + " " + " Kursu eklendi");
	}

	public void deleteCourse(Instructor ınstructor) {
		System.out.println(ınstructor.getCourse() + " " + "Seçilen kurs kodlama.io sitesinden kaldırıldı.");
	}

	public void updateCourse(Instructor ınstructor) {
		System.out.println(ınstructor.getCourse() + " " + "Kursu içeriği değiştirildi");
	}
}
