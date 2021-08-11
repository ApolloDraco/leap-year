/* 
 *  Description: Determines if the given year is a leap year or not
*/

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    	int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Year:");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
             // If year is divisible by 400 then the year is a leap year
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println("Year " + year + " is a Leap Year.");
        else
            System.out.println("Year " + year + " is not a Leap Year.");
    }
} 
}
