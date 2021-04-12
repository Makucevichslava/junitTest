package by.htp.lesson10.logic;

import by.htp.lesson10.entity.Complex;

public class ComplexLogic {

    public Complex summ(Complex compl1, Complex compl2) {
        Complex result = new Complex();

        result.setMaterial(compl1.getMaterial() + compl2.getMaterial());
        result.setImaginary(compl1.getImaginary() + compl2.getImaginary());

        return result;
    }

    public Complex minus(Complex compl1, Complex compl2) {
        Complex result = new Complex();

        result.setMaterial(compl1.getMaterial() - compl2.getMaterial());
        result.setImaginary(compl1.getImaginary() - compl2.getImaginary());

        return result;
    }
}
