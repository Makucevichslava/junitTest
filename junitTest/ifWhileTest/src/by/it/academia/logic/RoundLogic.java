package by.it.academia.logic;

import by.it.academia.entity.Round;

public class RoundLogic {
    public Round roundSqrtCounter(Round rn) {
        rn.setrSqtr(Math.PI * Math.pow(rn.getR(), 2));
        return rn;
    }

    public Round dlinnaOkrCounter(Round rn) {
        rn.setDlOkr(Math.PI * rn.getR());
        return rn;
    }
}
