package by.it.academia.logic;

import org.junit.Assert;
import org.junit.Test;

public class SingleArrLogicTest {
    @Test
    public void replaceMaxMinSuit() {
        SingleArrLogic srLogic = new SingleArrLogic();
        int[] arr = {1, 2, 3, 4, -5};
        int[] realResult = srLogic.replaceMaxMin(arr);
        int[] waitedResult = {1, 2, 3, -5, 4};

        for (int i = 0; i < realResult.length; i++) {
            Assert.assertEquals(waitedResult[i], realResult[i]);
        }
    }

    @Test
    public void searchFirstPositiveNumberSuit() {
        SingleArrLogic srLogic = new SingleArrLogic();
        int[] arr = {1, 2, 3, 4, -5};
        int realResult = srLogic.searchFirstPositiveNumber(arr);
        int waitedResult = 1;

        Assert.assertEquals(waitedResult, realResult);
    }

    @Test
    public void searchFirstNegativeNumberSuit() {
        SingleArrLogic srLogic = new SingleArrLogic();
        int[] arr = {1, 2, 3, 4, -5};
        int realResult = srLogic.searchFirstNegativeNumber(arr);
        int waitedResult = -5;

        Assert.assertEquals(waitedResult, realResult);
    }
}
