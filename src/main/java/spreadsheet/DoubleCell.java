package spreadsheet;

public class DoubleCell extends Cell{
    private Double value;

    public DoubleCell(double value){
        this.value = value;
    }

    @Override
    public String getString(){
        return value.toString();
    }

    public double getValue(){
        return value;
    }
}
