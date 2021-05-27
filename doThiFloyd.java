package doThiFloyd;

import java.util.Scanner;

public class doThiFloyd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của mảng: ");
        int row = input.nextInt();
        System.out.print("Nhập vào số cột của mảng: ");
        int col = input.nextInt();

        int[][] Array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Array[" + i + ", " + j + "] = ");
                Array[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMảng W0: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int k = 0; k < col; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (Array[i][k] == 100 || Array[k][j] == 100) {
                        Array[i][j] = Array[i][j];
                    } else {
                        if (Array[i][k] + Array[k][j] < Array[i][j])
                            Array[i][j] = Array[i][k] + Array[k][j];
                    }
                }
            }
        }

        System.out.println("\nMảng W*: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
