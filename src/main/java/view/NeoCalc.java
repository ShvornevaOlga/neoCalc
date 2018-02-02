package view;

import javax.swing.*;
import java.awt.*;

public class NeoCalc extends Container {
    private JPanel panel;
    private JTabbedPane JTabbed;
    private JPanel needsTab;
    private JTextField gestationalAge;
    private JTextField dayOfLife;
    private JTextField aminoAcidsKg;
    private JTextField aminoAcidsOnWeight;
    private JTextField fatsOnKg;
    private JTextField carbohydratesOnKg;
    private JTextField volumeOfFluidOnKg;
    private JTextField sodiumOnKg;
    private JTextField potassiumOnKg;
    private JTextField calciumOnKg;
    private JTextField magnesiumOnKg;
    private JTextField fatsOnWeight;
    private JTextField carbohydratesOnWeight;
    private JTextField volumeOfFluidOnWeight;
    private JTextField sodiumOnWeight;
    private JTextField potassiumOnWeight;
    private JTextField calciumOnWeight;
    private JTextField magnesiumOnWeight;
    private JPanel enteralNutritionTab;
    private JTextField numberOfFeedings;
    private JComboBox drugsCombo;
    private JTextField enteralVolumeOnKg;
    private JTextField enteralVolumeOnWeight;
    private JTextField singleEntVolumeOnKg;
    private JTextField amountOfProteinOnKg;
    private JTextField amountOfFatOnKg;
    private JTextField amountOfCarbohydratesOnKg;
    private JTextField energyCarbohydratesOnKg;
    private JTextField energyFatsOnKg;
    private JTextField totalEnergySupplyOnKg;
    private JTextField singleEntVolumeOnWeight;
    private JTextField amountOfProteinOnWeight;
    private JTextField amountOfFatOnWeight;
    private JTextField amountOfCarbohydratesOnWeight;
    private JTextField energyCarbohydratesOnWeight;
    private JTextField energyFatsOnWeight;
    private JTextField totalEnergySupplyOnWeight;
    private JTextField totalEnergyOnKg;
    private JTextField totalEnergyOnWeight;
    private JPanel parenteralNutritionTab;
    private JTextField doseOfAminoAcidsOnKg;
    private JTextField doseOfAminoAcidsOnWeight;
    private JTextField doseFatOnKg;
    private JTextField rateOfGlucoseOnKg;
    private JTextField doseOfGlucoseOnKg;
    private JTextField aminovenOnKg;
    private JTextField energyCarbohydratesOnKgP;
    private JTextField energyFatsOnKgP;
    private JTextField totalEnergySupplyOnKgP;
    private JTextField doseFatOnWeight;
    private JTextField rateOfGlucoseOnWeight;
    private JTextField doseOfGlucoseOnWeight;
    private JTextField aminovenOnWeight;
    private JTextField energyCarbohydratesOnWeightP;
    private JTextField energyFatsOnWeightP;
    private JTextField totalEnergySupplyOnWeightP;
    private JTextField totalEnergyOnKgP;
    private JTextField totalEnergyOnWeightP;
    private JTextField fatEmulsionOnKg;
    private JTextField glucoseOnKg;
    private JTextField fatEmulsionOnWeight;
    private JTextField glucoseOnWeight;
    private JPanel programPPTab;
    private JTextField waterForFarming;
    private JTextField aminoven;
    private JTextField dryMass;
    private JTextField glucose;
    private JTextField concentration;
    private JTextField KCl4;
    private JTextField gluconateCa;
    private JTextField NaCl10;
    private JTextField NaCl09;
    private JTextField MgSO4;
    private JTextField totalPr;
    private JTextField introductionOfTheBasicSolution;
    private JTextField rateOfIntroductionOfTheBasicSolution;
    private JTextField amountGE;
    private JTextField introductionGE;
    private JTextField rateOfIntroductionGE;
    private JTextField amountOfTherapeuticDrugs;
    private JTextField doseKCLOnKg;
    private JTextField doseKCLOnWeight;
    private JTextField doseGluconateCaOnKg;
    private JTextField doseNaCl10OnKg;
    private JTextField doseGluconateCaOnWeight;
    private JTextField doseNaCl10OnWeight;
    private JTextField doseNaCl09OnKg;
    private JTextField doseNaCl09OnWeight;
    private JTextField doseMgSO4OnKg;
    private JTextField doseMgSO4OnWeight;
    private JPanel generalBalanceTab;
    private JTextField totalVolumeOfLiquid;
    private JTextField enteralVolume;
    private JTextField volumeParenteralInfusion;
    private JTextField amountOfDrugs;
    private JTextField volumeOfWaterForBreeding;
    private JTextField amountOfProteinOnKgG;
    private JTextField amountOfProteinOnWeightG;
    private JTextField amountOfFatOnKgG;
    private JTextField amountOfCarbohydratesOnKgG;
    private JTextField energyCarbohydratesOnKgG;
    private JTextField energyFatsOnKgG;
    private JTextField totalEnergySupplyOnKgG;
    private JTextField totalEnergyOnKgG;
    private JTextField amountOfFatOnWeightG;
    private JTextField amountOfCarbohydratesOnWeightG;
    private JTextField energyCarbohydratesOnWeightG;
    private JTextField energyFatsOnWeightG;
    private JTextField totalEnergySupplyOnWeightG;
    private JTextField totalEnergyOnWeightG;
    private JButton printButton;
    private JButton newCalculationButton;
    private JLabel weightLable;
    private JTextField weightBaby;

    public NeoCalc() {
        drugsCombo.addItem("Грудное молоко зрелое");
        drugsCombo.addItem("Nestogen");
        drugsCombo.addItem("NAN 1 жидкий");
        drugsCombo.addItem("Нутрилон");
        drugsCombo.addItem("Энфамил премиум 1");
        drugsCombo.addItem("NAN антирефлюкс");
        drugsCombo.addItem("Грудное молоко (преждевременные роды)");
        drugsCombo.addItem("Альфаре");
        drugsCombo.addItem("Pre NAN NEW");
        drugsCombo.addItem("Инфатрини");
        drugsCombo.addItem("Нутрилон Пепти ТСЦ");
        drugsCombo.addItem("Пре-Нутрилон 0");
        drugsCombo.addItem("Пре-Нутрилон 1");
        drugsCombo.addItem("Similac Neo Sure");
        drugsCombo.addItem("Similac Special Care");
        drugsCombo.addItem("Фрисопре");
        drugsCombo.addItem("Прегестимил");
        drugsCombo.addItem("Enfamil Premature");
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getNeedsTab() {
        return needsTab;
    }

    public JPanel getEnteralNutritionTab() {
        return enteralNutritionTab;
    }

    public JComboBox getDrugsCombo() {
        return drugsCombo;
    }

    public JPanel getParenteralNutritionTab() {
        return parenteralNutritionTab;
    }

    public JPanel getProgramPPTab() {
        return programPPTab;
    }

    public JPanel getGeneralBalanceTab() {
        return generalBalanceTab;
    }

    public JButton getPrintButton() {
        return printButton;
    }

    public JButton getNewCalculationButton() {
        return newCalculationButton;
    }

    public JTextField getWeightBaby() {
        return weightBaby;
    }
}