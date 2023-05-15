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
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }
    public boolean searchUsers(String username, String password){
        return (users.contains(username) && users.contains(password));
    }
}
