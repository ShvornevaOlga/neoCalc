package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PP24Listener extends KeyAdapter {
    private NeoCalc neoCalc;
    private Baby baby;

    public PP24Listener(Baby baby, NeoCalc neoCalc) {
        this.baby = baby;
        this.neoCalc = neoCalc;
    }

    public void keyReleased(KeyEvent e) {
        FieldsSetter.setBabyFields(baby, e);

        baby.calcPP24();

        FieldsSetter.setFields(baby, neoCalc);
    }
}

