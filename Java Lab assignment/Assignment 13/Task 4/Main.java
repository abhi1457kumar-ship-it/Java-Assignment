// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 13
// Task: 4

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
