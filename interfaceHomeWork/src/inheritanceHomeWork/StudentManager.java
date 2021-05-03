package inheritanceHomeWork;

public class StudentManager extends UserManager {

	public void chooseCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " Kurs se�ti");
	}

	public void addWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " "
				+ " �devini teslim etti Githup hesab�n� payla�t�");
	}

	public void deleteWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " �devini sildi");
	}

	public void updateWork(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " �devini g�ncelledi");
	}

	public void evaluate(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "De�erlendirme yapt�");
	}

	public void addDuty(Student[] students) {
		for (Student student : students) {
			addWork(student);
		}

	}

}
