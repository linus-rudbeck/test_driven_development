package se.distansakademin;

public class PointsGame {

    private int points = 0;

    public void addPoints(int poinstToAdd) {
        if (poinstToAdd < 0){
            return;
        }

        this.points += poinstToAdd;

        if(this.points > 100){
            this.points = 100;
        }

        if(this.points < 0){
            this.points = 0;
        }
    }

    public int getPoints() {
        return points;
    }
}
