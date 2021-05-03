package inheritanceHomeWork;

public class StudentManager extends UserManager {

	public void chooseCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " Kurs seçti");
	}

	public void addWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " "
				+ " Ödevini teslim etti Githup hesabýný paylaþtý");
	}

	public void deleteWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " Ödevini sildi");
	}

	public void updateWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " Ödevini güncelledi");
	}

	public void evaluate(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "Deðerlendirme yaptý");
	}

	public void addDuty(Student[] students) {
		for (Student student : students) {
			addWork(student);
		}

	}

}
