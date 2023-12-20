/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int lower=Integer.parseInt(args[0]);
		int higher=Integer.parseInt(args[1]);
		
		int a= (int) ((Math.random() * (higher - lower)) + lower );
		int b= (int) ((Math.random() * (higher - lower)) + lower );
		int c= (int) ((Math.random() * (higher - lower)) + lower );

		int minimal = Math.min(Math.min(a,b),c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The minimal generated number was "+minimal);

	}
}
