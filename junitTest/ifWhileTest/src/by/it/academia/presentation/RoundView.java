package by.it.academia.presentation;

import by.it.academia.entity.Round;

public class RoundView {
    public void roundSqrtView(Round rn) {
        System.out.println("Площадь круга: " + rn.getrSqtr());
    }

    public void dlinnaOkrView(Round rn) {
        System.out.println("Длинна окружности: " + rn.getDlOkr());
    }
}
