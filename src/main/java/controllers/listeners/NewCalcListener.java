package controllers.listeners;

import controllers.Controller;
import model.Baby;
import view.NeoCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class NewCalcListener implements ActionListener {
    private NeoCalc neoCalc;
    private Controller controller;

    public NewCalcListener(NeoCalc neoCalc, Controller controller) {
        this.neoCalc = neoCalc;
        this.controller = controller;
    }

    public void actionPerformed(ActionEvent e) {
        controller.setBaby(new Baby());
        controller.setFilter();
        List<Field> filds = Arrays.asList(neoCalc.getClass().getDeclaredFields());
        for (Field field : filds) {
            if (field.getType().getName().equals("javax.swing.JTextField")) {
                field.setAccessible(true);
                try {
                    JTextField value = (JTextField) field.get(neoCalc);
                    value.setText("");
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
    }
}
