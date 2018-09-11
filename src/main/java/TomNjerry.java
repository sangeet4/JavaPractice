import java.util.*;

public class TomNjerry {
    /*public static void main(String args[]) {
        int input;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            input = in.nextInt();
            if(input >= 20 && input <= 30){
                if(input % 2 == 0){
                    System.out.println("Jerry");
                }
                else{
                    System.out.println("Tom");
                }
            }
            else{
                System.out.println("Nummber is out of range");
            }
        }
    }*/

    public String oddOrEven(int input){
        if(input >= 20 && input <= 30){
            if(input % 2 == 0){
                return "Jerry";
            }
            else{
                return "Tom";
            }
        }
        else{
            return "Number is out of range";
        }
    }
}
