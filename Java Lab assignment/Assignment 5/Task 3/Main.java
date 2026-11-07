// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 5
// Task: 3

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;
        for (int val : arr) {
            if (val > 10) {
                count++;
            }
        }
        System.out.println("Count greater than 10: " + count);
    }
}
