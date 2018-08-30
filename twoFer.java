import java.util.*;

public class twoFer {
  public static void main(String[] args) {
    String name;
    Scanner Sc = new Scanner(System.in);
    name  = Sc.nextLine();
    System.out.println(name);
    if(name.equals("Alice"))
     {
      System.out.println("One for Alice, one for me");
     }
    else
     {
      System.out.println("One for you, one for me");
    }
  }
}
