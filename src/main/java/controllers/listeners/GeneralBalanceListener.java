package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GeneralBalanceListener implements FocusListener {

    private Baby baby;
    private NeoCalc neoCalc;

    public GeneralBalanceListener(Baby baby, NeoCalc neoCalc) {
        this.baby = baby;
        this.neoCalc = neoCalc;
    }

    @Override
    public void focusGained(FocusEvent e) {
        baby.calcGeneralBalance();
        FieldsSetter.setFields(baby, neoCalc);
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
