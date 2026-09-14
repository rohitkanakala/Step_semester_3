package _05_OOP_Fundamental.aasignment_problem;

import java.util.Arrays;
import java.util.Scanner;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    public String getName() {
        return name;
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        for (Player player : players) {

            if (isDraftable(player.matchesPlayed) ||
                    isDraftable(player.matchesPlayed, player.injured)) {

                draftable[count] = player;
                count++;
            }
        }

        Player[] finalList = Arrays.copyOf(draftable, count);

        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result += (i + 1) + ". " + finalList[i].name;

            if (i < finalList.length - 1) {
                result += " | ";
            }
        }

        return result;
    }
}

public class DraftRank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPlayer " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter matches played: ");
            int matches = sc.nextInt();

            System.out.print("Enter batting average: ");
            double average = sc.nextDouble();

            System.out.print("Is injured? (true/false): ");
            boolean injured = sc.nextBoolean();

            sc.nextLine();

            players[i] = new Player(name, matches, average, injured);
        }

        System.out.println("\nDraft Ranking:");

        System.out.println(Player.draftAndRank(players));

        sc.close();
    }
}