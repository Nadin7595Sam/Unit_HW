import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidArguments() {
        Calculator calculator = new Calculator();

        // Проверка расчета скидки
        BigDecimal purchaseAmount = BigDecimal.valueOf(100);
        double discountPercentage = 10;
        BigDecimal expectedDiscountedAmount = BigDecimal.valueOf(90);

        BigDecimal actualDiscountedAmount = calculator.calculateDiscount(purchaseAmount, discountPercentage);

        Assertions.assertThat(actualDiscountedAmount).isEqualByComparingTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithNullPurchaseAmount() {
        Calculator calculator = new Calculator();

        // Проверка исключения при null сумме покупки
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(null, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы");
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        Calculator calculator = new Calculator();

        // Проверка исключения при отрицательной сумме покупки
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(BigDecimal.valueOf(-50), 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы");
    }

    @Test
    public void testCalculateDiscountWithInvalidDiscountPercentage() {
        Calculator calculator = new Calculator();

        // Проверка исключения при недопустимом проценте скидки
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(BigDecimal.valueOf(100), -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы");

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(BigDecimal.valueOf(100), 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы");
    }
}