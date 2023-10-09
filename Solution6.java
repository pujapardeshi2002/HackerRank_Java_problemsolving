import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
// java static Initializer block
import java.util.regex.*;

public class Solution6 {
    static boolean flag = true;
    static int B;
    static int H;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class