import java.util.*;

public class Random {
    public static void main(String args[]){
        int target = (int)(Math.random()*((100-1)+1))+1;
        //System.out.println(target);
        int guess;
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Guess a Number(between 1-100): ");
            guess = in.nextInt();
            if(guess > target){
                System.out.println("Number guessed is more than original number");
            }
            else if(guess < target){
                System.out.println("Number guessed is less than original number");
            }
            else{
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }

}
