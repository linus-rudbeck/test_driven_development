package se.distansakademin;
import org.apache.commons.codec.digest.DigestUtils;

public class LoginManager {

    private String username;
    private String passwordHash;

    public boolean register(String username, String password) {
        this.username = username;
        passwordHash = DigestUtils.md5Hex(password);
        return true; // TODO: pass tests
    }

    public boolean login(String username, String password) {
        var usernameCorrect = username.equals(this.username);
        var passwordCorrect = DigestUtils.md5Hex(password).equals(passwordHash);

        return usernameCorrect && passwordCorrect;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
