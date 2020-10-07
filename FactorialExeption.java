package JAVA_ADVANCED.LESSON_2;

public class FactorialExeption extends IllegalArgumentException {
    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialExeption(int number) {
        this.number = number;
    }

    public FactorialExeption(String s, int number) {
        super(s);
        this.number = number;
    }
}
