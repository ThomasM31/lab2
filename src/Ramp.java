import java.util.Stack;

public class Ramp {
    private boolean isRampUp = false;
    private Stack<Car> content;

    public boolean getRamp() {
        return isRampUp;
    }

    public void raiseRamp () {
            isRampUp = true;
    }
    public void lowerRamp () {
        isRampUp = false;
    }
    public void loadTrailer(Car item) {

        content.push(item);
    }

    public void offloadItem() {
        content.pop();
    }
}
