import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import java.util.ArrayList;

public class TestWorkShop {
    private Point pos;
    private int maxCapacity;
    private WorkShop<Car> testWorkShop;
    private Saab95 testSaab;
    private Volvo240 testVolvo;

    @Before
    public void setup() {
        pos = new Point(1,1);
        maxCapacity = 5;
        testWorkShop = new WorkShop<Car>(pos,maxCapacity);
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
        int testCapacity = maxCapacity;
        assert testWorkShop.getCapacity() == testCapacity;
    }
    @Test
    public void testGetCarsInWorkshop() {
        ArrayList<Saab95> cars = new ArrayList<Saab95>(maxCapacity);
        cars.add(testSaab);

        testWorkShop.addToWorkshop(testSaab);
        assert cars.equals(testWorkShop.getCarsInWorkshop());
    }
    @Test
    public void testAddToWorkshop() {
        testWorkShop.addToWorkshop(testSaab);

        assert testWorkShop.getCarsInWorkshop().contains(testSaab);
    }
    @Test
    public void testAddToWorkshopOverCapacity() {
        for (int i = 0; i < testWorkShop.getCapacity() + 1; i++) {
            testWorkShop.addToWorkshop(new Saab95());
        }
        assert testWorkShop.getCapacity() == testWorkShop.getCarsInWorkshop().size();
    }
    @Test
    public void testRemoveFromWorkshop() {
        ArrayList<Car> cars = new ArrayList<Car>(maxCapacity);
        cars.add(testVolvo);

        testWorkShop.addToWorkshop(testSaab);
        testWorkShop.addToWorkshop(testVolvo);
        testWorkShop.removeFromWorkshop(testSaab);

        assert cars.equals(testWorkShop.getCarsInWorkshop()) ;
    }

    @Test
    public void testRemoveFromWorkshopNotThere() {
        assert testWorkShop.removeFromWorkshop(testSaab) == null;
    }
}
