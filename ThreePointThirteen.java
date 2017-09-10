import java.util.Scanner;
/**
 * Created by Jack Brashier on 9/7/17.
 * Purpose: To demonstrate knowledge of switch cases.
 */
public class ThreePointThirteen {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        int menuItem;
        switch(choice) {
            case 'a':
                System.out.println("You selected menu item a.");
                break;
            case 'b': choice = 'b';
                System.out.println("You selected menu item b.");
                break;
            case 'c': choice = 'c';
                System.out.println("You selected menu item c.");
                break;
            case 'd': choice = 'd';
                System.out.println("You selected menu item d.");
                break;
            case 'e': choice = 'e';
                System.out.println("You selected menu item e.");
                break;
            default:
                System.out.println("Your choice was invalid. Please select menu item a, b, c, d, or e.");
                break;
        }
    }
}
