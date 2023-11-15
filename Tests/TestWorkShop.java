import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import java.util.ArrayList;

public class TestWorkShop {
    private Point pos;
    private WorkShop<Car> testWorkShop;
    private Saab95 testSaab;
    private Volvo240 testVolvo;

    @Before
    public void setup() {
        pos = new Point(1,1);
        testWorkShop = new WorkShop<Car>(pos,5);
        testSaab = new Saab95();
        testVolvo = new Volvo240();
    }
    @Test
    public void testGetPos() {
        Point testPoint = new Point(1,1);
        assert testPoint.equals(testWorkShop.getPos());
    }
    @Test
    public void testGetCapacity() {
        int capacity = 5;
        assert testWorkShop.getCapacity() == capacity;
    }
    @Test
    public void testGetCarsInWorkshop() {
        ArrayList<Saab95> cars = new ArrayList<Saab95>(5);
        cars.add(testSaab);

        testWorkShop.addToWorkshop(testSaab);
        assert cars.equals(testWorkShop.getCarsInWorkshop());
    }
    @Test
    public void testAddToWorkshop() {
        testWorkShop.addToWorkshop(testSaab);

    }
}
