import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.NameManager;

public class NameManagerTests {

    NameManager nameManager;

    @BeforeEach
    public void setup(){
        nameManager = new NameManager();
    }

    @Test
    void testAddName(){
        nameManager.addName("Linus");

        assert nameManager.numberOfNames == 1;
        assert nameManager.getName(0).equals("Linus");
    }

    @Test
    void testAddNames(){
        nameManager.addName("Linus");
        nameManager.addName("Anna");
        nameManager.addName("Kalle");

        assert nameManager.numberOfNames == 3;
        assert nameManager.getName(0).equals("Linus");
        assert nameManager.getName(1).equals("Anna");
        assert nameManager.getName(2).equals("Kalle");
    }

    @Test
    void testRemoveName(){
        nameManager.addName("Linus");
        nameManager.addName("Anna");
        nameManager.addName("Kalle");

        nameManager.removeName("Anna");

        assert nameManager.numberOfNames == 2;
        assert nameManager.getName(0).equals("Linus");
        assert nameManager.getName(1).equals("Kalle");
    }

    @Test
    void testRemoveNames(){
        nameManager.addName("Linus");
        nameManager.addName("Anna");
        nameManager.addName("Kalle");

        nameManager.removeName("Anna");
        nameManager.removeName("Kalle");

        assert nameManager.numberOfNames == 1;
        assert nameManager.getName(0).equals("Linus");
    }

    @Test
    void testRemoveAllNames(){
        nameManager.addName("Linus");
        nameManager.addName("Anna");
        nameManager.addName("Kalle");

        nameManager.removeAllNames();

        assert nameManager.numberOfNames == 0;
    }
}
