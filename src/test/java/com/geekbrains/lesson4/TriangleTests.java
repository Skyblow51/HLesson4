package com.geekbrains.lesson4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.geekbrains.lesson4.Triangle.calculateSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    public void positiveSquareTest() throws Exception {
        double result = calculateSquare(3, 7, 5);
        assertEquals(6.49519052838329, result);
    }

    @Test
    public void negativeExceptionTest() {
        Exception negativeResult = Assertions.assertThrows(Exception.class, () -> calculateSquare(-3, 3, 3));
        assertEquals("Необходимо проверить  значения", negativeResult.getMessage());
        System.out.println(negativeResult.getMessage());
    }

    @Test
    public void positiveSquareTriangleTest() throws Exception {
        double result = calculateSquare(3, 14, 2);
//        assert result != 0;
        Assertions.assertTrue(result != 0);
    }

    @Test
    public void positiveSquareResultTriangleTest() throws Exception {
        double result = calculateSquare(17, 14, 8);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void positiveIsoscelesTriangleTest() { //равнобедренный
        Exception whatTriangleResult = Assertions.assertThrows(Exception.class, () -> calculateSquare(7, 11, 7));
        assertEquals("Равнобедренный треугольник", whatTriangleResult.getMessage());
    }

    @Test
    public void positiveEquilateralTriangleTest() { //равносторонний
        Exception whatTriangleResult = Assertions.assertThrows(Exception.class, () -> calculateSquare(8, 8, 8));
        assertEquals("Равносторонний треугольник", whatTriangleResult.getMessage());
    }
}
