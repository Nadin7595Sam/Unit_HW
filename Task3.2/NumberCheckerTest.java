import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    @Test
    public void testNumberInIntervalWithinRange() {
        NumberChecker checker = new NumberChecker();

        assertTrue(checker.numberInInterval(26), "26 должно быть в интервале (25;100)");
        assertTrue(checker.numberInInterval(99), "99 должно быть в интервале (25;100)");
    }

    @Test
    public void testNumberInIntervalOutsideRange() {
        NumberChecker checker = new NumberChecker();

        assertFalse(checker.numberInInterval(25), "25 не должно быть в интервале (25;100)");
        assertFalse(checker.numberInInterval(100), "100 не должно быть в интервале (25;100)");
        assertFalse(checker.numberInInterval(0), "0 не должно быть в интервале (25;100)");
        assertFalse(checker.numberInInterval(200), "200 не должно быть в интервале (25;100)");
    }
}