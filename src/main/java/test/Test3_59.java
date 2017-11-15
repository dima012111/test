package test;


import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.chrono.JulianChronology;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Test3_59 {

    static int x;
    {
        int[] ia2={4,5,6};
    }
    static {
        int []ia={1,2,3};
        for (int i=0;i<3;i++){
            System.out.println(ia[i]);
        }
        x=7;
        System.out.println(x);
    }
    public static void main(String s[]) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd.mm.yyyy h:mm");
        Date d=sdf.parse("22.06.1995 23:21");
       Instant i= Clock.systemUTC().instant();
        Date dd=new Date();
        DateTime dt=new DateTime();
        Long l=dd.getTime();
        OffsetDateTime of=OffsetDateTime.now();
        dd.setTime(d.getTime()+(24*60*60*1000));
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        sdf.setTimeZone(tz);
        String text=d.toString();
        java.time.Clock c=Clock.systemDefaultZone();
        Long ll=c.millis();

        LocalDateTime ldc=LocalDateTime.now();
        ZoneOffset zo=ZoneOffset.UTC;
        ZonedDateTime zd=ZonedDateTime.now();
        System.out.println(text);
        ZonedDateTime zdt3=ZonedDateTime.of(2017,2,28,23,00,00,00,ZoneId.of("UTC"));
        Calendar cc=new GregorianCalendar(2017,01,22);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:dd z", Locale.CHINA);
        text=zdt3.format(dtf);

        TimeZone tzz=cc.getTimeZone();

//        new Test3_59();
//        Date d=new Date();
//        Instant i=d.toInstant();
//        int a=0;
//        LocalDate lc=LocalDate.now();
//        Date dd=Date.from(i);
//        //SimpleDateFormat sdf=new SimpleDateFormat("dd.mm.yyyy").parse("22.06.1995");
//        DateFormat df= SimpleDateFormat.getDateInstance(LONG);
        Date theEnd = new Date(Long.MAX_VALUE);

        DateFormat dateFormat = SimpleDateFormat.getDateTimeInstance(SimpleDateFormat.LONG, SimpleDateFormat.LONG);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        text = dateFormat.format(theEnd);

        System.out.println(text);

    }
}
