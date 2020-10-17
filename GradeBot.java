import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double outof = 0;
        double score = 0;
        double percent = 0;
        System.out.print("What was your test out of? ");
        outof = sc.nextDouble();
        System.out.print("What mark did you get? ");
        score = sc.nextDouble();
        if (score > outof || score == 0 || score < 0) {
            System.out.println("NOOO... that's impossible!");
        } else {
            percent = 100 * (score/outof);
            if (percent >= 86) {
                System.out.println("you got an A. great work!");
            } else if (percent >= 73) {
                System.out.println("you got a B. good job.");                
            } else if (percent >= 67) {
                System.out.println("you got a C+. not bad.");
            } else if (percent >= 60) {
                System.out.println("you got a C. you passed, but you can do better!");
            } else if (percent >= 50) {
                System.out.println("you got a C-. study harder!");                
            } else {
                System.out.println("you got an F. you failed, but don't give up.");
            }
    }
}