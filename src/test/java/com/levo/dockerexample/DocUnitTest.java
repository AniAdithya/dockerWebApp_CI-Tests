package com.levo.dockerexample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DocUnitTest{
 @Test
   public void testOnePlusOne() {
       assertEquals(2, 1 + 1);
       assertEquals(4, 2 + 2);
   }

    @Test
    public void testFactorial() {
        assertEquals(1, factorial(0));  // 0! = 1
        assertEquals(1, factorial(1));  // 1! = 1
        assertEquals(2, factorial(2));  // 2! = 2
        assertEquals(6, factorial(3));  // 3! = 6
        assertEquals(24, factorial(4)); // 4! = 24
        assertEquals(120, factorial(5)); // 5! = 120
    }

    // Factorial method to support the test
    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

