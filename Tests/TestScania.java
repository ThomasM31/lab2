import org.junit.Before;
import org.junit.Test;

public class TestScania {
    private Scania TestScania;
    @Before
    public void Setup() {
        TestScania = new Scania();

    }
    @Test
    public void testRaiseTrailer(){
        TestScania.raiseTrailer(20);
        System.out.println(TestScania.getTrailer());
        TestScania.raiseTrailer(60);
        assert (TestScania.getTrailer() == 20);
    }

    @Test
    public void testLowerTrailer() {
    TestScania.raiseTrailer(20);
    TestScania.lowerTrailer(10);
    System.out.println(TestScania.getTrailer());
    assert (TestScania.getTrailer() == 10);
    }
}
