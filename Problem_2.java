import java.util.Scanner;

public class Problem_2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int a=sc.nextInt(); 
    for (int i=1;i<a;i++) {
        System.out.print((2*i-1)+" ");
    }
  }
}
