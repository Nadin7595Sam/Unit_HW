import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    @Test
    public void testEvenNumber() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(2), "2 должно быть четным числом");
        assertTrue(checker.evenOddNumber(0), "0 должно быть четным числом");
        assertTrue(checker.evenOddNumber(-4), "-4 должно быть четным числом");
    }

    @Test
    public void testOddNumber() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.evenOddNumber(1), "1 должно быть нечетным числом");
        assertFalse(checker.evenOddNumber(-3), "-3 должно быть нечетным числом");
        assertFalse(checker.evenOddNumber(5), "5 должно быть нечетным числом");
    }

    @Test
    public void testZero() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(0), "0 должно быть четным числом");
    }
}