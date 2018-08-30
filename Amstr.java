

import java.util.*;
 
class Armstr
{
   public static void main(String args[])
   {
      int n, sum = 0, temp, r, cnt = 0;
 
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      temp = n;
      while (temp != 0) {
         cnt++;
         temp = temp/10;
      }
      temp = n;
      while (temp != 0) {
         r = temp%10;
         sum = sum + power(r, cnt);
         temp = temp/10;
      }
 
      if (n == sum)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " isn't an Armstrong number.");         
   }
 
   static int power(int n, int r) {
      int i, p = 1;
 
      for (i = 1; i<= r; i++) 
         p = p*n;
 
      return p;   
   }
}

