// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 7
// Task: 2

public class Main {
    public static void main(String[] args) {
        int steps = 0;
        // Time Complexity: O(n^2) where n = 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
