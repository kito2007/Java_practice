package pr03;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world!");
		System.out.println(sb.toString());
		sb.insert(0, "Oh! ");
		System.out.println(sb.toString());
		System.out.println(sb.substring(0,5));
	}
}
