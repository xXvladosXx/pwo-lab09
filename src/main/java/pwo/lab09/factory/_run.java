
package pwo.lab09.factory;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class _run {

    public static void main(String args[]) {
        MessageFactory factory = null;
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.of(today.get(ChronoField.DAY_OF_WEEK));

        factory = switch (dayOfWeek) {
            case MONDAY ->  new Monday();
            case TUESDAY -> new Tuesday();
            case WEDNESDAY -> new Wednesday();
            case THURSDAY -> new Thursday();
            case FRIDAY -> new Friday();
            case SATURDAY -> new Saturday();
            case SUNDAY -> new Sunday();
        };
        System.out.println(factory.createIntroMessage());
        System.out.println(factory.createMainMessage());
        System.out.println(factory.createClosingMessage());
    }
}