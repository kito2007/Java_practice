package pr01;

import java.util.Scanner;
import java.io.IOException;
public class Start {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("���ڸ� �Է��ϼ���: ");
		i = sc.nextInt();
		
		Info t = new Info();
		t.t = "�Ƹ��� ";
		System.out.println(t.t + t.set(i)+"�� ���̴�.");		
	}
}
