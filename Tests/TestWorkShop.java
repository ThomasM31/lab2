import org.junit.Before;
import org.junit.Test;
import java.awt.*;

public class TestWorkShop {
    private Point pos;
    private WorkShop testWorkShop;
    private Saab95 testSaab;

    @Before
    public void setup() {
        pos = new Point(1,1);
        testWorkShop = new WorkShop<Car>(pos,5);
        testSaab = new Saab95();
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
        // TODO: Hjääääälp
        //List<Saab95> cars = new List();

        //assert cars == testWorkShop.getCarsInWorkshop();
    }
    @Test
    public void testAddToWorkshop() {
        testWorkShop.addToWorkshop(testSaab);

    }
}
