/*Write an application that displays the factorial for every integer value from 1 to 10. A factorial of a number is the product of that number multiplied by each positive integer lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. The output would then be The factorial of 4 is 24. 
*/

public class Factorials
{
   public static void main (String args[])
   {
       int factorial = 1;
       for(int i = 1; i<=10; i++){
           factorial *=i;
           System.out.format("The factorial of %d is %d \n",i,factorial);
       }
   }
}
