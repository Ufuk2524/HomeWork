package inheritanceHomeWork;

public class InstructorManager extends UserManager {
	@Override
	
	public void addDuty(Student student) {
		System.out.println("Hello everyone, your new assignments have been added to the system. ");
	}

	public void addCourse(Instructor �nstructor) {
		System.out.println(�nstructor.getCourse() + " " + " Kursu eklendi");
	}

	public void deleteCourse(Instructor �nstructor) {
		System.out.println(�nstructor.getCourse() + " " + "Se�ilen kurs kodlama.io sitesinden kald�r�ld�.");
	}

	public void updateCourse(Instructor �nstructor) {
		System.out.println(�nstructor.getCourse() + " " + "Kursu i�eri�i de�i�tirildi");
	}
}
