package practice;

public class Practice2 {

	public static void main(String[] args) {
		String[][] seats = new String[10][15];
		char ch = 'A';// char형으로 좌석 시트 넘버링을 줘보자.

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = String.valueOf(ch) + (j + 1);// seats배열은 String타입의 배열이기에
				// Stirng.valueOf메소드를 이용해 ch를 String 타입으로 변환
				// 문자열 + 숫자는 문자열이 된다.
			}
			ch++;
		}

		// 영화관 좌석 번호 확인
		for (int i = 0; i < seats.length; i++) {// 세로 기준
			for (int j = 0; j < seats[i].length; j++) {// 가로
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();

		}

	}
}
