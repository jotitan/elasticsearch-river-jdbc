package org.elasticsearch.river.jdbc;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilTest {


    @Test
    public void testDate(){
        String datestr = "2012-05-01 12:00:02";

        Date date = DateUtil.parseDate(datestr);

        Assert.assertEquals(DateUtil.formatDateStandard(date),datestr);
    }

    @Test
    public void testFormatDateISO(){
        Calendar c = Calendar.getInstance();
        // December 11th 2012, 11:30:25
        c.set(2012,11,11,11,30,25);

        System.out.println(DateUtil.formatDateISO(c.getTime()));
    }

}
