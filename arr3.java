import java.util.Scanner;
public class arr3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the 2d array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the range of rows: ");
        int srow = scn.nextInt();
        int erow = scn.nextInt();
        System.out.println("Enter the range of columns: ");
        int scol = scn.nextInt();
        int ecol = scn.nextInt();
        int sum = 0;
        while(srow <= erow){
            int j = scol;
            while(j <= ecol){
                sum += mat[srow][j];
                j++;
            }
            srow++;
        }
        System.out.println(sum);
    }
}
