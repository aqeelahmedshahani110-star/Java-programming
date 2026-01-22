import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-1, calculator.multiply(-1, 1));
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertEquals(-1, calculator.divide(-2, 2));
    }
}