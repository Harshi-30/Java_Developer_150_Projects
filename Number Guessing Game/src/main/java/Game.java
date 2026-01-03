import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int random = (int) (Math.random() * 10);
            System.out.print("Guess a number (1-10) or type -1 to exit: ");
            int playerNo = sc.nextInt();
            if(playerNo == -1){
                System.out.println("Game exited. Thanks for playing!");
                break;
            }
            boolean wine = compare(random, playerNo);

           System.out.println(wine ? "You are wine" : "Batter luck next time"+"correct no is: "+random);
        }
    }
    public static boolean compare(int random, int player){

        return (random==player);
    }

}