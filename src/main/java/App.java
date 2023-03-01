import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Enter value");
        Scanner scan = new Scanner(System.in);


        String userInput = scan.nextLine();

        String newString;
        System.out.println(userInput);

        if (!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number");
            newString = StringUtils.swapCase(userInput);
            System.out.println(newString);
            newString = StringUtils.reverse(newString);
            System.out.println(newString);
        }

    }
}
