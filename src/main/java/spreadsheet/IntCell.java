package spreadsheet;

public class IntCell extends Cell {
    private Integer value;

    public IntCell(int value) {
        this.value = value;
    }


    @Override
    public String getString(){
        return value.toString();
    }

    public int getValue(){
        return value;
    }
}
