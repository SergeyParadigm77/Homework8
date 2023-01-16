import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        byte[] firstArray = new byte[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        boolean[] thirdArray = {true, false, true};
    }

    public static void task2() {
        byte[] firstArray = new byte[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (byte i = 0; i < firstArray.length; i++) {
            if (i != firstArray.length - 1) {
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.println(firstArray[i]);
            }
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        byte f = 0;
        while (f < secondArray.length) {
            if (f != secondArray.length - 1) {
                System.out.print(secondArray[f] + ", ");
            } else {
                System.out.println(secondArray[f]);
            }
            f++;
        }
        boolean[] thirdArray = {true, false, true};
        byte j = 0;
        do {
            if (j != thirdArray.length - 1) {
                System.out.print(thirdArray[j] + ", ");
            } else {
                System.out.println(thirdArray[j]);
            }
            j++;
        }
        while (j < thirdArray.length);
    }

    public static void task3() {
        byte[] firstArray = new byte[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.println(firstArray[i]);
            }
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        int f = secondArray.length - 1;
        while (f >= 0) {
            if (f != 0) {
                System.out.print(secondArray[f] + ", ");
            } else {
                System.out.println(secondArray[f]);
            }
            f--;
        }
        boolean[] thirdArray = {true, false, true};
        int j = thirdArray.length - 1;
        do {
            if (j != 0) {
                System.out.print(thirdArray[j] + ", ");
            } else {
                System.out.println(thirdArray[j]);
            }
            j--;
        }
        while (j >= 0);
    }
    public static void task4() {
        byte[] firstArray = new byte[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (byte i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}