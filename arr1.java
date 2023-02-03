import java.util.Arrays;
import java.util.Scanner;
public class arr1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println("Enter the element to be searched: ");
        int x = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == x){
                    System.out.println("Row = " + i);
                    System.out.println("Column = " + j);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}