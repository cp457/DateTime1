import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();

        System.out.println(date1.lengthOfMonth() - date1.getDayOfMonth());
        System.out.println(date1.lengthOfYear() - date1.getDayOfYear());


    }
}

/* using LocaleDate, calculate and print:

    how many days are left till the end of the month
    how many days are left till the end of the year, using the length() method from java.time.Year.of()
 */