package chapter7;

import java.util.Arrays;

public class Quiz04 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));

		int cnt = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				arr[cnt] = i;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i <= 4; i++) {
			arr[i] = 2 * (i + 1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
