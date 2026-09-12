package _01_JavaFoundation.practice_problems;

import java.util.*;

public class RockPaperScissor {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {

            return "You Won";
        }

        return "Computer Won";
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] movebycomputer = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        int rounds;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("Valid Moves: Rock, Paper, Scissors");
        System.out.print("Enter number of rounds: ");
        rounds = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= rounds; i++) {

            System.out.print("Round " + i + " - Enter your move: ");
            String playerMove = in.nextLine();

            String computerMove = movebycomputer[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            if (result.equals("You Won")) {
                wins++;
            }
            else if (result.equals("Computer Won")) {
                losses++;
            }
            else {
                draws++;
            }


            System.out.println("Round: " + i + " \n " + "Your Move: " + playerMove + " \n " + "Computer Move: " + computerMove + " \n " + result
            );
        }

        System.out.println("\n========= Final =========");
        System.out.println("Total Rounds : " + rounds);
        System.out.println("Wins         : " + wins);
        System.out.println("Losses       : " + losses);
        System.out.println("Draws        : " + draws);

    }
}