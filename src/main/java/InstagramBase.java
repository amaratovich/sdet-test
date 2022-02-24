import helpers.PasswordValidator;

import java.util.Date;

public abstract class InstagramBase implements Instagram {
    private String username;
    private String password;


    public InstagramBase(String username, String password) throws Exception {
        if (username.length() >= 6 && PasswordValidator.isValid(password)) {
            this.username = username;
            this.password = password;
        }  else {
            throw new Exception("invalid username or password");
        }

    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
