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
    public static void main(String [] args) {
        File folder = new File(".");  // dot is current directory
        File[] listOfFiles = folder.listFiles(); // we now have array of File objects
        String name;
        NotByteCodeException notByteCodeException = new NotByteCodeException("File is not a .class file"); // insert notByteCodeException and initialize error message
        String last6chars;


        try (FileOutputStream outFile = new FileOutputStream("nonByteCode.txt");
            PrintWriter printWriter = new PrintWriter(outFile)) {
            for (File file : listOfFiles) {
                if (file.isFile()) { // check bit's a file not subdirectory
                    name = file.getName(); // each file name is a String
                    if (file.length() > 6) { // check filename length
                        last6chars = name.substring(name.length() - 6);
                        try {
                            if (!last6chars.equals(".class")) {
                                throw notByteCodeException; // throw exception
                            } // if (!last6chars.equals(".class"))
                        } // try
                        catch (NotByteCodeException ex) {
                            printWriter.write(name);
                            printWriter.println();
                            System.out.println(name + " is not a .class file");
                        } // catch (NotByteCodeException e)
                    } // if (file.length() > 6)
                } // if (file.isFile()
            } // for (File file : listOfFiles)
        }
        catch (IOException ex) {
            System.out.println("Error opening file");
        } // catch (IOException ex)
    } // public static void main(String [] args)
}