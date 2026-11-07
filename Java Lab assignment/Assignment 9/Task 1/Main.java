// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 9
// Task: 1

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + matrix[0][j]);
        }
        System.out.println();

        System.out.print("Last row:");
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + matrix[2][j]);
        }
        System.out.println();
    }
}
