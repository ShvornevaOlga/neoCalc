package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

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
        List<Field> filds = Arrays.asList(baby.getClass().getDeclaredFields());
        for (Field field : filds) {
            field.setAccessible(true);
            try {

                String nameBaby = field.getName();

                if (!nameBaby.equals("drugs") && !nameBaby.equals("kKalFats") && !nameBaby.equals("kKalCarbohydrates")) {
                    double value = (Double) field.get(baby);
                    Field neoCalcField = neoCalc.getClass().getDeclaredField(nameBaby);
                    neoCalcField.setAccessible(true);
                    JTextField jTextField = (JTextField) neoCalcField.get(neoCalc);
                    String txt = String.valueOf(new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue());
                    Double inputValue = jTextField.getText().equals("") ? 0 : Double.parseDouble(jTextField.getText());
                    if (inputValue != value) {
                        jTextField.setText(txt);
                    }
                    neoCalcField.setAccessible(false);
                }
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (NoSuchFieldException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
