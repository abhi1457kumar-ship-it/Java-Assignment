// Name: Abhinav Kumar
// Roll No: 2510303017
// Assignment: 13
// Task: 3

public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
