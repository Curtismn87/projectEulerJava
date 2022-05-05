public class ProjectEuler {
    public static void largestPal(){
        int largestPal = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int palindrome = i * j;
                StringBuilder palindromeSb = new StringBuilder(Integer.toString(palindrome));
                String palindromeStr = Integer.toString(palindrome);
                palindromeSb.reverse();
                boolean isPalindrome = palindromeSb.toString().equals(palindromeStr);
                if (isPalindrome){
                    if (palindrome > largestPal){
                        largestPal = palindrome;
                    }
                }
            }
        }
        System.out.println("This is the largest Palindrome: " + largestPal);
    }
}
