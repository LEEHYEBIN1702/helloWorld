package helloWorld;

public class HelloWorld {
    public static void main(String[] args) {
		String name = "Hong killdong";
		name = "홍길동";
		System.out.println("My name is " + name);
		int age = 20;
		System.out.println("My age is " + age);
		int height = 170;
		System.out.println("내 키는 " + height);
	    name = "홍길동 키는";
	    height = 170;
		System.out.println(name + " " + height +"입니다." );
		name = "이혜빈 키는 ";
	    height = 165;
		System.out.println(name + height +" 입니다." );
		
		String name1 = "김다현";
		int age1 = 23;		
	    int height1 = 161;
		System.out.println(name1 +"은" + " " + age1 + "이고 키는" + " " + height1 + "입니다." );
		System.out.println("두 사람 나이의 합은" + " " + (age + age1) + "입니다.");
	    }
}
