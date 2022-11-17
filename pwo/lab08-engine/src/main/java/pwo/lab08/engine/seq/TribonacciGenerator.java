package pwo.seq;

import java.math.BigDecimal;

/**
 * In mathematics, the Fibonacci numbers form a sequence defined recursively
 * That is, after two starting values, each number is the sum of the two preceding numbers.
 * @author pidoras
 * @version 1.0.0
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Generates a constructor with default f_3 = 0
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resets value to 0
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

     /**
     * Adding more than two numbers to generate the next number, or by adding objects other than numbers 
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
