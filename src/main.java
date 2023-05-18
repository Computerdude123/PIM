import java.util.Scanner;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;




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
        if(User.searchUsers(username, password)){
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
        int o = 0;
        while(o != 2){
            System.out.println("""
                    1. Add image
                    2. Log out""");
            o = scanner.nextInt();
            if (o == 1){
                addImage();
            }
        }
    }
    public static void addImage(){
        System.out.println("Image file path:");
        String path = scanner2.nextLine();
        nameImage(path);
    }
    public static void nameImage(String path){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("C:\\Users\\tudor\\PycharmProjects\\PIM\\main.py");
        PyObject str = interpreter.eval("repr(main(path))");
        System.out.println(str.toString());
    }
}
