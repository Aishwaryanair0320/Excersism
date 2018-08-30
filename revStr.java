import java.util.*;

public class revStr {
  public static void main(String[] args) {
    String str,rev= "";
    Scanner S = new Scanner(System.in);
    str = S.nextLine();
    int length = str.length();
    int i;
    for(i = length-1;i>=0;i--) {
      rev = rev + str.charAt(i);
    }
    System.out.println(rev);
  }
}
