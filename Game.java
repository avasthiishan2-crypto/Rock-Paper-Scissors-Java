import java.util.Scanner;
import java.util.Random;//It use for computer pickup a ronadom number for continue in game
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userscore = 0;
        int ComputerScore = 0;

        System.out.println("Welcome to Rock-paper-Scissor Game!");
        System.out.println("Game take 5 rounds. \t Rules of the Game : 0 for Rock, 1 for paper, 2 for Scissors");
// For loop use for make a five or more round in game
        for(int i = 1 ; i <= 5; i++)
        {
            System.out.println("Round : " + i + " of 5");
            System.out.print("Your Choice : ");

            int User = sc.nextInt();
            int Computer = rand.nextInt(3);

            String[] choices1 = {"Rock", "Paper", "Scissor"};
            System.out.println("You chose : " + choices1[User]);
            System.out.println("Computer chose : " + choices1[Computer]);
// There if-else for justify in which condition user won and in which condition computer won
            if (User == Computer)
            {
                System.out.println("This Round was Tie!");
            }
            else if (User == 0 && Computer == 2 || User == 1 && Computer == 0 || User == 2 && Computer == 1)
            {
                System.out.println("Congratulations, You win this Round \uD83C\uDF89");
                userscore++;// increase the round as well as point
            }
            else
            {
                System.out.println("Computer wins this Round \uD83E\uDD16");
                ComputerScore++;//increase the round as well as point
            }
        }
// Final result add all point and then give the result
        System.out.println("=====FINAL RESULT======");
        System.out.println("Your Score : " + userscore);
        System.out.println("Computer Score : "+ ComputerScore);

        if(userscore>ComputerScore)
        {
            System.out.println("You Win the Game \uD83C\uDF89");
        }
        else if(ComputerScore>userscore)
        {
            System.out.println("You Loss the Game \uD83E\uDD16");
        }
        else
        {
            System.out.println("The Game was Tie");
        }
        sc.close();
    }
}