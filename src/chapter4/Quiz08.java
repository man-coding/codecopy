package chapter4;

public class Quiz08 {

	public static void main(String[] args) {
		int score = 88;
		int value = score / 10;

		switch (value) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
	}

}
