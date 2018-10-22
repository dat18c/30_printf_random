import java.util.Random;
public class Rand
{
   public static void main(String[] args)
   {
      
      
      //brug printf("formatstreng", paramater1, parameter2, ..., paramtern);
      System.out.printf("Formatter int: %10d er tallet og decimaltallet er: %4.8f, streng: %s", 10027, 1003.14159265, "Hej!");
      //%d er heltal, %f er decimaltal, %2.8f betyder 2 cifre før komma og 8 efter, %s er tekststreng
      System.out.println();
      int x= 42;
      double y = Math.PI;
      
      System.out.printf("Formatter int: %010d er tallet og decimaltallet er: %4.8f", x, y);
      System.out.println();
      
      //konstant med antallet af tal vi skal bruge
      final int ANTAL = 10;
      
      //instantier random objekt
      Random ran = new Random();
      
      for (int i=0; i<ANTAL; i++)
      {
         double r1 = Math.random();
         //næste heltal
         int r2 = ran.nextInt(100);
         System.out.printf("Math.random(): %1.4f ran.nextInt(): %2d%n", r1, r2);
      }
   }
}