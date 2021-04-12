package by.it.academia.logic;

public class DualArrLogic {
    public int[] diagElemCollector(int[][] mass) {
        int[] arr = new int[mass.length];

        for (int i = 0; i < mass.length; i++) {
            arr[i] = mass[i][i];
        }
        return arr;
    }

    public int sevenCountCollector(int[][] mass) {
        int count = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[][] increaceRowSorter(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                for (int k = 0; k < mass[i].length-1; k++) {
                    if (mass[i][k] > mass[i][k+1]) {
                        int temp = mass[i][k];
                        mass[i][k] = mass[i][k+1];
                        mass[i][k+1] = temp;
                    }
                }
            }
        }
        return mass;
    }

    public int[][] decreaseRowSorter(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                for (int k = 0; k < mass[i].length-1; k++) {
                    if (mass[i][k] < mass[i][k+1]) {
                        int temp = mass[i][k];
                        mass[i][k] = mass[i][k+1];
                        mass[i][k+1] = temp;
                    }
                }
            }
        }
        return mass;
    }
}
