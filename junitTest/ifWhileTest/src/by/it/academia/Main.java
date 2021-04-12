package by.it.academia;

import by.it.academia.entity.Round;
import by.it.academia.logic.RoundLogic;
import by.it.academia.presentation.RoundView;

public class Main {
    public static void main(String[] args) {
        Round rn = new Round(4);

        RoundLogic rLogic = new RoundLogic();
        RoundView rw = new RoundView();

        rw.roundSqrtView(rLogic.roundSqrtCounter(rn));
        rw.dlinnaOkrView(rLogic.dlinnaOkrCounter(rn));
    }
}
