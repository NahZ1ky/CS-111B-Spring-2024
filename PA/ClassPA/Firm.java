//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

// Author: Xirong (Ziky) Zhang, Shawn Luna, Azeal Riday
// Date of Last Modification: 04/30/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #7

public class Firm
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();
        personnel.sort();   //call sort method before payday
        personnel.payday();

    }
}
