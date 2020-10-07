package JAVA_ADVANCED.LESSON_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            int a = 1;
//            int b = 5;
//            System.out.println(b / a);
//
//            int[] arr = {3,4,5};
//            System.out.println("тут должна быть ошибка");
//            arr[99] = 7;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }

//        try {
//            int a = 1;
//            int b = 5;
//            System.out.println(b / a);
//            try {
//                int[] arr = {3, 4, 5};
//                System.out.println("тут должна быть ошибка");
//                arr[99] = 7;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ВНУТРЕННИЙ");
////                throw e;
//                throw new RuntimeException("Сам создал");
//            }
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ВНЕШНИЙ");
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

//        System.out.println(sqrt(-9));

//        try {
//            int a = 0;
//            int b = 5;
//            System.out.println(b / a);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("FINALLY");
//        }

//        try {
//            openFileTryWithResourcesT("1.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println(factorial(-5));
//        } catch (FactorialExeption e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getNumber());
//        }

        String [][] arr = {
                {"5","rfgadfg","113245","96"},
                {"5","32234","11","96"},
                {"524523","32"},
                {"5","32234","yjbig","96","34","66"},
                {"5","32","11"},
                {"5","wc","9452345"},
        };
        System.out.println(arr.length);
        System.out.println(arr[2].length);
        int x = Integer.parseInt(arr[1][2]);

        System.out.println("END");

    }

    static int factorial(int n) {
        if (n <= 0) {
            throw new FactorialExeption("arg < 0: " + n, n);
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("argument " + x + " < 0");
        }
        return Math.sqrt(x);
    }

    static void openFile(String filename) {
        FileInputStream in = null;
        try {
            in = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void openFileTryWithResources(String filename) {
        try (FileInputStream in = new FileInputStream(filename)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void openFileTryWithResourcesT(String filename) throws IOException {
        try (FileInputStream in = new FileInputStream(filename)) {

        }
    }

    static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
    }


}
