package test_spreadsheet;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import spreadsheet.*;

import java.util.Calendar;


public class CellTests {

    @Test
    public void testSetValue() {
        StringCell cell = new StringCell();
        cell.setValue(null);
        Assert.assertNull(cell.getValue(), "Test Failed");
    }

    @Test
    public void testGetValue() {
        StringCell cell = new StringCell("some string");
        Assert.assertEquals(cell.getValue(), "some string", "Test Failed");
    }

//    @Test
//    public void testResetCell() {
//        Cell cell = new StringCell("some string");
//        cell.resetCell();
//        Assert.assertNull(cell.getValue(), "Test Failed");
//    }
//
//    @Test
//    public void testToInt() {
//        Cell cell = new IntCell(234);
//        Assert.assertEquals(cell.getValue(), 234, "Test Failed");
//    }

    @Test
    public void testCellGetStringFromDouble() {
        Cell cell = new DoubleCell(3.4);
        Assert.assertEquals(cell.getString(), "3.4", "Test Failed");
    }

    @Test
    public void testDoubleCellGetValue() {
        DoubleCell cell = new DoubleCell(3.4);
        Assert.assertEquals(cell.getValue(), 3.4, "Test Failed");
    }

    @Test
    public void testCellGetStringFromInt() {
        Cell cell = new IntCell(234);
        int cellValue = Integer.parseInt(cell.toString());
        Assert.assertEquals(cellValue, 234, "Test Failed");
    }

//    @Test
//    public void testToDate() {
//        SoftAssert softAssert = new SoftAssert();
//        DateCell cell = new DateCell(2005, 3, 23);
//        java.util.Date date = cell.toDate();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        softAssert.assertTrue(calendar.get(Calendar.DAY_OF_MONTH) == 31, "Incorrect Day");
//        softAssert.assertTrue(calendar.get(Calendar.MONTH) == 4, "Incorrect Month");
//        softAssert.assertTrue(calendar.get(Calendar.YEAR) == 2005, "Incorrect Year");
//        softAssert.assertAll();
//    }

}
