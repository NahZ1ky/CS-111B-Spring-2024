// Author: C.Conner
// Date of Last Modification: 03/19/2024
// Course: CS111B
// File Name: TemperatureTest.java
// Driver class to test objects of type Temperature


import java.util.Scanner;

public class TemperatureTest
{
   public static void main(String[] args)
   {

        //dummy variable to stop scrolling so user can see test results
	@SuppressWarnings("unused")
	String junk;
	Scanner scan = new Scanner(System.in);

	System.out.println();
	System.out.println("Test case 1: default constructor and");
	System.out.println("writeOutput() method.");
	System.out.println();
	Temperature t1 = new Temperature();
   	System.out.println("Results of default constructor:");
	System.out.println("Verify 0 degrees C.");
	System.out.println();
	t1.writeOutput();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
	System.out.println();

	System.out.println("Test case 2: NOT IMPLEMENTED.");

	System.out.println("Test case 3: constructor with just"
		+ " temperature.");
	Temperature t2 = new Temperature(20.5);
 	System.out.println();
 	System.out.println("Verify 20.5 degrees C.");
 	System.out.println();
 	t2.writeOutput();
 	System.out.println();
 	System.out.println("Hit 'y' to continue.");
 	junk = scan.nextLine();
 	System.out.println();

   	System.out.println("Test case 4: constructor with just units,"
		+ " F.");
 	System.out.println();
 	System.out.println("Verify 0 degrees F.");
 	System.out.println();
 	Temperature t3 = new Temperature('F');
 	t3.writeOutput();
 	System.out.println();
 	System.out.println("Hit 'y' to continue.");
 	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 5: constructor with just units,"
				+ " C.");
    System.out.println();
 	System.out.println("Verify 0 degrees C.");
 	System.out.println();
 	Temperature t4 = new Temperature('C');
 	t4.writeOutput();
 	System.out.println();
 	System.out.println("Hit 'y' to continue.");
 	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 6: constructor with"
			+ " temperature and units.");
 	System.out.println();
 	System.out.println("Verify -51.2 degrees F.");
 	System.out.println();
 	Temperature t5 = new Temperature(-51.2, 'F');
 	t5.writeOutput();
 	System.out.println();
 	System.out.println("Hit 'y' to continue.");
 	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 7: write degrees C, "
			+ "original in F.");
	System.out.println();
	System.out.println("Verify -46.2 degrees C.");
	System.out.println();
	t5.writeC();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 8: write degrees C, "
			+ "original in C.");
	System.out.println();
	System.out.println("Verify 0 degrees C.");
	System.out.println();
	t4.writeC();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 9: write degrees F, "
			+ "original in C.");
	System.out.println();
	System.out.println("Verify 32 degrees F");
	System.out.println();
	t4.writeF();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

  	System.out.println("Test case 10: write degrees F, "
			+ " original in F.");
	System.out.println();
	System.out.println("Verify -51.2 degrees F");
	System.out.println();
	t5.writeF();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 11: getF method with "
			+ "original temperature in F.");
	System.out.println();
	System.out.println("Verify -51.2");
	System.out.println();
	System.out.println(t5.getF());
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 12: getF method with original"
			+ " temperature in C.");
	System.out.println("Verify 32");
	System.out.println();
	System.out.println(t4.getF());
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 13: getC method with "
			+ "original temperature in F.");
	System.out.println("Verify -46.2");
	System.out.println();
	System.out.println(t5.getC());
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
	System.out.println();

 	System.out.println();
	System.out.println("Test case 14: getC method with "
			+ "original temperature in C.");
	System.out.println("Verify 0");
	System.out.println();
	System.out.println(t4.getC());
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
	System.out.println();

	System.out.println();
	System.out.println("Test case 15: set method for "
			+ "both parameters.");
	System.out.println("t5 before:");
	t5.writeOutput();
	t5.set(72.8, 'C');
	System.out.println("After set: verify 72.8 degrees C.");
	System.out.println();
	t5.writeOutput();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
 	System.out.println();

	System.out.println("Test case 16: set method for just "
			+ "degrees.");
	System.out.println("t5 before:");
	t5.writeOutput();
	t5.set(100);
	System.out.println("After set: verify 100 degrees C.");
	System.out.println();
	t5.writeOutput();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
	System.out.println();

	System.out.println("Test case 17: set method for just units.");
	System.out.println("t5 before:");
	t5.writeOutput();
	t5.set('F');
	System.out.println("After set: verify 100 degrees F.");
	System.out.println();
	t5.writeOutput();
	System.out.println();
	System.out.println("Hit 'y' to continue.");
	junk = scan.nextLine();
	System.out.println();

	System.out.println("Test case 18 (at last): toString method");
	System.out.println("T5 is 100  degrees F.");
	System.out.println(t5);
	System.out.println();

	scan.close();
   }
}
