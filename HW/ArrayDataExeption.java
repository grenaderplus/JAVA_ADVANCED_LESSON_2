package JAVA_ADVANCED.LESSON_2.HW;

public class ArrayDataExeption extends RuntimeException {
    private int row;
    private int collumn;

    public int getRow() {
        return row;
    }

    public int getCollumn() {
        return collumn;
    }

    public ArrayDataExeption(String message, int row, int collumn) {
        super(message);
        this.row = row;
        this.collumn = collumn;
    }
}
