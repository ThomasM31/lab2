import java.util.Stack;

public class Ramp {
    private boolean isRampUp = true;
    private Stack<Car> content = new Stack<>();

    public boolean getRamp() {
        return isRampUp;
    }

    public Stack<Car> getContent() {
        return content;
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

    public Car offloadItem() {
        return content.pop();
    }
}
