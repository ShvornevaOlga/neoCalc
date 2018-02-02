package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NeedsListener extends KeyAdapter {
    private NeoCalc neoCalc;
    private Baby baby;

    public NeedsListener(Baby baby, NeoCalc neoCalc) {
        this.baby = baby;
        this.neoCalc = neoCalc;
    }

    public void keyReleased(KeyEvent e) {
        FieldsSetter.setBabyFields(baby, e);
        baby.calculate();
        FieldsSetter.setFields(baby, neoCalc);
    }
}

