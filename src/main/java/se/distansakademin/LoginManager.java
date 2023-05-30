package se.distansakademin;
import org.apache.commons.codec.digest.DigestUtils;

public class LoginManager {

    private String passwordHash;

    public boolean register(String username, String password) {
        passwordHash = DigestUtils.md5Hex(password);
        return true; // TODO: pass tests
    }

    public boolean login(String username, String password) {
        return false; // TODO: pass tests
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
