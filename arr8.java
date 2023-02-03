import java.util.Scanner;

public class arr8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the dimensions of the array: ");

        int n = scn.nextInt();

        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                mat[i][j] = scn.nextInt();

            }

        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < m; j++) {

                if(mat[i][j] != mat[i-1][j-1]){

                    System.out.println(false);

                    return;

                }

            }

        }

        System.out.println(true);

    }
}