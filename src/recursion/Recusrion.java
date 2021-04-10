package recursion;

public class Recusrion {

	public static void main(String[] args) {
		int a = 10;
		printNumbersTill(a);
	}

	private static void printNumbersTill(int a) {
		if (a > 0) {
			System.out.println(a);
			a--;
			//printNumbersTill(a);
		}
	}
}