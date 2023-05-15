import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    public static void main(String[] args) {
        User.setUsers();
        int o = 0;
        while (o != 3){
            System.out.println("""
                    Photo Identification Model!!!
                    1. Log In
                    2. Register
                    3. Exit""");
            o = scanner.nextInt();
            if (o == 1){
                LogIn();
            }else if(o == 2){
                Register();
            }
        }
    }
    public static void LogIn(){
        System.out.println("Username:");
        String username = scanner2.nextLine();
        System.out.println("Password:");
        String password = scanner2.nextLine();
        User u = new User(username, password);
        if(u.searchUsers(u)){
            Menu();
        }else {
            System.out.println("Username or password is wrong! Try Again!");
            LogIn();
        }
    }
    public static void Register(){
        System.out.println("Username:");
        String username = scanner2.nextLine();
        System.out.println("Password:");
        String password = scanner2.nextLine();
        User u1 = new User(username, password);
        u1.addUsers(u1);
    }
    public static void Menu(){
        System.out.println("Add image:");

    }
}
