package ExceptionPA;
/**
 * JavaByteCode --- A program to output files in current directory (.)
 * @authors C. Conner
 * @version   1.0
 * @since     2022-12-15
*/

import java.io.*;

public class JavaByteCode
{
   public static void main(String [] args)
   {
        File folder = new File(".");  //dot is current directory
        File[] listOfFiles = folder.listFiles(); //we now have array of File objects
        String name = "";

        for (File file : listOfFiles) {
            //check it's a file not subdirectory
            if (file.isFile()) {
                    name = file.getName(); //each file name is a String
                    System.out.println(name);

            }
        }
    }
}