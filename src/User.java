import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    User (String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    static ArrayList<User> users = new ArrayList<>();

    public boolean searchUsers(User u){
        if ()
    }
    public void addUsers(User user){
        users.add(user);
        try {
            FileWriter mywriter = new FileWriter("output.txt");
            for (int i = 0; i < users.size(); i++) {
                mywriter.write(users.get(i).username + System.lineSeparator());
                mywriter.write(users.get(i).password);
            }
            mywriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void setUsers() {
        ArrayList<String> lines = null;
        try {
            lines = new ArrayList<>(Files.readAllLines(Paths.get("output.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lines.size(); i++) {
            String username = lines.get(i);
            String password = lines.get(i + 1);
            User u1 = new User(username,password);
            users.add(u1);
            i++;
        }
    }
}
