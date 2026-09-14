package _02_JavaBasics.assignment_problems;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stop_Word_Filtered_Word_Frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback paragraph: ");
        String feedback = sc.nextLine();

        // Convert to lowercase
        feedback = feedback.toLowerCase();

        // Remove punctuation
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        // Split into words
        String[] words = feedback.split("\\s+");

        // Stop words
        String[] stopWords = {
                "the", "was", "and", "a", "is", "of", "in"
        };

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            // Check whether word is a stop word
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            // Skip stop words
            if (isStopWord) {
                continue;
            }

            // Count frequency
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        // Convert map entries to a list
        ArrayList<Map.Entry<String, Integer>> entries =
                new ArrayList<>(frequency.entrySet());

        // Sort by frequency in descending order
        Collections.sort(entries,
                new Comparator<Map.Entry<String, Integer>>() {

                    @Override
                    public int compare(
                            Map.Entry<String, Integer> a,
                            Map.Entry<String, Integer> b) {

                        return b.getValue() - a.getValue();
                    }
                });

        // Print result
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }

        sc.close();
    }
}