// Lab 2 – Week 2
/* Lab2LoopsArrays.java
 * Author: Derek Christensen
 * Date: 20180424
*/

/** Lab2LoopsArrays.java
   PART 1:
   Store and analyze Exam Scores, including:
   - input
   - correctness of entries
   - AVG, MIN, MAX
   - output
   by using:
   - Arrays
   - Loops
   - number formatting
   - error checking & messaging
   
   PART 2:
   Expand PART 1 to include multiple class sections:
   - include use of a sentinel
   - inner and outer loops   
 */

import java. util.*;                 // required to use Scanner and Random classes
import java.text.DecimalFormat;     //required to use DecimalFormat class

public class Lab2LoopsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		int[] scores = new int[10];
		int sum = 0;
		double average;
		int low = 100, high = 0;
		
// Read in defined number of scores using the 'length'
// data property to control the loop
		System.out.println("Enter " + scores.length 
				            + " scores below:");
		int temp = -1;
		for (int i = 0; i < scores.length; i++) {
			temp = in.nextInt();
			while (temp < 0 || temp > 100) {
				System.out.println("Score must be a number from 0 to 100.");
				temp = in.nextInt();		
			} // end while
			scores[i] = temp;
			sum += scores[i];
			
			if (temp < low)
				low = temp;
			
			if (temp > high)
				high = temp;
			
		} // end for
		
		for (int score : scores) {
			System.out.println(score + " ");
		} // end for
		
		average = (double)sum/scores.length;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("\nClass Average = " + df.format(average));
		System.out.println("\nClass Low = " + low);
		System.out.println("\nClass High = " + high);
		
	} // end main
} // end class
