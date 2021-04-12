package by.htp.lesson10;

import by.htp.lesson10.entity.Complex;
import by.htp.lesson10.logic.ComplexLogic;
import by.htp.lesson10.presentation.ComplexView;

public class Main {
    public static void main(String[] args) {
        Complex compl1 = new Complex(1,3);
        Complex compl2 = new Complex(4,5);

        ComplexLogic logic = new ComplexLogic();
        ComplexView view = new ComplexView();

        Complex compl4 = logic.summ(compl1, compl2);
        Complex compl3 = logic.minus(compl1, compl2);

        view.printSumm(compl1, compl2, compl4);
        view.printMinus(compl1, compl2, compl3);

    }
}
