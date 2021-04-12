package by.it.academia.entity;

import java.util.Objects;

public class Round {
    private double rSqtr;
    private double dlOkr;
    private int r;

    public Round(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getDlOkr() {
        return dlOkr;
    }

    public void setDlOkr(double dlOkr) {
        this.dlOkr = dlOkr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return Double.compare(round.rSqtr, rSqtr) == 0 &&
                Double.compare(round.dlOkr, dlOkr) == 0 &&
                r == round.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rSqtr, dlOkr, r);
    }

    public double getrSqtr() {
        return rSqtr;
    }

    public void setrSqtr(double rSqtr) {
        this.rSqtr = rSqtr;
    }

}