package controllers.listeners;

import model.Baby;
import view.NeoCalc;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class FieldsSetter {
    private static final String DRUGS = "drugs";
    private static final String FATS = "kKalFats";
    private static final String CARBOHYDRATES = "kKalCarbohydrates";
    private static final String SET = "set";

    public static void setFields(Baby baby, NeoCalc neoCalc) {
        List<Field> filds = Arrays.asList(baby.getClass().getDeclaredFields());
        for (Field field : filds) {
            field.setAccessible(true);
            try {

                String nameBaby = field.getName();

                if (!nameBaby.equals(DRUGS) && !nameBaby.equals(FATS) && !nameBaby.equals(CARBOHYDRATES)) {
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

    public static void setBabyFields(Baby baby, KeyEvent e) {
        String name = ((JTextField) e.getSource()).getName();
        try {
            Method method = baby.getClass().getMethod(SET + name.substring(0, 1).toUpperCase() + name.substring(1), double.class);
            String value = ((JTextField) e.getSource()).getText();
            if (value.equals("")) {
                method.invoke(baby, 0);
            } else {
                method.invoke(baby, Double.parseDouble(value));
            }

        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }
    }
}
