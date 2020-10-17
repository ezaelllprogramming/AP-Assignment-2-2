import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer   = "";
        System.out.print("what is the password? ");
        answer = sc.nextLine();
        if ("vengeance".equals(answer)) {
            System.out.println("correct. I am: vengeance.");
        } else {
            System.out.println("incorrect password. try again.");
        }
    }
}