package controllers.listeners;

import javafx.scene.control.ComboBox;
import model.Baby;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EnteralItemListener implements ItemListener {
    JComboBox drugsCombo;
    Baby baby;
    public EnteralItemListener(JComboBox drugsCombo, Baby baby){
        this.drugsCombo = drugsCombo;
        this.baby = baby;
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        baby.setDrugs(String.valueOf(drugsCombo.getSelectedItem()));
    }
}
