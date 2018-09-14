
import java.util.Scanner;

public class GuessNumber {



        public static void main(String []args) {
            int randomNum =(int)(Math.random()*100)+1;
            boolean hasWon=false;

            System.out.println("I have chosen a random number between 1 to 100");
            System.out.println("Guess the number:");

            Scanner scanner = new Scanner(System.in);
            for(int i=10;i>0;i--) {
                System.out.println("You have "+i+" guess left to choose");
                int guess =  scanner.nextInt();
                if(randomNum<guess) {
                    System.out.println("Its smaller than" +guess);

                }else if(randomNum>guess) {
                    System.out.println("Its greater than" +guess);
                }else if (randomNum==guess) {
                    hasWon=true;
                    break;
                }
            }
            if(hasWon) {
                System.out.println("Yes You Won");
            }else {
                System.out.println("You loose the game");
                System.out.println("The correct number is:"+randomNum);
            }

        }



}
