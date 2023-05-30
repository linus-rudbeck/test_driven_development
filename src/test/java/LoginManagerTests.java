import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.LoginManager;

public class LoginManagerTests {
    LoginManager loginManager;

    @BeforeEach
    public void setup(){
        loginManager = new LoginManager();
    }

    @Test
    void testRegisterAndLogin(){
        assert loginManager.register("Linus", "1234");
        assert loginManager.login("Linus", "1234");
    }

    @Test
    void testPasswordHash(){
        assert loginManager.register("Linus", "1234");
        assert loginManager.getPasswordHash().equals("81dc9bdb52d04dc20036dbd8313ed055");
    }

    @Test
    void testRegisterAndLoginWrongPassword(){
        assert loginManager.register("Linus", "1234");
        assert !loginManager.login("Linus", "12345");
    }

    @Test
    void testRegisterAndLoginWrongUsername(){
        assert loginManager.register("Linus", "1234");
        assert !loginManager.login("Linus1", "1234");
    }

    @Test
    void testRegisterAndLoginWrongUsernameAndPassword(){
        assert loginManager.register("Linus", "1234");
        assert !loginManager.login("Linus1", "12345");
    }
}
