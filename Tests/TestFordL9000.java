import org.junit.Before;
import org.junit.Test;
public class TestFordL9000 {

    private FordL9000 testFord;
    @Before
    public void Setup() {
        testFord = new FordL9000();
    }

    @Test
    public void testRaiseRampFail() {
        testFord.startEngine();
        testFord.raiseRamp();
        //assert !testFord.getRamp().getRamp();
    }

    @Test
    public void testLowerRampFail() {
        testFord.gas(1);
        testFord.lowerRamp();
        assert testFord.getRamp();

    }
    @Test
    public void testLoadTrailer() {

    }

    @Test
    public void testOffloadTrailer() {
        testFord.loadTrailer(testVolvo);
        testFord.loadTrailer(testSaab);
        testFord.offLoadTrailer();
    }

    @Test
    public void testMoveFord9000() {
        testFord.loadTrailer(testVolvo);
        testFord.gas(1);
        testFord.moveCarrier();
        testFord.offLoadTrailer();
        assert testFord.getPosition() == testVolvo.getPosition();
    }
}
