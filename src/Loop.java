import java.util.*;

public class Loop {
    public static void main(String args[]){
        int input;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            input = in.nextInt();
            for(int i=1; i<=input; i++){
                int temp = i;
                while(temp > 0){
                    System.out.print(i+" ");
                    temp--;
                }
            }
            System.out.println();
        }
    }
}
