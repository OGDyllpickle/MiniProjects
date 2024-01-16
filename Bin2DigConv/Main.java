//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Timer wait = new Timer();


        Strip word = new Strip();
        boolean YON = true; // YON is really just means yes or no as yes meaning on no meaning off
        String UserWord;
        int UserInput;

        System.out.println("Welcome to the Digit-Binary Converter\n------------------------");

        while (YON) {
            System.out.println("What do you want to do?\n" + "BTD for binary to digit converter.\n" + "DTB for digit to binary converter.\n");
            String userWord = input.next(); // Use next() to read a string
            System.out.println("What is your Number?\n");
            if (word.cut(userWord).equals("btd")) {
                UserInput = input.nextInt();
                Converter Main = new Converter(UserInput);
                Main.BTD();
                System.out.println();
                wait.seconds(2);

            } else if (word.cut(userWord).equals("dtb")) {
                UserInput = input.nextInt();
                Converter Main = new Converter(UserInput);
                Main.DTB();
                System.out.println();
                wait.seconds(2);

            } else {
                System.out.println("Not one of the options");

            }
        }
    }
}

