package by.it.academia.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DualArrLogicTest {
    @Test
    public void diagElemCollectorSuit() {
        int[][] mass = new int[3][3];
        mass[0] = new int[]{1,2,3};
        mass[1] = new int[]{4,5,6};
        mass[2] = new int[]{7,8,9};

        DualArrLogic logic = new DualArrLogic();
        int[] realResult = logic.diagElemCollector(mass);
        int[] waitedResult = {1,5,9};
        for (int i = 0; i < mass.length; i++) {
            Assert.assertEquals(waitedResult[i], realResult[i]);
        }
    }
    @Test
    public void sevenCountCollectorSuit() {
        int[][] mass = new int[3][3];
        mass[0] = new int[]{7,2,3};
        mass[1] = new int[]{4,5,7};
        mass[2] = new int[]{7,7,9};

        DualArrLogic logic = new DualArrLogic();
        int realResult = logic.sevenCountCollector(mass);
        int waitedResult = 4;
        Assert.assertEquals(waitedResult, realResult);
    }

    @Test
    public void increaceRowSorterSuit() {
        int[][] mass = new int[3][3];
        mass[0] = new int[]{7,2,3};
        mass[1] = new int[]{4,5,1};
        mass[2] = new int[]{7,7,4};

        int[][] waitedResult = new int[3][3];
        waitedResult[0] = new int[]{2,3,7};
        waitedResult[1] = new int[]{1,4,5};
        waitedResult[2] = new int[]{4,7,7};

        DualArrLogic logic = new DualArrLogic();
        int[][] realResult = logic.increaceRowSorter(mass);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                Assert.assertEquals(waitedResult[i][j], realResult[i][j]);
            }
        }
    }

    @Test
    public void decreaseRowSorterSuit() {
        int[][] mass = new int[3][3];
        mass[0] = new int[]{7,2,3};
        mass[1] = new int[]{4,5,1};
        mass[2] = new int[]{7,7,4};

        int[][] waitedResult = new int[3][3];
        waitedResult[0] = new int[]{7,3,2};
        waitedResult[1] = new int[]{5,4,1};
        waitedResult[2] = new int[]{7,7,4};

        DualArrLogic logic = new DualArrLogic();
        int[][] realResult = logic.decreaseRowSorter(mass);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                Assert.assertEquals(waitedResult[i][j], realResult[i][j]);
            }
        }

    }
}
