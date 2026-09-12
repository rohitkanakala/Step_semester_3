package _01_JavaFoundation.practice_problems;

import java.util.*;

public class WordLengthFinder {


    static String[] findShortestAndLongestWord(String text) {

        // Remove punctuation and split into words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");


        String shortest = words[0];
        String longest = words[0];


        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }


            if (word.length() > longest.length()) {
                longest = word;
            }
        }


        return new String[]{shortest, longest};
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter sentence: ");
        String text = sc.nextLine();



        String[] result = findShortestAndLongestWord(text);


        System.out.println("\n========= RESULT =========");

        System.out.println(
                "Shortest: \"" + result[0] +
                        "\" (" + result[0].length() + ")"
        );


        System.out.println(
                "Longest: \"" + result[1] +
                        "\" (" + result[1].length() + ")"
        );


        sc.close();
    }
}