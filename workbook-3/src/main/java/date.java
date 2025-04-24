import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class date {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       //#1
//        System.out.println(LocalDate.now());
//
//        //#2
//        System.out.println(LocalDate.of(2025,12,25));

        //#3
//        LocalDate localDate = LocalDate.of(2023,4,13);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
//
//        //#4
//        System.out.println(LocalTime.now());
//
//        //#5
//        System.out.println(LocalTime.of(15,30));
//
//        //#6
//        LocalDateTime localDateTime = LocalDateTime.of(2021,12,23,3,00);
//        System.out.println(localDateTime.getMinute());
//        System.out.println(localDateTime.getHour());
//
//        //#8
//        LocalDateTime localDateTime1 =LocalDateTime.now();
//        System.out.println(localDateTime1);
//
//        //#9
//        System.out.println(localDateTime1.plusWeeks(1));
//
//        //#10
//        System.out.println(localDateTime1.minusWeeks(3));
//
//        //#11
//        System.out.println(LocalTime.now().plusHours(2).plusMinutes(30));
//
//        //#12
//        System.out.println(LocalDateTime.now().plusDays(1));

//       //#13
//        String date = "2025-04-01";
//        System.out.println(LocalDate.parse(date));

        //#14
//        String time = "09:30";
//        System.out.println(LocalTime.parse(time));

//        #15
//        String dateTime = "2025-04-01T09:30";
//        System.out.println(LocalDateTime.parse(dateTime));

//        #16
//        LocalDate localDate4 = LocalDate.of(2010,11,24);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-yy");
//        System.out.println(localDate4.format(dtf));

//        #17
//        LocalTime localTime3 = LocalTime.of(9,45);
//        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
//        System.out.println(localTime3.format(dtf2));

//        #18
//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd,yyyy 'at' hh:mm");
//        System.out.println(localDateTime.format(dateTimeFormatter));

//        #19
//        LocalDate localDate = LocalDate.of(2022,3,12);
//        LocalDate localDate2 = LocalDate.of(2021,12,23);
//
//        if (localDate2.isAfter(localDate)){
//            System.out.println("LocalDate2 is after localDate ");
//        }else if(localDate2.isBefore(localDate)){
//            System.out.println("LocalDate2 is before localDate ");
//        }else {
//            System.out.println("Same day");
//        }

//        #24
//        System.out.println("Please enter an event date (MM-dd-yy)");
//        String date = scanner.nextLine();
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");
//        LocalDate localDate = LocalDate.parse(date,dtf);
//
//        long daysLeft = ChronoUnit.DAYS.between(localDate, LocalDate.now());
//
//        if (localDate.isBefore(LocalDate.now())){
//            System.out.println("The event was " + Math.abs(ChronoUnit.DAYS.between(localDate,LocalDate.now())) + " days ago");
//        }else if(localDate.isAfter(LocalDate.now())){
//            System.out.println(Math.abs(ChronoUnit.DAYS.between(localDate,LocalDate.now())) + " days left");
//        }

        //#25

        LocalDate localDate = LocalDate.of(2025,04,25);
        LocalTime localTime = LocalTime.of(3,45);
        LocalDateTime localDateTime = LocalDateTime.of(localDate , localTime);
        LocalDateTime result = null;
        for (int i = 0; i < 4; i++){
            System.out.println(localDateTime.plusWeeks(i));
        }



    }
}
