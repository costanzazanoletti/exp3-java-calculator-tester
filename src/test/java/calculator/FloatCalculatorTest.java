package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FloatCalculatorTest {

  @Test
  void add() {
    assertEquals(5.6F, FloatCalculator.add(2.5F, 3.1F));
    assertEquals(0F, FloatCalculator.add(0F, 0F));
    assertEquals(-5.6F, FloatCalculator.add(-2.5F, -3.1F));
  }

  @Test
  void subtract() {
    assertEquals(1.700000286102295F, FloatCalculator.subtract(5.30F, 3.60F));
  }

  @Test
  void multiply() {
  }

  @Test
  void divide() {
    assertThrows(ArithmeticException.class, () -> FloatCalculator.divide(5.0F, 0.0F));
    assertEquals(5.0F, FloatCalculator.divide(5.0F, 1.0F));
  }
}