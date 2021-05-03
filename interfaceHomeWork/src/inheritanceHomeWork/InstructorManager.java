package inheritanceHomeWork;

public class InstructorManager extends UserManager {
	@Override
	
	public void addDuty(Student student) {
		System.out.println("Hello everyone, your new assignments have been added to the system. ");
	}

	public void addCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.getCourse() + " " + " Kursu eklendi");
	}

	public void deleteCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.getCourse() + " " + "Seçilen kurs kodlama.io sitesinden kaldýrýldý.");
	}

	public void updateCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.getCourse() + " " + "Kursu içeriði deðiþtirildi");
	}
}
