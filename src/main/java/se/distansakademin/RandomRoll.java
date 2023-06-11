package se.distansakademin;

import java.util.Random;

public class RandomRoll {

    private Random random;

    public RandomRoll(Random random){
        this.random = random;
    }


    public int randomNumber() {
        var roll = random.nextInt();
        return roll;
    }
}
