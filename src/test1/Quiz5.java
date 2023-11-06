package test1;

public class Quiz5 {

	public static void main(String[] args) {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {

			sum = sum + i;

			if (sum > 300) {
				break;
			}

		}
		System.out.println(i);
		System.out.println(sum);
	}

}
//aa