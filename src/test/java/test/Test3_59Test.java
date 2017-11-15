package test;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class Test3_59Test {
    @Test
        public void testLocalDateTime()  {
        ZonedDateTime zdt1 = ZonedDateTime.of(2015, 1, 10, 15, 0, 0, 0, ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt2 = ZonedDateTime.of(2015, 1, 10, 14, 0, 0, 0, ZoneId.of("Europe/London"));
        Assert.assertEquals(-1, zdt1.compareTo(zdt2));
        LocalDateTime ldt1 = zdt1.toLocalDateTime();
        LocalDateTime ldt2 = zdt2.toLocalDateTime();
       // Assert.assertEquals(+1, ldt1.compareTo(ldt2));
    }
}