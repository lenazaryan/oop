package spreadsheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCell extends Cell{
    private int year;
    private int month;
    private int day;
    public DateCell(int year, int month, int day){
        setValue(year, month, day);
    }

    public void setValue(int year, int month, int day){
        this.year = year;
        this.day = day;
        this.month = month;
    }

    @Override
    public String getString(){
        return value.toString();
    }


}
