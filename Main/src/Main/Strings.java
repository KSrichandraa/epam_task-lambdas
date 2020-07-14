package Main;
import java.util.Scanner;

public class Strings {
	private Scanner s = new Scanner(System.in); 
	
	void result_print(String[] result) {
		int k = 0;
		System.out.println("The elements which are palindrome are:");
		for(int i = 0; i < result.length; i++) {
			if(result[i] == null) {
				break;
			}
			k += 1;
			System.out.println(result[i]);
		}
		
		System.out.println("The total length of strings which are palindrome:"+k);
	}
	
	boolean check_palindrome(String s) {
		
		for(int i = 0; i < (int)s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i -1)) {
				return false;
			}
		}
		return true;
	}
	
	String[] read_string(int size) {
		String[] array = new  String[size];
		System.out.println("Enter the elements of string:");
		for(int i = 0; i < size; i++) {
			array[i] = s.next();
		}
		return array;
	}
	
	String[] find_palindrome(String[] array, int size) {
		
		String[] arrays = new String[size];
		int k = 0;

		for(int i = 0; i < size ; i++) {
			if(check_palindrome(array[i].toLowerCase())) {
				arrays[k] = array[i];
				k += 1;
			}
		}
		return arrays;
	}
}
