package pr02;

public class Info_hiding {
	int n=7;//private 로 지정지 Main 클래스에서 오류 발생
	public void f() {
		System.out.println(n);
	}
}
