package by.htp.lesson10.entity;

import java.util.Objects;

public class Complex {
    private int material;
    private int imaginary;

    public Complex() {
        material = 0;
        material = 0;
    }

    public Complex(int material, int imaginary) {

        this.material = material;
        this.imaginary = imaginary;

    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return material == complex.material &&
                imaginary == complex.imaginary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, imaginary);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "material=" + material +
                ", imaginary=" + imaginary +
                '}';
    }
}
