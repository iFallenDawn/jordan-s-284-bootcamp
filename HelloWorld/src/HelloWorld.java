
import java.util.ArrayList;
public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int num1 = 3;
		double num2 = 2.000001;
		String poop = "poop";
		char letter = 'A';
		boolean yes = true;
//		for x in range(0, 5):
//			print(x)
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Hello World " + i);
//		}
//		int[] list1 = new int[3];
		//[0,0,0]
		// 0,1,2
////		for(int i = 0; i < list1.length; i++) {
//			System.out.println(list1[i]);
//		}
//		System.out.println(list1[3]);
		ArrayList<String> poopIntegers = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			poopIntegers.add("" + i);
//			System.out.println(poopIntegers.get(i));
		}
//		System.out.println("Before: " + poopIntegers.get(0));
//		poopIntegers.remove(0);
//		System.out.println("After: " + poopIntegers.get(0));
//		poopIntegers.size();
		for(int i = 0; i < poopIntegers.size(); i++) {
			if(i == 5) {
				System.out.print("hello" + i);
			}
			else if(poopIntegers.get(i).equals("7")) {
				System.out.println("else if statement!");
			}
		}
	}
}
