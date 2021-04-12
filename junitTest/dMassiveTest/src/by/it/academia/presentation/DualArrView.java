package by.it.academia.presentation;

public class DualArrView {
    public static void arrPrinter(int[] mass, int spaces, String str) {
        System.out.println(str);
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%" + spaces + "d", mass[i]);
        }
        System.out.println();
    }

    public static void arrPrinter(int[][] mass, int spaces, String str) {
        System.out.println(str);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("%" + spaces + "d", mass[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
