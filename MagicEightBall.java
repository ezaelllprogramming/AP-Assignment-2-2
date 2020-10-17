import java.util.Scanner;

public class MagicEightBall {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = (int) + 1;
        System.out.println("Ask a question that can be answered with a 'yes' or 'no': ");
        sc.nextLine();
        if (ans == 1) {
            System.out.println("Probably");
        } else if (ans == 2) {        
            System.out.println("Ask another time.");
        } else if (ans == 3) {
            System.out.println("It's far to early for that.");
        } else if (ans == 4) {
            System.out.println("Unable to answer.");
        } else if (ans == 5) {
            System.out.println("Try again.");
        } else if (ans == 6) {
            System.out.println("Don't bet on it.");
        } else if (ans == 7) {
            System.out.println("Most definitely so.");
        } else if (ans == 8) {
            System.out.println("It appears to be.");
        } else if (ans == 9) {
            System.out.println("What do you think?");
        } else if (ans == 10) {
            System.out.println("I don't think so.");
        } else if (ans == 11) {
            System.out.println("From what I've seen, probably not.");
        } else if (ans == 12) {
            System.out.println("Not sure.");
        } else if (ans == 13) {
            System.out.println("Sure.");
        } else if (ans == 14) {
            System.out.println("Answer fuzzy, try again later.");
        } else if (ans == 15) {
            System.out.println("There are clues that imply that yes, it is true.");
        } else if (ans == 16) {
            System.out.println("Doubtful.");
        } else if (ans == 17) {
            System.out.println("Yes!");
        } else if (ans == 18) {
            System.out.println("Yes...");
        } else if (ans == 19) {
            System.out.println("yup.");
        } else if (ans == 20) {
            System.out.println("It depends– what do your feelings tell you?");
    }
}