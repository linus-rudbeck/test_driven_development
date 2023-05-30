import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import se.distansakademin.PointsGame;

public class PointsGameTests {

    PointsGame pointsGame;

    @BeforeEach
    public void setup(){
        pointsGame = new PointsGame();
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 500})
    void testFullPoints(int points){
        // Total points can't exceed 100

        pointsGame.addPoints(points);

        assert pointsGame.getPoints() == 100;
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 30, 50})
    void testAddPoints(int points){
        // Total points should be equal to added points

        pointsGame.addPoints(points);

        assert pointsGame.getPoints() == points;
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -30, -50})
    void testAddNegativePoints(int points){
        // Total points should not gp below 0

        pointsGame.addPoints(points);

        assert pointsGame.getPoints() == 0;
    }


    @Test
    void testAddMultiplePoints(){
        // All points added should be summed

        pointsGame.addPoints(10);
        pointsGame.addPoints(20);
        pointsGame.addPoints(30);

        assert pointsGame.getPoints() == 60;
    }

    @Test
    void testBlockNegativePoints(){
        // All points added should be summed except for negative points

        pointsGame.addPoints(10);
        pointsGame.addPoints(20);
        pointsGame.addPoints(30);
        pointsGame.addPoints(-40);

        assert pointsGame.getPoints() == 60;
    }
}
