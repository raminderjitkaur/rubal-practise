import java.util.*;
class AB{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Your total is 100");
      

      System.out.println("How do you want to pay");
      String method = sc.nextLine();
      

      if(method.equalsIgnoreCase("cash")){
          System.out.println("Cash accepted");
      }
      else{
          System.out.println("Sorry");
      }
      


    }
}
