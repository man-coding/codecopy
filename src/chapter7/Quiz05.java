package chapter7;

public class Quiz05 {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 20, 100, 30, 77 };
		int max;

		max = arr[0];
		for (int i = 1; i < 5; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
