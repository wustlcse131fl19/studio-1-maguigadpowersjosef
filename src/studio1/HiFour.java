package studio1;

import support.cse131.ArgsProcessor;

import java.sql.SQLOutput;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Enter value for arg 0");
		ap = new ArgsProcessor(args);
		String s1 = ap.nextString("Enter value for arg 1");
		ap = new ArgsProcessor(args);
		String s2 = ap.nextString("Enter value for arg 2");
		ap = new ArgsProcessor(args);
		String s3 = ap.nextString("Enter value for arg 3");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");


	}
}
