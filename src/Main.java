import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random generator = new Random();

        int val = 0, guess = 0;

        val = generator.nextInt(10) + 1;

        System.out.print("Enter the guess value : ");

        if (in.hasNextInt())
        {
            guess = in.nextInt();

            if (guess < val)
            {
                System.out.println("The guess value is low");
            }
            else if (guess > val)
            {
                System.out.println("The guess value is high");
            }
            else if (guess == val)
            {
                System.out.println("The guess value is on the money!");
            }
            System.out.print("Random value from computer : ");
            System.out.println(val);
        }
        else
        {
            System.out.println("Input guess value is not valid");
        }

    }

}