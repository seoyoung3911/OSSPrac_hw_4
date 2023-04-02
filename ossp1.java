import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String a,d,e;
		int b;
		
		System.out.print("이름을 입력하세요: ");
		a = sc.next();
		System.out.print("학번을 입력하세요: ");
		b = sc.nextInt();
		System.out.print("학과를 입력하세요: ");
		d = sc.next();
		System.out.print("학교를 입력하세요: ");
		e = sc.next();


		System.out.println();
		System.out.println("<출력>");
		System.out.println("이름: " + a);
		System.out.println("학번: " + b);
		System.out.println("학과: " + d);
		System.out.println("학교: " + d);


		sc.close();
		
	}

}
