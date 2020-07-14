package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Interfaces {
	private static Scanner s = new Scanner(System.in); 
    void inter(int size){
        List<String> myList = new ArrayList<>();
        for(int i = 0;i < size;i++) {
        myList.add(s.next());
        }
       myList.stream().forEach(n -> { if (n.startsWith("a") && n.length() == 3) System.out.println(n); });
             
    }
}

