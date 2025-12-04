import java.util.Scanner;

public class Problem_3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number:");
    int a=sc.nextInt();
    if(a%2==0){
      a=a-1;
      for(int i=1;i<=a;i++){
        System.out.print((2*i-1)+" ");
      }
    }
    else{
      for(int i=1;i<=a;i++){
      System.out.print((2*i-1)+" ");
    }
    }
  }
}
