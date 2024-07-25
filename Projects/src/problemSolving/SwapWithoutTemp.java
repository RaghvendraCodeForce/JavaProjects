package problemSolving;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping the numbes :");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a = a+b; // 10+20 = 30
		b = a-b; // 30-20 = 10 basically b=a;
		a = a-b;
		
		System.out.println("After swapping the numbers :");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
