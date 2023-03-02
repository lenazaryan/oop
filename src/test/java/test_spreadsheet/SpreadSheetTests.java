package test_spreadsheet;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import spreadsheet.Cell;
import spreadsheet.Spreadsheet;
import spreadsheet.StringCell;

public class SpreadSheetTests {

    @Test
    public void testSetCellAt1() {
        SoftAssert softAssert = new SoftAssert();
        Spreadsheet spreadsheet = new Spreadsheet(1, 1);
        spreadsheet.setCellAt(0, 0, new StringCell());
        softAssert.assertEquals(true, spreadsheet.getRows() == 1, "Test Failed");
        softAssert.assertEquals(true, spreadsheet.getColumns() == 1, "Test Failed");
        softAssert.assertAll();
    }

    @Test
    public void testSetCellAt2() {
        Spreadsheet spreadsheet = new Spreadsheet(2, 6);
        spreadsheet.setCellAt(1, 5, "some value");
        Assert.assertEquals(spreadsheet.getCellAt(1, 5).toString(),
                "some value", "Incorrect Text");
    }

//    @Test
//    public void testPrintSpreadsheet() {
//        SoftAssert softAssert = new SoftAssert();
//        Spreadsheet spreadsheet = new Spreadsheet(1, 2);
//        spreadsheet.setCellAt(0, 0, "first");
//        spreadsheet.setCellAt(0, 1, "second");
//        spreadsheet.printSpreadsheet();
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 0).getValue(),
//                "first", "Incorrect contents");
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 1).toString(),
//                "second", "Incorrect contents");
//        softAssert.assertEquals(spreadsheet.getRows(), 1, "Number of rows doesn't match");
//        softAssert.assertEquals(spreadsheet.getColumns(), 2, "Number of columns doesn't match");
//        softAssert.assertAll();
//    }

    @Test
    public void testGetCell() {
        Spreadsheet spreadsheet = new Spreadsheet(1, 1);
        spreadsheet.setCellAt(0, 0, "some string");
        Assert.assertEquals(spreadsheet.getCellAt(0, 0).toString(),
                "some string", "Test Failed");
    }

    @Test
    public void testAddRow() {
        Spreadsheet spreadsheet = new Spreadsheet(2, 3);
        spreadsheet.setCellAt(0, 0, "val1");
        spreadsheet.setCellAt(0, 1, "val2");
        spreadsheet.setCellAt(1, 0, "val3");
        spreadsheet.setCellAt(1, 1, "val4");
        spreadsheet.addRow(1);
//        spreadsheet.printSpreadsheet();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(true, spreadsheet.getRows() == 3, "Incorrect number of rows");
        softAssert.assertNull(spreadsheet.getCellAt(1, 0), "Incorrect cells content");
        softAssert.assertNull(spreadsheet.getCellAt(1, 1), "Incorrect cells content");
        softAssert.assertAll();
    }

//    @Test
//    public void testRemoveRow() {
//        SoftAssert softAssert = new SoftAssert();
//        Spreadsheet spreadsheet = new Spreadsheet(4, 4);
//        spreadsheet.setCellAt(0, 0, "first");
//        spreadsheet.setCellAt(1, 0, "second");
//        spreadsheet.setCellAt(2, 0, "third");
//        spreadsheet.setCellAt(3, 0, "fourth");
//        spreadsheet.removeRow(3);
//        softAssert.assertEquals(spreadsheet.getRows(), 3, "Incorrect number of rows");
//        Assert.assertEquals(spreadsheet.getCellAt(0, 0).getValue(), "first", "Wrong row deleted");
//        Assert.assertEquals(spreadsheet.getCellAt(1, 0).getValue(), "second", "Wrong row deleted");
//        Assert.assertEquals(spreadsheet.getCellAt(2, 0).getValue(), "third", "Wrong row deleted");
//        softAssert.assertAll();
//    }

    @Test
    public void testAddColumn() {
        SoftAssert softAssert = new SoftAssert();
        Spreadsheet spreadsheet = new Spreadsheet(3, 3);
        spreadsheet.setCellAt(0, 0, "val1");
        spreadsheet.setCellAt(0, 1, "val2");
        spreadsheet.setCellAt(0, 2, "val3");
        spreadsheet.addColumn(1);
//        spreadsheet.printSpreadsheet();
        softAssert.assertTrue(spreadsheet.getColumns() == 4, "Incorrect number of columns");
        softAssert.assertNull(spreadsheet.getCellAt(0, 1), "Incorrect cells content");
        softAssert.assertNull(spreadsheet.getCellAt(1, 1), "Incorrect cells content");
        softAssert.assertNull(spreadsheet.getCellAt(2, 1), "Incorrect cells content");
        softAssert.assertAll();
    }
//
//    @Test
//    public void testRemoveColumn() {
//        Spreadsheet spreadsheet = new Spreadsheet(4, 4);
//        spreadsheet.setCellAt(0, 0, "first");
//        spreadsheet.setCellAt(0, 1, "second");
//        spreadsheet.setCellAt(0, 2, "third");
//        spreadsheet.setCellAt(0, 3, "fourth");
////        spreadsheet.printSpreadsheet();
//        spreadsheet.removeColumn(2);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 0).getValue(), "first", "Wrong column removed");
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 1).getValue(), "second", "Wrong column removed");
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 2).getValue(), "fourth", "Wrong column removed");
//        softAssert.assertEquals(spreadsheet.getColumns(), 3, "Incorrect number of columns");
//        softAssert.assertAll();
//    }

//    @Test
//    public void testSwapRows() {
//        Spreadsheet spreadsheet = new Spreadsheet(2, 2);
//        spreadsheet.setCellAt(0, 0, "value1");
//        spreadsheet.setCellAt(0, 1, "value2");
//        spreadsheet.setCellAt(1, 0, "value3");
//        spreadsheet.setCellAt(1, 1, "value4");
//        spreadsheet.swapRows(0, 1);
////        spreadsheet.printSpreadsheet();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 0).getValue(), "value3");
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 1).getValue(), "value4");
//        softAssert.assertEquals(spreadsheet.getCellAt(1, 0).getValue(), "value1");
//        softAssert.assertEquals(spreadsheet.getCellAt(1, 1).getValue(), "value2");
//        softAssert.assertAll();
//    }

//    @Test
//    public void testSwapColumns() {
//        Spreadsheet spreadsheet = new Spreadsheet(2, 2);
//        spreadsheet.setCellAt(0, 0, "value1");
//        spreadsheet.setCellAt(0, 1, "value2");
//        spreadsheet.setCellAt(1, 0, "value3");
//        spreadsheet.setCellAt(1, 1, "value4");
////        spreadsheet.printSpreadsheet();
//        spreadsheet.swapColumns(0, 1);
////        spreadsheet.printSpreadsheet();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 0).getValue(), "value2");
//        softAssert.assertEquals(spreadsheet.getCellAt(0, 1).getValue(), "value1");
//        softAssert.assertEquals(spreadsheet.getCellAt(1, 0).getValue(), "value4");
//        softAssert.assertEquals(spreadsheet.getCellAt(1, 1).getValue(), "value3");
//        softAssert.assertAll();
//    }

}
