
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int hour = 24 ;
        int minutes = 60 ;
        int seconds = 60 ;
        System.out.println("How many days would you like to convert to seconds?");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println(integer * hour * minutes * seconds) ;
    

    }
}
