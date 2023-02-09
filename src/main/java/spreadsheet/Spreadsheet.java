package spreadsheet;

public class Spreadsheet {
    Cell[][] cells;
    int rows;

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    int columns;

    public Spreadsheet(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.cells = new Cell[rows][columns];
    }

    public void setCellAt(int row, int column, Cell cell) {
        cells[row][column] = cell;
    }

    public void setCellAt(int row, int column, String cellValue) {
        cells[row][column] = new Cell(cellValue);
    }

    public Cell getCellAt(int row, int column) {
        return cells[row][column];
    }

    public void addRow(int row) {
        Cell[][] newCells = new Cell[rows + 1][columns];
        for (int i = 0; i < row; i++) {
            newCells[i] = cells[i];
        }
        for (int i = row; i < rows; i++) {
            newCells[i + 1] = cells[i];
        }
        cells = newCells;
        rows++;
    }

    public void removeRow(int row) {
        Cell[][] newCells = new Cell[rows - 1][columns];
        for (int i = 0; i < row; i++) {
            newCells[i] = cells[i];
        }
        for (int i = row + 1; i < rows; i++) {
            newCells[i - 1] = cells[i];
        }
        cells = newCells;
        rows--;
    }

    public void addColumn(int column) {
        Cell[][] newCells = new Cell[rows][columns + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                newCells[i][j] = cells[i][j];
            }
            for (int j = column; j < columns; j++) {
                newCells[i][j + 1] = cells[i][j];
            }
        }
        cells = newCells;
        columns++;
    }

    public void removeColumn(int column) {
        Cell[][] newCells = new Cell[rows][columns - 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                newCells[i][j] = cells[i][j];
            }
            for (int j = column + 1; j < columns; j++) {
                newCells[i][j - 1] = cells[i][j];
            }
        }
        cells = newCells;
        columns--;
    }

    public void swapRows(int row1, int row2) {
        Cell[] temp = cells[row1];
        cells[row1] = cells[row2];
        cells[row2] = temp;

    }

    public void swapColumns(int column1, int column2) {
        for (int i = 0; i < rows; i++) {
            Cell temp = cells[i][column1];
            cells[i][column1] = cells[i][column2];
            cells[i][column2] = temp;
        }
    }

    public Cell[][] printSpreadsheet() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(cells[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        return cells;
    }
}

