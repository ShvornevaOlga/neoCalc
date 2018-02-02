package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ParenteralNutritionListener extends KeyAdapter {
    private NeoCalc neoCalc;
    private Baby baby;

    public ParenteralNutritionListener(Baby baby, NeoCalc neoCalc) {
        this.baby = baby;
        this.neoCalc = neoCalc;
    }

    public void keyReleased(KeyEvent e) {
        FieldsSetter.setBabyFields(baby,e);
        baby.calcParenteralNutrition();
        FieldsSetter.setFields(baby, neoCalc);
    }
}

