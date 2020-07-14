package Main;

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Avg a = new Avg();
		System.out.println("Enter size of the array:");
		int size = s.nextInt();
		double avg = a.calc_avg(a.read_array(size));
		System.out.println("The result(avg) is:"+avg);
		System.out.println();
		
		Strings n = new Strings();
		System.out.println("Enter size of the String array:");
		size = s.nextInt();
		n.result_print(n.find_palindrome(n.read_string(size),size));
		System.out.println();
		
		Interfaces i = new Interfaces();
		System.out.println("Enter size of the List size:");
		size = s.nextInt();
		i.inter(size);
	}
}