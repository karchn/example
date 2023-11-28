package maincode;

public class Greatestof4 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20, c=15, d= 25;

		if(a>b && a>c && a>d) {
			System.out.println("a is the greatest");
		}
			else if(b>c && b>d) {
				System.out.println("b is the greatest");
			}
			else if(c>d) {
				System.out.println("c is the greatest");
		}
			else {
				System.out.println("d is the greatest");
			}
	}

}
