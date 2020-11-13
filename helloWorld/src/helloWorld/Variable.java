package helloWorld;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 10;
		int sum = num2 + num1;
		int diff = num2 - num1;
		if (sum > diff) {
			System.out.println("결과 참입니다.");
		} else {
			System.out.println("결과 거짓입니다.");
		}

		boolean trueofFalse = num1 < num2;
		System.out.println(trueofFalse);
		
		if (trueofFalse) {
			System.out.println("결과 참입니다.");
		} else {
			System.out.println("결과 거짓입니다.");
		}
	}
}
