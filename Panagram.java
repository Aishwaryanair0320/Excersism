

import java.util.*;
import java.lang.*;
import java.io.*;
class Panagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String panagram = "The five boxing wizards jump quickly!";
        int [] a = new int[128];
        char [] chars = panagram.toLowerCase().toCharArray();
        for(int i = 0; i< chars.length;i++) {
        int check = (int) chars[i];
        if(check<120) {
        a[check] +=1;
   }
}
    System.out.println(Arrays.toString(a));
    for(int i = 97; i <= 122;i++) {
      if(a[i] == 0) {
      System.out.println("not a panagram");
      System.exit(1);
  }
}

 System.out.println("is a panagram");
 }
}

