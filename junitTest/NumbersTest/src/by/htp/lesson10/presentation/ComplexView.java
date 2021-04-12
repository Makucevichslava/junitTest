package by.htp.lesson10.presentation;

import by.htp.lesson10.entity.Complex;

public class ComplexView {
    private String complexNumber(Complex compl){
        if (compl.getImaginary() > 0){
            return compl.getMaterial() + "+" + compl.getImaginary() + "i";
        } else {
            return compl.getMaterial() + "" + compl.getImaginary() + "i";
        }

    }
    public void printSumm(Complex compl1, Complex compl2, Complex compl3) {
        System.out.println("Сумма комлексных чисел: " + complexNumber(compl1) + " и " +
                complexNumber(compl2) + " = " + complexNumber(compl3));
    }

    public void printMinus(Complex compl1, Complex compl2, Complex compl3) {
        System.out.println("Разница комлексных чисел: " + complexNumber(compl1) + " и " +
                complexNumber(compl2) + " = " + complexNumber(compl3));
    }
}
