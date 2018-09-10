import java.util.*;

public class VowelConsonant {
    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a string: ");
            str = in.nextLine();
            int length = str.length();
            for(int i=0; i<length; i++){
                boolean flag = false;
                char ch = str.charAt(i);
                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                    switch(ch)
                    {
                        case 'a' :
                        case 'e' :
                        case 'i' :
                        case 'o' :
                        case 'u' :
                        case 'A' :
                        case 'E' :
                        case 'I' :
                        case 'O' :
                        case 'U' : flag = true;
                    }
                    if(flag == true){
                        System.out.print("Vowel ");
                    }
                    else{
                        System.out.print("Consonant ");
                    }
                }
                else{
                    System.out.print("Error ");
                }
            }
            System.out.println();
        }
    }
}
