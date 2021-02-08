package HomeWork2;

import java.util.Arrays;

public class ArraysExceptions {
    public static void main(String[] args) {

        String[][] ar = {{"1", "2", "3", "4"},
                {"1", "2", "9", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "9"}};
                //{"1", "2", "3", "9"}};
        try {
            System.out.println(ex1(ar));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static int ex1(String[][] ar) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (ar.length != 4)
            throw new MyArraySizeException("Строк должно быть 4! ");
            for (int i = 0; i < ar.length; i++) {
                if (ar[i].length != 4) throw new MyArraySizeException("Столбцов должно быть 4!");
                    for (int j = 0; j < ar[i].length; j++) {
                        try {
                            sum = sum + Integer.parseInt(ar[i][j]);
                        } catch (RuntimeException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }
            }return sum;
    }
}
    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message1) {
            super(message1);
        }
    }
    class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j) {
            super("неверный формат в ячейке (" + i + ", " + j + ") ");
        }
    }

