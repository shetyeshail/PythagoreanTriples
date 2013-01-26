//Name and intent and stuff
package pkg605triplesid;

//Import stuff
import java.util.Scanner;
import java.util.Date;
import java.lang.Math;

//Start main class
public class Triples {

    //start main method
    public static void main(String[] args) {

        //initialize variables
        Scanner reader = new Scanner(System.in);
        Date today = new Date();
        double a, b, c;
        double m, n;
        boolean again = true;
        //start while loop
        while (again = true){
        //ask for and take input
        System.out.println("Input the 1st number (has to be greater than the 2nd number");
        m = reader.nextDouble();
        System.out.println("Input the 2nd number");
        n = reader.nextDouble();

        //calculations
        a = Math.pow(m, 2) - Math.pow(n, 2);
        b = 2 * m * n;
        c = Math.pow(m, 2) + Math.pow(n, 2);

        //output info
        System.out.println("The Values of A, B, and C are: ");
        System.out.println("a: " + n + "  b: " + m + "  c: " + Math.sqrt(c));
        System.out.println();
        System.out.println("The Pythagorean Triple is: ");
        System.out.println("a: " + a + "  b: " + b + "  c: " + c);

        //ending documentation
        System.out.println("Project 605: The Pythagorean Triple Program");
        System.out.println();
        System.out.println(today);
        
        }//end while loop
    }//end main method
}//end main class
