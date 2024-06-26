import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void calculate() {
    }

    @Test
    void partCalculate() {
    }

    @DisplayName("연산자인지 아닌지 확인")
    @ParameterizedTest
    @ValueSource(strings = {"#","$","1","a"})
    void isPermittedOperation(String input) {
        assertFalse(calculator.isPermittedOperation(input));
    }

    @DisplayName("연산자인지 확인")
    @ParameterizedTest
    @ValueSource(strings = {"+","-","*","/"})
    void isPermittedOperation2(String input) {
        assertTrue(calculator.isPermittedOperation(input));
    }
}