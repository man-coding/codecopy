package chapter4.loop;


//1부터 10까지 더하기

public class Quiz01 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
	}

}
