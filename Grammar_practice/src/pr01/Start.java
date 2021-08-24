package pr01;

import java.util.Scanner;
import java.io.IOException;
public class Start {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		Info t = new Info();
		t.t = "아마도 ";
		System.out.println(t.t + t.set(i)+"일 것이다.");		
	}
}
