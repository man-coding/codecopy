package chapter3;

/*
 * 산술연산자, 비교연산자
 * 1. 7이 홀수라면 true 출력하세요 
 * 2. 10이 짝수라면 true 출력하세요
 */
public class Quiz06 {

	public static void main(String[] args) {
		int value1 = 7 % 2;
		boolean result1 = (value1 == 1);
		System.out.println(result1);
		
		int value2 = 10 % 2;
		boolean result2 = value2 == 0;
		System.out.println(result2);
		
		boolean result3 = (8 % 2 == 0);
		System.out.println(result3);
	}

}
