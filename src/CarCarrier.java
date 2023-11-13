import java.awt.*;
import java.util.List;

public class CarCarrier extends Car {

    private Ramp ramp;

    public CarCarrier() {
        super(2, 125, Color.blue, "CarCarrier");
        // true -> flaket är uppe
        ramp = new Ramp();
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public void raiseRamp() {
        if(getCurrentSpeed() == 0) {
            ramp.raiseRamp();
        }
    }

    public void lowerRamp() {
        if(getCurrentSpeed() == 0) {
            ramp.lowerRamp();
        }
    }
    public void loadTrailer(Car item) {
        double itemX = item.getPosition()[0];
        double itemY = item.getPosition()[1];
        double carrierX = this.getPosition()[0];
        double carrierY = this.getPosition()[1];

        // TODO: de ska bara vara godtyckligt nära varandra, inte exakt
        if (!ramp.getRamp() && (carrierX == itemX) && (carrierY == itemY)) {

        }
    }
    public void offLoadTrailer() {

    }
}
