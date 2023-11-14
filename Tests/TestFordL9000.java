import org.junit.Before;
import org.junit.Test;
public class TestFordL9000 {

    private FordL9000 testFord;
    @Before
    public void Setup() {
        testFord = new FordL9000();
    }
    @Test
    public void testMoveCarrier(){
        //testFord.move();
    }

    @Test
    public void testRaiseRampFail() {
        testFord.startEngine();
        testFord.raiseRamp();
        //assert !testFord.getRamp().getRamp();
    }

    @Test
    public void testLowerRampFail() {

    }
}
