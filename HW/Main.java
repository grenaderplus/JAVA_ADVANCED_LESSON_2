package JAVA_ADVANCED.LESSON_2.HW;

// прошу прощения за лишний текст, разбираюсь с гитом

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) { // массив
        String [][] arr = {
                {"1","45","54","6"},
                {"452","65","56","w34"},
                {"1","34ew","9","34"},
                {"1234","1234","34t","43"}
        };

        try {
            System.out.println(sum(arr));
        } catch (ArraySizeExeption e) {
            e.printStackTrace();
        } catch (ArrayDataExeption e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCollumn());
            System.out.println(arr[e.getRow()][e.getCollumn()]);
        }

        System.out.println("END");
    }

    static int sum(String[][]arr) throws ArraySizeExeption, ArrayDataExeption {
        if (arr.length != SIZE) {
            throw new ArraySizeExeption();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE){
                throw new ArraySizeExeption();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataExeption("Format",i,j);
                }
            }
        }
        return sum;
    }
}
