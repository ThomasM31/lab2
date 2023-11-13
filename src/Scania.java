import java.awt.*;

public class Scania extends Car{

    private double trailerAngle;

    //ඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞ
    public Scania() {
        super(2, 90, Color.yellow, "Scania");
    }
    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public double getTrailerAngle() {return trailerAngle;}

    public void raiseTrailer(double angle){
        if (getCurrentSpeed() == 0 && (trailerAngle + angle < 70) && (angle > 0)) {
            trailerAngle += angle;
        }
    }

    public void lowerTrailer(double angle) {
        if (getCurrentSpeed() == 0 && (trailerAngle - angle > 0) && (angle > 0)){
            trailerAngle -= angle;
        }
    }

}
