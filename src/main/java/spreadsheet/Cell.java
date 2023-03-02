package spreadsheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Cell {
    public String value;
    public Color color = Color.WHITE;

    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
    public abstract String getString();

    public void resetCell() {
        this.value = null;
    }

    public String toString() {
        return getString();
    }

}


