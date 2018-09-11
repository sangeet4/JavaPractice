import java.util.*;

public class Analyzer {
//    public static void main(String args[]) {
//        char input;
//        while (true) {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter a character: ");
//            input = in.next().charAt(0);
//            if(input >= 'A' && input <= 'Z'){
//                System.out.println("Capital Letter");
//            }
//            else if(input >= 'a' && input <= 'z'){
//                System.out.println("Small Letter");
//            }
//            else if(input >= '0' && input <= '9'){
//                System.out.println("Digit");
//            }
//            else{
//                System.out.println("Special Symbol");
//            }
//        }
//    }

    public String characterProp(char input){
        if(input >= 'A' && input <= 'Z'){
            return ("Capital Letter");
        }
        else if(input >= 'a' && input <= 'z'){
            return ("Small Letter");
        }
        else if(input >= '0' && input <= '9'){
            return ("Digit");
        }
        else{
            return ("Special Symbol");
        }
    }
}
