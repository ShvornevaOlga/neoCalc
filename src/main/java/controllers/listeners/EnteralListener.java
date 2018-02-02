package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EnteralListener extends KeyAdapter {
    private NeoCalc neoCalc;
    private Baby baby;
    private final String DRUG = "Грудное молоко зрелое";
    private final String SET = "set";

    public EnteralListener(Baby baby, NeoCalc neoCalc) {
        this.baby = baby;
        this.neoCalc = neoCalc;
    }

    public void keyReleased(KeyEvent e) {
        FieldsSetter.setBabyFields(baby,e);
        if (baby.getEnteralVolumeOnKg() != 0 && baby.getNumberOfFeedings() != 0) {
            if (baby.getDrugs() == null) {
                baby.setDrugs(DRUG);
            }
            baby.calcEnteralNutrition();
        }
        FieldsSetter.setFields(baby, neoCalc);
    }
}

