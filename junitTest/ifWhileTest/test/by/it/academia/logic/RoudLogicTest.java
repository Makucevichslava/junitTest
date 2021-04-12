package by.it.academia.logic;

import by.it.academia.entity.Round;
import org.junit.Assert;
import org.junit.Test;

public class RoudLogicTest {
    @Test
    public void roundSqrtCounter() {
        Round rn = new Round(4);
        int waitResult = 50;
        RoundLogic rLogic = new RoundLogic();
        Round rn1 = rLogic.roundSqrtCounter(rn);
        double realRes = rn1.getrSqtr();

        Assert.assertEquals(waitResult, realRes, 0.3);
    }

    @Test
    public void dlinnaOkrCounter() {
        Round rn = new Round(4);
        int waitResult = 12;
        RoundLogic rLogic = new RoundLogic();
        Round rn1 = rLogic.dlinnaOkrCounter(rn);
        double realRes = rn1.getDlOkr();

        Assert.assertEquals(waitResult, realRes, 0.6);
    }
}
