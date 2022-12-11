import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    // ------ test -------
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose rock, paper or scissors: ");
        String MyChoose = scanner.nextLine();
        if (MyChoose.equals("r") || MyChoose.equals("rock")) {
            MyChoose = "rock";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        } else if (MyChoose.equals("p") || MyChoose.equals("paper")) {
            MyChoose = "paper";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        } else if (MyChoose.equals("s") || MyChoose.equals("scissors")) {
            MyChoose = "scissors";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        System.out.print("The computer choose is: ");
        Random rand = new Random();
        int computerRandomNumber = rand.nextInt(4);


        String computerMove = "";
        switch (computerRandomNumber) {
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = PAPER;
                break;
            case 3:
                computerMove = SCISSORS;
                break;
        }

        if ((MyChoose.equals("rock") && computerMove.toLowerCase().equals("scissors")) ||
                (MyChoose.equals("paper") && computerMove.equals("rock")) ||
                (MyChoose.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("You win");
        } else if ((MyChoose.equals("scissors") && computerMove.equals("rock")) ||
                (MyChoose.equals("rock") && computerMove.equals("paper")) ||
                (MyChoose.equals("paper") && computerMove.equals("scissors"))) {
            System.out.println("You lose");
        } else {
            System.out.println("This game is draw.");
        }
    }
}



