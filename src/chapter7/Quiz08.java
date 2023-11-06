package chapter7;

public class Quiz08 {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		students[0] = new Student(1001, "James"); // 인스턴스를 생성하고 배열에 바로 저장
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "jEdward");

		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}

	}

}

class Student {

	int studentID;
	String name;

	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	public void showInfo() {
		System.out.println(studentID + "," + name);
	}

}
