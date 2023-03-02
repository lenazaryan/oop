package spreadsheet;

abstract class AbstractTable {
    public abstract void addRow(int row);

    public abstract void removeRow(int row);

    public abstract void addColumn(int column);

    public abstract void removeColumn(int column);

    public abstract void swapRows(int row1, int row2);

    public abstract void swapColumns(int column1, int column2);
}
