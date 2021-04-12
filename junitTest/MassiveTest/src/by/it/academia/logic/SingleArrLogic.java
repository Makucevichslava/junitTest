package by.it.academia.logic;

public class SingleArrLogic {
    public int[] replaceMaxMin(int[] sArr) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (min > sArr[i]) {
                min = i;
            } else if (max < sArr[i]) {
                max = i;
            }
        }
        int temp = sArr[max];
        sArr[max] = sArr[min];
        sArr[min] = temp;
        return sArr;
    }

    public int searchFirstPositiveNumber(int[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] >= 0) {
                return sArr[i];
            }
        }
        return 0;
    }

    public int searchFirstNegativeNumber(int[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] < 0) {
                return sArr[i];
            }
        }
        return 0;
    }

}
