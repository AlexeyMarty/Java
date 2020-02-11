import java.util.Scanner;

/**
 * password validation method
 */
public class CheckingPass {
    public void checkingPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password");
        String pass = sc.nextLine();
        String pat = "(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[@#$%]).{8,}";
        if (pass.matches(pat)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password isn't valid");
        }
    }
}
