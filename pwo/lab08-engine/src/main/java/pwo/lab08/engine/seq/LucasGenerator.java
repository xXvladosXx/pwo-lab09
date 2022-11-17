package pwo.seq;

import java.math.BigDecimal;

/**
 * The class responsible for generating the Lucas string. Extends the classroom
 * responsible for generating Fibonacci sequence words
 *
 * @author pidoras
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy, który przypisuje zmiennym dla ciągu Lucasa początkowe
     * wartości.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);

    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);

    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);

        }
        return super.nextTerm();

    }
}
