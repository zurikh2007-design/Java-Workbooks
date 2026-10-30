
import java.util.Scanner;
public class highscorewins {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // string contains "team1:team2|score1:score2"
        String input;
        System.out.println("Please enter 2 teams and scores.");
        input = scanner.nextLine();

        String[] teams = input.split(":");
        String[] score = teams[1].split("\\|");
        String[] score2 = teams[2].split(":");
        int homeScore = Integer.parseInt(score[1]);
        int awayScore = Integer.parseInt(score2[0]);

        System.out.println(teams[0]);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score2[0]);

        if (homeScore > awayScore) {
            System.out.println("Home score is greater!");
            System.out.println(teams[0]);
            System.out.println(score[1]);
        } else {
            System.out.println("Away score is better!");
            System.out.println(score[0]);
            System.out.println(score2[0]);
        }




    }









}
