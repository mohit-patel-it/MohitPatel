/*
  I am taking input in Array
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
*/
import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        int[] count = new int[10];

        for (int num : arr){
            for (int i = 1; i <= 9; i++){
                if (num % i == 0) count[i]++;
            }
          }

        for (int i = 1; i <= 9; i++){
            System.out.println(i + ": " + count[i]);
        }
    }
}
