package partA.activity;
import java.util.Scanner;
public class Activity01_ExplicitImport {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello user, please enter your first name");
        String name = keyboard.nextLine();
        System.out.println("Using the scanner, I was able to store your name. I see your name is " + name);
    }
}
