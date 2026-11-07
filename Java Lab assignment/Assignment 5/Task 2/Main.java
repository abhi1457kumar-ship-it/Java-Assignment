// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 5
// Task: 2

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};
        int sum = 0;
        int largest = arr[0];
        for (int val : arr) {
            sum += val;
            if (val > largest) {
                largest = val;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
