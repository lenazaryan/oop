package spreadsheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cell {
    private String value;
    private Color color;

    public Cell() {
        value = null;
        color = Color.WHITE;
    }

    public Cell(String value) {
        this.value = value;
        this.color = Color.WHITE;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void resetCell() {
        this.value = null;
    }

    public int toInt() {
        return Integer.parseInt(value);
    }

    public Date toDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        try {
            return dateFormat.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public double toDouble() {
        return Double.parseDouble(value);
    }

    public String toString() {
        return value;
    }

}


