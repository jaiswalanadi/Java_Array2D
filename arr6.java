import java.util.Scanner;

public class arr6 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the dimensions of first array: ");

        int n1 = scn.nextInt();

        int m1 = scn.nextInt();

        int[][] arr1 = new int[n1][m1];

        System.out.println("Enter the elements of first array: ");

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m1; j++) {

                arr1[i][j] = scn.nextInt();

            }

        }

        System.out.println("Enter the dimensions of second array: ");

        int n2 = scn.nextInt();

        int m2 = scn.nextInt();

        int[][] arr2 = new int[n2][m2];

        System.out.println("Enter the elements of second array: ");

        for (int i = 0; i < n2; i++) {

            for (int j = 0; j < m2; j++) {
                arr2[i][j] = scn.nextInt();

            }

        }

        if (m1 != n2) {
            return;

        }

        int[][] ans = new int[n1][m2];

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m2; j++) {

                for (int k = 0; k < m1; k++) {

                    ans[i][j] += (arr1[i][k] * arr2[k][j]);

                }

            }

        }

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m2; j++) {

                System.out.print(ans[i][j] + " ");

            }

            System.out.println();

        }

    }

}