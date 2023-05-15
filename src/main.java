import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static User u = new User("a","a");
    public static void main(String[] args) {
        int o = 0;
        while (o != 3){
            System.out.println("""
                    Photo Identification Model!!!
                    
                    1. Log In
                    2. Register
                    3. Exit
                    """);
            o = scanner.nextInt();
            if (o == 1){
                LogIn();
            }else if(o == 2){

            }
        }
    }
    public static void LogIn(){
        System.out.println("Username:");
        String username = scanner2.nextLine();
        System.out.println("Password:");
        String password = scanner2.nextLine();
        if(!u.searchUsers(username, password)){
            System.out.println("Username or password is wrong! Try Again!");
            LogIn();
        }else {
            Menu();
        }
    }
    public static void Menu(){
        System.out.println("Add image:");

    }
}
