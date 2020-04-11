package lesson2pack;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= arInt.length - 1 ; i++) {
            if (arInt[i] == 0) {
                arInt[i] = 1;
            } else {
                arInt[i] = 0;
            }
            System.out.printf(arInt[i] + "  ");
        }

//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] brInt;
        brInt = new int[8];
        for (int i = 0; i <= brInt.length-1; i++) {
            brInt[i] = i * 3;
            System.out.printf(brInt[i] + "  ");
        }

//         3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] crInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= crInt.length - 1; i++) {
            if (crInt[i] < 6) {
                crInt[i] = crInt[i] * 2;
            }
            System.out.printf(crInt[i] + "  ");
        }

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] drInt = new int[12][12];
        for (int i = 0; i <= drInt.length - 1; i++) {
            for (int j = 0; j <= drInt[i].length - 1; j++) {
                if (i == j  || i + j == drInt[i].length - 1) {
                    drInt[i][j] = 1;
                }
                System.out.printf(drInt[i][j] + "  ");
            }
            System.out.printf("\n");
        }

//      5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int minAr = Integer.MAX_VALUE;
        int maxAr = Integer.MIN_VALUE;
        int[] erInt = {55, 20, 18, 45, 76, 23 ,43 ,35, 89};
        for (int i = 0; i <= erInt.length - 1; i++) {
            if (erInt[i] < minAr) {
                minAr = erInt[i];
            }
            if (erInt[i] > maxAr) {
                maxAr = erInt[i];
            }
        }
                System.out.printf("min=%s   max=%s", minAr, maxAr);


         //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] frInt = new int[4];
        for (int i = 0; i <= frInt.length - 1; i++) {
            frInt[i] = (int) (Math.random()*10);
        }
        if (isLeftCompareToRight(frInt)) {
            System.out.println("true");

        }

    }

    // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    private static boolean isLeftCompareToRight(int[] inAr) {
  //      System.out.println(Arrays.toString(inAr));
        for (int i = 1; i <= inAr.length - 1; i++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = 0; j <= inAr.length - 1; j++) {
                if (j < i) {
                    leftSide += inAr[j];
                } else {
                    rightSide += inAr[j];
                }
            }
            if (leftSide == rightSide) {
                return true;
//                System.out.printf("   +++%s--%s+++  \n",leftSide, rightSide);
            }
        }
        return false;
    }


}
