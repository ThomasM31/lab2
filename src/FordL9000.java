import java.awt.*;

public class FordL9000 extends Car {

    private Ramp ramp;

    public FordL9000() {
        super(2, 125, Color.blue, "FordL9000");
        ramp = new Ramp();
    }

    public boolean getRamp() {
        return ramp.getRamp();
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public void raiseRamp() {
        if (getCurrentSpeed() == 0) {
            ramp.raiseRamp();
        }
    }

    public void lowerRamp() {
        if (getCurrentSpeed() == 0) {
            ramp.lowerRamp();
        }
    }

    public void moveCarrier() {
        this.move();
        Stack<Car> content = ramp.getContent();
        // Move all cars when carrier moves
        for (int i = 0; i < ramp.getContent().size(); i++) {
            ramp.getContent().get(i).move();
        }
    }
    public void loadTrailer(Car item) {
        // TODO: Kollar att det inte är en till FordL9000 som ska laddas (Det får den inte göra)
        if (!(item instanceof FordL9000) && (!ramp.getRamp())) {

            double itemX = item.getPosition()[0];
            double itemY = item.getPosition()[1];
            double carrierX = this.getPosition()[0];
            double carrierY = this.getPosition()[1];
            double distance = Math.sqrt(Math.pow((carrierX-itemX),2) + Math.pow((carrierY-itemY),2));

            // TODO: rimligt värde på distansen??
            if (distance < 5) {
                ramp.loadTrailer(item);
            }
        }
    }

    public void offLoadTrailer() {
        if (!ramp.getRamp()) {
            Car offLoaded = ramp.offloadItem();
            // TODO: Var hamnar den nu?? rimligt? Borde den flyttas mindre?
            offLoaded.move();
        }

    }

}
