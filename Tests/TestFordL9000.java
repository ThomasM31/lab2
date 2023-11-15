import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class TestFordL9000 {

    private FordL9000 testFord;
    private Volvo240 testVolvo;
    private Saab95 testSaab;

    @Before
    public void Setup() {
        testVolvo = new Volvo240();
        testFord = new FordL9000();
    }

    @Test
    public void testRaiseRampFail() {
        testFord.raiseRamp();
        assert testFord.getRamp();
    }

    @Test
    public void testLowerRampFail() {
        testFord.gas(1);
        testFord.lowerRamp();
        assert testFord.getRamp();

    }
    @Test
    public void testLoadTrailer() {
        testFord.lowerRamp();
        testFord.loadTrailer(testVolvo);

        assert (testFord.getContentInRamp().firstElement() == testVolvo);
    }

    @Test
    public void testOffloadTrailer() {
        testFord.lowerRamp();
        testFord.loadTrailer(testVolvo);
        testFord.loadTrailer(testSaab);
        testFord.offLoadTrailer();
    }

    @Test
    public void testMoveFord9000() {
        testFord.lowerRamp();
        testFord.loadTrailer(testVolvo);
        testFord.raiseRamp();
        testFord.gas(1);
        testFord.moveCarrier();
        testFord.offLoadTrailer();

        assert Arrays.equals(testFord.getPosition(), testVolvo.getPosition());
    }
}
