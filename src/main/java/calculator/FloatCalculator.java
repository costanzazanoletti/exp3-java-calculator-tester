package calculator;

public class FloatCalculator {

  // non può essere istanziata la classe
  private FloatCalculator() {
  }


  public static float add(float num1, float num2) {
    return num1 + num2;
  }

  public static float subtract(float num1, float num2) {
    return num1 - num2;
  }

  public static float multiply(float num1, float num2) {
    return num1 * num2;
  }

  public static float divide(float num1, float num2) throws ArithmeticException {
    if (num2 == 0.0F) {
      throw new ArithmeticException("divide per 0");
    }
    return num1 / num2;
  }

}
