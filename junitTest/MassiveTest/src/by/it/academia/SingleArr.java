package by.it.academia;

import by.it.academia.logic.SingleArrLogic;

public class SingleArr {
    public static void main(String[] args) {
        SingleArrLogic srLogic = new SingleArrLogic();
        int[] arr = {1, 2, 3, 4, -5};
        int[] nArr = srLogic.replaceMaxMin(arr);

        for (int i = 0; i < nArr.length; i++) {
            System.out.printf("%3d", nArr[i]);
        }
        System.out.println();
        System.out.println("Первое положительное число: " + srLogic.searchFirstPositiveNumber(arr));
        System.out.println("Первое отрицательное число: " + srLogic.searchFirstNegativeNumber(arr));
    }
}
