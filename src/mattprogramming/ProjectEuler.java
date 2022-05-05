package mattprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectEuler {
    public static void largestPal() {
        int largestPal = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int palindrome = i * j;
                StringBuilder palindromeSb = new StringBuilder(Integer.toString(palindrome));
                String palindromeStr = Integer.toString(palindrome);
                palindromeSb.reverse();
                boolean isPalindrome = palindromeSb.toString().equals(palindromeStr);
                if (isPalindrome) {
                    if (palindrome > largestPal) {
                        largestPal = palindrome;
                    }
                }
            }
        }
        System.out.println("This is the largest Palindrome: " + largestPal);
    }

    public static void smallestMultiple() {
        int counter = 2520;
        int breakFlag = 0;
        while (breakFlag != counter) {
            for (int i = 20; i > 0; i--) {
                if (counter % i != 0) {
                    counter = counter + 1;
                    break;
                }
                breakFlag = counter;
            }
        }
        System.out.println("This is number: " + counter);
    }

    public static void sumSquare(int naturalNumbers) {
        int sumSquare = 0;
        int squareSums = 0;


        for (int i = 0; i <= naturalNumbers; i++) {
            sumSquare += Math.pow(i, 2);
            squareSums += i;
        }
        double totalDifference = Math.pow(squareSums, 2) - sumSquare;

        System.out.printf("Sum of Squares: %,d%nSquare of Sums: %,.0f%nDifference: %,.0f%n", sumSquare, Math.pow(squareSums, 2), totalDifference);
    }

    public static void doubleBasePal() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            String str = Integer.toBinaryString(i);
            StringBuilder binaryStr = new StringBuilder();
            binaryStr.append(str);
            binaryStr.reverse();
            if (str.equals(binaryStr.toString())) {
                sum += i;
                System.out.println(sum + " is the new sum");
            }
        }

    }

    public static void romanNumeral() throws FileNotFoundException {
        File file = new File("./src/mattprogramming/roman.txt");
        System.out.println(file.getAbsolutePath());
        Scanner sc = new Scanner(file);
        StringBuilder longestStr = new StringBuilder();
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.length() > longestStr.length()){
                longestStr.setLength(0);
                longestStr.append(str);
            }
         //   System.out.println(sc.nextLine().length());
        }
        sc.close();
        System.out.printf("This is longest str: %s%nLength of: %d%nThis is filesize: %d",longestStr,longestStr.length(), file.length() );

    }

}

