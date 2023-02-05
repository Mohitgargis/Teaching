import java.util.*;

public class AreaCalculator 
{
   public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter the radius of your circle: ");
      double radius = keyboard.nextDouble();
      double area = Math.PI*radius*radius;
      System.out.print("The area of the circle is: " + area);
   }
}