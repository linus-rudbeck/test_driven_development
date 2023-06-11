import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.PointsGame;
import se.distansakademin.RandomRoll;

import java.util.Random;

public class RandomRollTests {
    RandomRoll randomRoll;

    private final Random fakeRandom = new Random(1);

    @BeforeEach
    public void setup(){
        randomRoll = new RandomRoll(fakeRandom);
    }

    @Test
    void testRandomNumber(){
        assert randomRoll.randomNumber() == -1155869325; // TODO: replace 0 with what?
    }
}
