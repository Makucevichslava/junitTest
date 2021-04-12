package by.htp.lesson10.logic;

import by.htp.lesson10.entity.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexLogicTest {
    @Test
    public void summSuit() {
        Complex cmpl = new Complex(1, 2);
        Complex cmpl2 = new Complex(3, 4);
        Complex waitRes = new Complex(4, 6);

        ComplexLogic logic = new ComplexLogic();
        Complex realRes = logic.summ(cmpl, cmpl2);
        Assert.assertEquals(waitRes, realRes);
    }

    @Test
    public void minusSuit() {
        Complex cmpl = new Complex(1, 2);
        Complex cmpl2 = new Complex(3, 4);
        Complex waitRes = new Complex(-2, -2);

        ComplexLogic logic = new ComplexLogic();
        Complex realRes = logic.minus(cmpl, cmpl2);
        Assert.assertEquals(waitRes, realRes);
    }
}
