package chapter7;

import java.util.Arrays;

public class Quiz07 {

	public static void main(String[] args) {

		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' };
		char[] newArr = { 'd', 'e' };

		System.arraycopy(srcArr, 1, newArr, 0, 2);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
	}

}
