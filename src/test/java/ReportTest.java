package BYT11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReportTest {

    private ArrayList<Report> listOfReports;
    private Report report1, report2;
    private SimpleDateFormat format;
    private Date dateCreated1, dateCreated2;

    @Before
    public void setUp() throws ParseException {
        format = new SimpleDateFormat("yyyy-MM-dd");
        dateCreated1 = format.parse( "2009-12-31");
        dateCreated2 = format.parse( "2001-1-11");
        listOfReports = new ArrayList<>();
        report1 = new Report(0,"hello, there is some problem", dateCreated1, listOfReports);
        report2 = new Report(1,"hello, there is some problem", dateCreated2, listOfReports);
        report1.createReport();
        report2.createReport();
    }

    @Test
    public void testCreateReport(){

        Assert.assertEquals(2, listOfReports.size());
    }

    @Test
    public void testDeleteReport(){
        report1.deleteReport(0);
        Assert.assertEquals(1, listOfReports.size());
    }

    @Test
    public void testGetMessage() {
        Assert.assertEquals("hello, there is some problem", report1.getMessage());
    }

    @Test
    public void testSetMessage() {
        report1.setMessage("Hi");
        Assert.assertEquals("Hi", report1.getMessage());
    }

    @Test
    public void testGetIdReport(){
        Assert.assertEquals(0, report1.getIdReport());
    }

    @Test
    public void testGetDateCreated(){
        Assert.assertEquals(dateCreated1, report1.getDateCreated());
    }

    @Test
    public void testConstructor(){
        Report report3 = new Report(2,"Hello, world!", dateCreated2, listOfReports);
        Assert.assertEquals("Hello, world!", report3.getMessage());
        Assert.assertEquals(2, report3.getIdReport());
        Assert.assertEquals(dateCreated2, report3.getDateCreated());
    }

}
