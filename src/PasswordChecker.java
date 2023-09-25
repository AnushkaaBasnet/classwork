
    import java.util.Scanner;

    public class PasswordChecker {
        public static void main(String[] args) {
            int a = 4;
            String name = "user", password = "password";
            Scanner obj = new Scanner(System.in);


            while(a>=0){
                System.out.println("Enter your username: ");
                String username = obj.next();
                System.out.println("Enter your password");
                String userpassword = obj.next();
                if(username.equals(name) & userpassword.equals(password)) {
                    System.out.println("Logged in");
                    break;
                }
                System.out.println(" Incorrect password. Number of attempts left: "+a);
                a--;
            }
        }
    }



