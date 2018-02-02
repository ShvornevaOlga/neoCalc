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
      NeoCalc neoCalc = new NeoCalc();
    Baby baby = new Baby();

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
        Component[] needsComponents = neoCalc.getNeedsTab().getComponents();
        for (int i = 0; i < needsComponents.length; i++) {
            if (needsComponents[i].getClass().getName().equals("javax.swing.JTextField")) {
                if (needsComponents[i].isEnabled()) {
                    needsComponents[i].addKeyListener(new NeedsListener(baby, neoCalc));
                }
            }
        }
        neoCalc.getWeightBaby().addKeyListener(new NeedsListener(baby, neoCalc));
        Component[] enteralNutritionComponents = neoCalc.getEnteralNutritionTab().getComponents();
        for (int i = 0; i < enteralNutritionComponents.length; i++) {
            if (enteralNutritionComponents[i].getClass().getName().equals("javax.swing.JTextField")) {
                if (enteralNutritionComponents[i].isEnabled()) {
                    enteralNutritionComponents[i].addKeyListener(new EnteralListener(baby, neoCalc));
                }
            }
            if (enteralNutritionComponents[i].getClass().getName().equals("javax.swing.JPanel")){
                Component[] enteralPanelComponents = ((JPanel)enteralNutritionComponents[i]).getComponents();
                for (int j = 0; j < enteralPanelComponents.length; j++) {
                    if (enteralPanelComponents[j].getClass().getName().equals("javax.swing.JTextField")) {
                        if (enteralPanelComponents[j].isEnabled()) {
                            enteralPanelComponents[j].addKeyListener(new EnteralListener(baby, neoCalc));
                        }
                    }
                }
            }
        }
        Component[] parenteralNutritionComponents = neoCalc.getParenteralNutritionTab().getComponents();
        for (int i = 0; i < parenteralNutritionComponents.length; i++) {
            if (parenteralNutritionComponents[i].getClass().getName().equals("javax.swing.JTextField")) {
                if (parenteralNutritionComponents[i].isEnabled()) {
                    parenteralNutritionComponents[i].addKeyListener(new ParenteralNutritionListener(baby, neoCalc));
                }
            }
        }
        Component[] pp24Components = neoCalc.getProgramPPTab().getComponents();
        for (int i = 0; i < pp24Components.length; i++) {
            if (pp24Components[i].getClass().getName().equals("javax.swing.JTextField")) {
                if (pp24Components[i].isEnabled()) {
                    pp24Components[i].addKeyListener(new PP24Listener(baby, neoCalc));
                }
            }
            if (pp24Components[i].getClass().getName().equals("javax.swing.JPanel")){
                Component[] pp24PanelComponents = ((JPanel)pp24Components[i]).getComponents();
                for (int j = 0; j < pp24PanelComponents.length; j++) {
                    if (pp24PanelComponents[j].getClass().getName().equals("javax.swing.JTextField")) {
                        if (pp24PanelComponents[j].isEnabled()) {
                            pp24PanelComponents[j].addKeyListener(new EnteralListener(baby, neoCalc));
                        }
                    }
                }
            }
        }
        //  neoCalc.getVolumeOfFluidOnKg().setInputVerifier(new WaterValidator(new JDialog(), neoCalc.getVolumeOfFluidOnKg(), "" , baby));
        //   neoCalc.getAminoAcidsKg().setInputVerifier(new AminoAcidsValidator(new JDialog(), neoCalc.getAminoAcidsKg(), "" , baby));
        //  neoCalc.getFatsOnKg().setInputVerifier(new AminoAcidsValidator(new JDialog(), neoCalc.getFatsOnKg(), "" , baby));
        neoCalc.getDrugsCombo().addItemListener(new EnteralItemListener(neoCalc.getDrugsCombo(), baby));
        neoCalc.getGeneralBalanceTab().addFocusListener(new GeneralBalanceListener(baby, neoCalc));
    }


}
