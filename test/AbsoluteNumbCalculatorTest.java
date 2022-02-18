import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AbsoluteNumbCalculatorTest {

    @Test
    void findAbs0() {
        int numb=0;
        int expected=0;
        int result = AbsoluteNumbCalculator.findAbs(numb);
        assertEquals(expected,result);
    }@Test
    void findAbs1() {
        int numb=1;
        int expected=1;
        int result = AbsoluteNumbCalculator.findAbs(numb);
        assertEquals(expected,result);
    }@Test
    void findAbsMinus1() {
        int numb=-1;
        int expected=1;
        int result = AbsoluteNumbCalculator.findAbs(numb);
        assertEquals(expected,result);
    }
}