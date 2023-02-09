package test_spreadsheet;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import spreadsheet.Cell;

import java.util.Calendar;


public class CellTests {

    @Test
    public void testSetValue() {
        Cell cell = new Cell();
        cell.setValue(null);
        Assert.assertNull(cell.getValue(), "Test Failed");
    }

    @Test
    public void testGetValue(){
        Cell cell = new Cell("some string");
        Assert.assertEquals(cell.getValue(), "some string", "Test Failed");
    }

    @Test
    public void testResetCell() {
        Cell cell = new Cell("some string");
        cell.resetCell();
        Assert.assertNull(cell.getValue(), "Test Failed");
    }

    @Test
    public void testToInt() {
        Cell cell = new Cell();
        cell.setValue("234");
        Assert.assertEquals(cell.toInt(), 234, "Test Failed");
    }

    @Test
    public void testToDouble() {
        Cell cell = new Cell();
        cell.setValue("3.4");
        Assert.assertEquals(cell.toDouble(), 3.4, "Test Failed");
    }

    @Test
    public void testToDate() {
        SoftAssert softAssert = new SoftAssert();
        Cell cell = new Cell("31/May/2005");
        java.util.Date date = cell.toDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        softAssert.assertTrue(calendar.get(Calendar.DAY_OF_MONTH) == 31, "Incorrect Day");
        softAssert.assertTrue(calendar.get(Calendar.MONTH) == 4, "Incorrect Month");
        softAssert.assertTrue(calendar.get(Calendar.YEAR) == 2005, "Incorrect Year");
        softAssert.assertAll();
    }

}
