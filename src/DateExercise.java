import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateExercise {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String fullDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(fullDate);

        String mediumDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(mediumDate);

        String shortDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(shortDate);
    }

}
