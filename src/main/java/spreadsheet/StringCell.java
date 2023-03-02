package spreadsheet;

public class StringCell extends Cell {
    String value;

    public StringCell(String value){
        this.value = value;
    }

    public StringCell(){
        this.value = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getString() {
        return value;
    }
}
