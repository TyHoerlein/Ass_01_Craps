
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    String playAgain = "Y";

    while (playAgain.equalsIgnoreCase("Y")) {

        int die1  = rand.nextInt(6) + 1;
        int die2   = rand.nextInt(6) + 1;
        int sum = die1 + die2;
                    System.out.println("\nDie 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if  (sum == 2 || sum == 3 || sum == 12) {

                        System.out.println("Craps! you lost");

                    } else if (sum == 7 || sum == 11) {

                        System.out.println("Natural! you won");
                    } else {

                        int point = sum;
                                System.out.println("the point is " + point);
                        System.out.println("trying for point...");

                        boolean gameOver = false;
                        while (!gameOver) {

                            die1 = rand.nextInt(6) + 1;
                            die2 = rand.nextInt(6) + 1;
                            sum = die1 + die2;

                            System.out.println("\nDie 1: " + die1);
                            System.out.println("Die 2: " + die2);
                            System.out.println("Sum: " + sum);

                            if (sum == point) {

                                System.out.println("You won!");
                                gameOver = true;

                            } else if (sum == 7) {
                                System.out.println("You lost!");
                                gameOver = true;

                            } else {
                                System.out.println("trying for point...");
                            }
                        }
                    }

                    System.out.println("\nWould you like to play again? (y/n): ");
                    playAgain = input.nextLine();

                }

    System.out.println("Thanks for playing!");
    input.close();

    }
}