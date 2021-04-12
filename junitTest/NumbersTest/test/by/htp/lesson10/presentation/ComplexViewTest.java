package by.htp.lesson10.presentation;

import by.htp.lesson10.entity.Complex;
import by.htp.lesson10.logic.ComplexLogic;
import org.junit.Assert;
import org.junit.Test;

public class ComplexViewTest {
    @Test
    public void printSummSuit(){
        Complex compl1 = new Complex(1,3);
        Complex compl2 = new Complex(4,5);

        ComplexLogic logic = new ComplexLogic();
        ComplexView view = new ComplexView();
        Complex compl3 = logic.summ(compl1, compl2);
        view.printSumm(compl1, compl2, compl3);
    }

    @Test
    public void printMinusSuit() {
        Complex compl1 = new Complex(1,3);
        Complex compl2 = new Complex(4,5);

        ComplexLogic logic = new ComplexLogic();
        ComplexView view = new ComplexView();
        Complex compl3 = logic.minus(compl1, compl2);
        view.printMinus(compl1, compl2, compl3);
    }
}
