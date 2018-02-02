package controllers;

import controllers.listeners.*;
import model.Baby;
import view.NeoCalc;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private NeoCalc neoCalc = new NeoCalc();
    private Baby baby = new Baby();

    public Controller() {
        neoCalc = new NeoCalc();
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public void createForm() {
        JFrame frame = new JFrame("App");
        JPanel generalPanel = neoCalc.getPanel();
        setFilter();
        neoCalc.getNewCalculationButton().addActionListener(new NewCalcListener(neoCalc, this));
        neoCalc.getPrintButton().addActionListener(new PrintListener(baby));
        frame.setContentPane(generalPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setFilter() {
        setDigitalFilter();
        setNeedsListener();
        neoCalc.getWeightBaby().addKeyListener(new NeedsListener(baby, neoCalc));
        setEnteralListener();
        setParenteralListener();
        setPP24Listeer();
        neoCalc.getDrugsCombo().addItemListener(new EnteralItemListener(neoCalc.getDrugsCombo(), baby));
        neoCalc.getGeneralBalanceTab().addFocusListener(new GeneralBalanceListener(baby, neoCalc));
    }

    private void setPP24Listeer() {
        Component[] pp24Components = neoCalc.getProgramPPTab().getComponents();
        for (Component pp24Component : pp24Components) {
            if (pp24Component.getClass().getName().equals("javax.swing.JTextField")) {
                if (pp24Component.isEnabled()) {
                    pp24Component.addKeyListener(new PP24Listener(baby, neoCalc));
                }
            }
            if (pp24Component.getClass().getName().equals("javax.swing.JPanel")) {
                Component[] pp24PanelComponents = ((JPanel) pp24Component).getComponents();
                for (Component pp24PanelComponent : pp24PanelComponents) {
                    if (pp24PanelComponent.getClass().getName().equals("javax.swing.JTextField")) {
                        if (pp24PanelComponent.isEnabled()) {
                            pp24PanelComponent.addKeyListener(new EnteralListener(baby, neoCalc));
                        }
                    }
                }
            }
        }
    }

    private void setParenteralListener() {
        Component[] parenteralNutritionComponents = neoCalc.getParenteralNutritionTab().getComponents();
        for (Component parenteralNutritionComponent : parenteralNutritionComponents) {
            if (parenteralNutritionComponent.getClass().getName().equals("javax.swing.JTextField")) {
                if (parenteralNutritionComponent.isEnabled()) {
                    parenteralNutritionComponent.addKeyListener(new ParenteralNutritionListener(baby, neoCalc));
                }
            }
        }
    }

    private void setEnteralListener() {
        Component[] enteralNutritionComponents = neoCalc.getEnteralNutritionTab().getComponents();
        for (Component enteralNutritionComponent : enteralNutritionComponents) {
            if (enteralNutritionComponent.getClass().getName().equals("javax.swing.JTextField")) {
                if (enteralNutritionComponent.isEnabled()) {
                    enteralNutritionComponent.addKeyListener(new EnteralListener(baby, neoCalc));
                }
            }
            if (enteralNutritionComponent.getClass().getName().equals("javax.swing.JPanel")) {
                Component[] enteralPanelComponents = ((JPanel) enteralNutritionComponent).getComponents();
                for (Component enteralPanelComponent : enteralPanelComponents) {
                    if (enteralPanelComponent.getClass().getName().equals("javax.swing.JTextField")) {
                        if (enteralPanelComponent.isEnabled()) {
                            enteralPanelComponent.addKeyListener(new EnteralListener(baby, neoCalc));
                        }
                    }
                }
            }
        }
    }

    private void setNeedsListener() {
        Component[] needsComponents = neoCalc.getNeedsTab().getComponents();
        for (Component needsComponent : needsComponents) {
            if (needsComponent.getClass().getName().equals("javax.swing.JTextField")) {
                if (needsComponent.isEnabled()) {
                    needsComponent.addKeyListener(new NeedsListener(baby, neoCalc));
                }
            }
        }
    }

    private void setDigitalFilter() {
        List<Field> filds = Arrays.asList(neoCalc.getClass().getDeclaredFields());
        for (Field field : filds) {
            if (field.getType().getName().equals("javax.swing.JTextField")) {
                field.setAccessible(true);
                try {
                    JTextField value = (JTextField) field.get(neoCalc);

                    if (value.isEnabled()) {
                        //
                        value.setName(field.getName());
                        if (!field.getName().equals("doseOfAminoAcidsOnKg") && !field.getName().equals("doseFatOnKg") && !field.getName().equals("rateOfGlucoseOnKg")) {
                            ((PlainDocument) value.getDocument()).setDocumentFilter(new DigitalFilter());
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
    }


}
