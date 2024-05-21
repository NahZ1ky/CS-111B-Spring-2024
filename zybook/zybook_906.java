import java.util.Scanner;

public class zybook_906 {
   // TODO: Define a generic method called checkOrder() that
   //       takes in four variables of generic type as arguments.
   //       The return type of the method is integer


      // Check the order of the input: return -1 for ascending,
      // 0 for neither, 1 for descending
   public static <T extends Comparable<T>> int checkOrder(T item1, T item2, T item3, T item4) {
      boolean ascending = item1.compareTo(item2) < 0 && item2.compareTo(item3) < 0 && item3.compareTo(item4) < 0;
      boolean descending = item1.compareTo(item2) > 0 && item2.compareTo(item3) > 0 && item3.compareTo(item4) > 0;

      if (ascending) {
         return -1; // Items are in ascending order
      } else if (descending) {
         return 1; // Items are in descending order
      } else {
         return 0; // Items are unordered
      }
   }



   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
      scnr.close();
   }
}
