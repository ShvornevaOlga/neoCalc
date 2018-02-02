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

    public  NeoCalc(){
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

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTabbedPane getJTabbed() {
        return JTabbed;
    }

    public void setJTabbed(JTabbedPane JTabbed) {
        this.JTabbed = JTabbed;
    }

    public JPanel getNeedsTab() {
        return needsTab;
    }

    public void setNeedsTab(JPanel needsTab) {
        this.needsTab = needsTab;
    }

    public JTextField getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(JTextField gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public JTextField getDayOfLife() {
        return dayOfLife;
    }

    public void setDayOfLife(JTextField dayOfLife) {
        this.dayOfLife = dayOfLife;
    }

    public JTextField getAminoAcidsKg() {
        return aminoAcidsKg;
    }

    public void setAminoAcidsKg(JTextField aminoAcidsKg) {
        this.aminoAcidsKg = aminoAcidsKg;
    }

    public JTextField getAminoAcidsOnWeight() {
        return aminoAcidsOnWeight;
    }

    public void setAminoAcidsOnWeight(JTextField aminoAcidsOnWeight) {
        this.aminoAcidsOnWeight = aminoAcidsOnWeight;
    }

    public JTextField getFatsOnKg() {
        return fatsOnKg;
    }

    public void setFatsOnKg(JTextField fatsOnKg) {
        this.fatsOnKg = fatsOnKg;
    }

    public JTextField getCarbohydratesOnKg() {
        return carbohydratesOnKg;
    }

    public void setCarbohydratesOnKg(JTextField carbohydratesOnKg) {
        this.carbohydratesOnKg = carbohydratesOnKg;
    }

    public JTextField getVolumeOfFluidOnKg() {
        return volumeOfFluidOnKg;
    }

    public void setVolumeOfFluidOnKg(JTextField volumeOfFluidOnKg) {
        this.volumeOfFluidOnKg = volumeOfFluidOnKg;
    }

    public JTextField getSodiumOnKg() {
        return sodiumOnKg;
    }

    public void setSodiumOnKg(JTextField sodiumOnKg) {
        this.sodiumOnKg = sodiumOnKg;
    }

    public JTextField getPotassiumOnKg() {
        return potassiumOnKg;
    }

    public void setPotassiumOnKg(JTextField potassiumOnKg) {
        this.potassiumOnKg = potassiumOnKg;
    }

    public JTextField getCalciumOnKg() {
        return calciumOnKg;
    }

    public void setCalciumOnKg(JTextField calciumOnKg) {
        this.calciumOnKg = calciumOnKg;
    }

    public JTextField getMagnesiumOnKg() {
        return magnesiumOnKg;
    }

    public void setMagnesiumOnKg(JTextField magnesiumOnKg) {
        this.magnesiumOnKg = magnesiumOnKg;
    }

    public JTextField getFatsOnWeight() {
        return fatsOnWeight;
    }

    public void setFatsOnWeight(JTextField fatsOnWeight) {
        this.fatsOnWeight = fatsOnWeight;
    }

    public JTextField getCarbohydratesOnWeight() {
        return carbohydratesOnWeight;
    }

    public void setCarbohydratesOnWeight(JTextField carbohydratesOnWeight) {
        this.carbohydratesOnWeight = carbohydratesOnWeight;
    }

    public JTextField getVolumeOfFluidOnWeight() {
        return volumeOfFluidOnWeight;
    }

    public void setVolumeOfFluidOnWeight(JTextField volumeOfFluidOnWeight) {
        this.volumeOfFluidOnWeight = volumeOfFluidOnWeight;
    }

    public JTextField getSodiumOnWeight() {
        return sodiumOnWeight;
    }

    public void setSodiumOnWeight(JTextField sodiumOnWeight) {
        this.sodiumOnWeight = sodiumOnWeight;
    }

    public JTextField getPotassiumOnWeight() {
        return potassiumOnWeight;
    }

    public void setPotassiumOnWeight(JTextField potassiumOnWeight) {
        this.potassiumOnWeight = potassiumOnWeight;
    }

    public JTextField getCalciumOnWeight() {
        return calciumOnWeight;
    }

    public void setCalciumOnWeight(JTextField calciumOnWeight) {
        this.calciumOnWeight = calciumOnWeight;
    }

    public JTextField getMagnesiumOnWeight() {
        return magnesiumOnWeight;
    }

    public void setMagnesiumOnWeight(JTextField magnesiumOnWeight) {
        this.magnesiumOnWeight = magnesiumOnWeight;
    }

    public JPanel getEnteralNutritionTab() {
        return enteralNutritionTab;
    }

    public void setEnteralNutritionTab(JPanel enteralNutritionTab) {
        this.enteralNutritionTab = enteralNutritionTab;
    }

    public JTextField getNumberOfFeedings() {
        return numberOfFeedings;
    }

    public void setNumberOfFeedings(JTextField numberOfFeedings) {
        this.numberOfFeedings = numberOfFeedings;
    }

    public JComboBox getDrugsCombo() {
        return drugsCombo;
    }

    public void setDrugsCombo(JComboBox drugsCombo) {
        this.drugsCombo = drugsCombo;
    }

    public JTextField getEnteralVolumeOnKg() {
        return enteralVolumeOnKg;
    }

    public void setEnteralVolumeOnKg(JTextField enteralVolumeOnKg) {
        this.enteralVolumeOnKg = enteralVolumeOnKg;
    }

    public JTextField getEnteralVolumeOnWeight() {
        return enteralVolumeOnWeight;
    }

    public void setEnteralVolumeOnWeight(JTextField enteralVolumeOnWeight) {
        this.enteralVolumeOnWeight = enteralVolumeOnWeight;
    }

    public JTextField getSingleEntVolumeOnKg() {
        return singleEntVolumeOnKg;
    }

    public void setSingleEntVolumeOnKg(JTextField singleEntVolumeOnKg) {
        this.singleEntVolumeOnKg = singleEntVolumeOnKg;
    }

    public JTextField getAmountOfProteinOnKg() {
        return amountOfProteinOnKg;
    }

    public void setAmountOfProteinOnKg(JTextField amountOfProteinOnKg) {
        this.amountOfProteinOnKg = amountOfProteinOnKg;
    }

    public JTextField getAmountOfFatOnKg() {
        return amountOfFatOnKg;
    }

    public void setAmountOfFatOnKg(JTextField amountOfFatOnKg) {
        this.amountOfFatOnKg = amountOfFatOnKg;
    }

    public JTextField getAmountOfCarbohydratesOnKg() {
        return amountOfCarbohydratesOnKg;
    }

    public void setAmountOfCarbohydratesOnKg(JTextField amountOfCarbohydratesOnKg) {
        this.amountOfCarbohydratesOnKg = amountOfCarbohydratesOnKg;
    }

    public JTextField getEnergyCarbohydratesOnKg() {
        return energyCarbohydratesOnKg;
    }

    public void setEnergyCarbohydratesOnKg(JTextField energyCarbohydratesOnKg) {
        this.energyCarbohydratesOnKg = energyCarbohydratesOnKg;
    }

    public JTextField getEnergyFatsOnKg() {
        return energyFatsOnKg;
    }

    public void setEnergyFatsOnKg(JTextField energyFatsOnKg) {
        this.energyFatsOnKg = energyFatsOnKg;
    }

    public JTextField getTotalEnergySupplyOnKg() {
        return totalEnergySupplyOnKg;
    }

    public void setTotalEnergySupplyOnKg(JTextField totalEnergySupplyOnKg) {
        this.totalEnergySupplyOnKg = totalEnergySupplyOnKg;
    }

    public JTextField getSingleEntVolumeOnWeight() {
        return singleEntVolumeOnWeight;
    }

    public void setSingleEntVolumeOnWeight(JTextField singleEntVolumeOnWeight) {
        this.singleEntVolumeOnWeight = singleEntVolumeOnWeight;
    }

    public JTextField getAmountOfProteinOnWeight() {
        return amountOfProteinOnWeight;
    }

    public void setAmountOfProteinOnWeight(JTextField amountOfProteinOnWeight) {
        this.amountOfProteinOnWeight = amountOfProteinOnWeight;
    }

    public JTextField getAmountOfFatOnWeight() {
        return amountOfFatOnWeight;
    }

    public void setAmountOfFatOnWeight(JTextField amountOfFatOnWeight) {
        this.amountOfFatOnWeight = amountOfFatOnWeight;
    }

    public JTextField getAmountOfCarbohydratesOnWeight() {
        return amountOfCarbohydratesOnWeight;
    }

    public void setAmountOfCarbohydratesOnWeight(JTextField amountOfCarbohydratesOnWeight) {
        this.amountOfCarbohydratesOnWeight = amountOfCarbohydratesOnWeight;
    }

    public JTextField getEnergyCarbohydratesOnWeight() {
        return energyCarbohydratesOnWeight;
    }

    public void setEnergyCarbohydratesOnWeight(JTextField energyCarbohydratesOnWeight) {
        this.energyCarbohydratesOnWeight = energyCarbohydratesOnWeight;
    }

    public JTextField getEnergyFatsOnWeight() {
        return energyFatsOnWeight;
    }

    public void setEnergyFatsOnWeight(JTextField energyFatsOnWeight) {
        this.energyFatsOnWeight = energyFatsOnWeight;
    }

    public JTextField getTotalEnergySupplyOnWeight() {
        return totalEnergySupplyOnWeight;
    }

    public void setTotalEnergySupplyOnWeight(JTextField totalEnergySupplyOnWeight) {
        this.totalEnergySupplyOnWeight = totalEnergySupplyOnWeight;
    }

    public JTextField getTotalEnergyOnKg() {
        return totalEnergyOnKg;
    }

    public void setTotalEnergyOnKg(JTextField totalEnergyOnKg) {
        this.totalEnergyOnKg = totalEnergyOnKg;
    }

    public JTextField getTotalEnergyOnWeight() {
        return totalEnergyOnWeight;
    }

    public void setTotalEnergyOnWeight(JTextField totalEnergyOnWeight) {
        this.totalEnergyOnWeight = totalEnergyOnWeight;
    }

    public JPanel getParenteralNutritionTab() {
        return parenteralNutritionTab;
    }

    public void setParenteralNutritionTab(JPanel parenteralNutritionTab) {
        this.parenteralNutritionTab = parenteralNutritionTab;
    }

    public JTextField getDoseOfAminoAcidsOnKg() {
        return doseOfAminoAcidsOnKg;
    }

    public void setDoseOfAminoAcidsOnKg(JTextField doseOfAminoAcidsOnKg) {
        this.doseOfAminoAcidsOnKg = doseOfAminoAcidsOnKg;
    }

    public JTextField getDoseOfAminoAcidsOnWeight() {
        return doseOfAminoAcidsOnWeight;
    }

    public void setDoseOfAminoAcidsOnWeight(JTextField doseOfAminoAcidsOnWeight) {
        this.doseOfAminoAcidsOnWeight = doseOfAminoAcidsOnWeight;
    }

    public JTextField getDoseFatOnKg() {
        return doseFatOnKg;
    }

    public void setDoseFatOnKg(JTextField doseFatOnKg) {
        this.doseFatOnKg = doseFatOnKg;
    }

    public JTextField getRateOfGlucoseOnKg() {
        return rateOfGlucoseOnKg;
    }

    public void setRateOfGlucoseOnKg(JTextField rateOfGlucoseOnKg) {
        this.rateOfGlucoseOnKg = rateOfGlucoseOnKg;
    }

    public JTextField getDoseOfGlucoseOnKg() {
        return doseOfGlucoseOnKg;
    }

    public void setDoseOfGlucoseOnKg(JTextField doseOfGlucoseOnKg) {
        this.doseOfGlucoseOnKg = doseOfGlucoseOnKg;
    }

    public JTextField getAminovenOnKg() {
        return aminovenOnKg;
    }

    public void setAminovenOnKg(JTextField aminovenOnKg) {
        this.aminovenOnKg = aminovenOnKg;
    }

    public JTextField getEnergyCarbohydratesOnKgP() {
        return energyCarbohydratesOnKgP;
    }

    public void setEnergyCarbohydratesOnKgP(JTextField energyCarbohydratesOnKgP) {
        this.energyCarbohydratesOnKgP = energyCarbohydratesOnKgP;
    }

    public JTextField getEnergyFatsOnKgP() {
        return energyFatsOnKgP;
    }

    public void setEnergyFatsOnKgP(JTextField energyFatsOnKgP) {
        this.energyFatsOnKgP = energyFatsOnKgP;
    }

    public JTextField getTotalEnergySupplyOnKgP() {
        return totalEnergySupplyOnKgP;
    }

    public void setTotalEnergySupplyOnKgP(JTextField totalEnergySupplyOnKgP) {
        this.totalEnergySupplyOnKgP = totalEnergySupplyOnKgP;
    }

    public JTextField getDoseFatOnWeight() {
        return doseFatOnWeight;
    }

    public void setDoseFatOnWeight(JTextField doseFatOnWeight) {
        this.doseFatOnWeight = doseFatOnWeight;
    }

    public JTextField getRateOfGlucoseOnWeight() {
        return rateOfGlucoseOnWeight;
    }

    public void setRateOfGlucoseOnWeight(JTextField rateOfGlucoseOnWeight) {
        this.rateOfGlucoseOnWeight = rateOfGlucoseOnWeight;
    }

    public JTextField getDoseOfGlucoseOnWeight() {
        return doseOfGlucoseOnWeight;
    }

    public void setDoseOfGlucoseOnWeight(JTextField doseOfGlucoseOnWeight) {
        this.doseOfGlucoseOnWeight = doseOfGlucoseOnWeight;
    }

    public JTextField getAminovenOnWeight() {
        return aminovenOnWeight;
    }

    public void setAminovenOnWeight(JTextField aminovenOnWeight) {
        this.aminovenOnWeight = aminovenOnWeight;
    }

    public JTextField getEnergyCarbohydratesOnWeightP() {
        return energyCarbohydratesOnWeightP;
    }

    public void setEnergyCarbohydratesOnWeightP(JTextField energyCarbohydratesOnWeightP) {
        this.energyCarbohydratesOnWeightP = energyCarbohydratesOnWeightP;
    }

    public JTextField getEnergyFatsOnWeightP() {
        return energyFatsOnWeightP;
    }

    public void setEnergyFatsOnWeightP(JTextField energyFatsOnWeightP) {
        this.energyFatsOnWeightP = energyFatsOnWeightP;
    }

    public JTextField getTotalEnergySupplyOnWeightP() {
        return totalEnergySupplyOnWeightP;
    }

    public void setTotalEnergySupplyOnWeightP(JTextField totalEnergySupplyOnWeightP) {
        this.totalEnergySupplyOnWeightP = totalEnergySupplyOnWeightP;
    }

    public JTextField getTotalEnergyOnKgP() {
        return totalEnergyOnKgP;
    }

    public void setTotalEnergyOnKgP(JTextField totalEnergyOnKgP) {
        this.totalEnergyOnKgP = totalEnergyOnKgP;
    }

    public JTextField getTotalEnergyOnWeightP() {
        return totalEnergyOnWeightP;
    }

    public void setTotalEnergyOnWeightP(JTextField totalEnergyOnWeightP) {
        this.totalEnergyOnWeightP = totalEnergyOnWeightP;
    }

    public JTextField getFatEmulsionOnKg() {
        return fatEmulsionOnKg;
    }

    public void setFatEmulsionOnKg(JTextField fatEmulsionOnKg) {
        this.fatEmulsionOnKg = fatEmulsionOnKg;
    }

    public JTextField getGlucoseOnKg() {
        return glucoseOnKg;
    }

    public void setGlucoseOnKg(JTextField glucoseOnKg) {
        this.glucoseOnKg = glucoseOnKg;
    }

    public JTextField getFatEmulsionOnWeight() {
        return fatEmulsionOnWeight;
    }

    public void setFatEmulsionOnWeight(JTextField fatEmulsionOnWeight) {
        this.fatEmulsionOnWeight = fatEmulsionOnWeight;
    }

    public JTextField getGlucoseOnWeight() {
        return glucoseOnWeight;
    }

    public void setGlucoseOnWeight(JTextField glucoseOnWeight) {
        this.glucoseOnWeight = glucoseOnWeight;
    }

    public JPanel getProgramPPTab() {
        return programPPTab;
    }

    public void setProgramPPTab(JPanel programPPTab) {
        this.programPPTab = programPPTab;
    }

    public JTextField getWaterForFarming() {
        return waterForFarming;
    }

    public void setWaterForFarming(JTextField waterForFarming) {
        this.waterForFarming = waterForFarming;
    }

    public JTextField getAminoven() {
        return aminoven;
    }

    public void setAminoven(JTextField aminoven) {
        this.aminoven = aminoven;
    }

    public JTextField getDryMass() {
        return dryMass;
    }

    public void setDryMass(JTextField dryMass) {
        this.dryMass = dryMass;
    }

    public JTextField getGlucose() {
        return glucose;
    }

    public void setGlucose(JTextField glucose) {
        this.glucose = glucose;
    }

    public JTextField getConcentration() {
        return concentration;
    }

    public void setConcentration(JTextField concentration) {
        this.concentration = concentration;
    }

    public JTextField getKCl4() {
        return KCl4;
    }

    public void setKCl4(JTextField KCl4) {
        this.KCl4 = KCl4;
    }

    public JTextField getGluconateCa() {
        return gluconateCa;
    }

    public void setGluconateCa(JTextField gluconateCa) {
        this.gluconateCa = gluconateCa;
    }

    public JTextField getNaCl10() {
        return NaCl10;
    }

    public void setNaCl10(JTextField naCl10) {
        NaCl10 = naCl10;
    }

    public JTextField getNaCl09() {
        return NaCl09;
    }

    public void setNaCl09(JTextField naCl09) {
        NaCl09 = naCl09;
    }

    public JTextField getMgSO4() {
        return MgSO4;
    }

    public void setMgSO4(JTextField mgSO4) {
        MgSO4 = mgSO4;
    }

    public JTextField getTotalPr() {
        return totalPr;
    }

    public void setTotalPr(JTextField totalPr) {
        this.totalPr = totalPr;
    }

    public JTextField getIntroductionOfTheBasicSolution() {
        return introductionOfTheBasicSolution;
    }

    public void setIntroductionOfTheBasicSolution(JTextField introductionOfTheBasicSolution) {
        this.introductionOfTheBasicSolution = introductionOfTheBasicSolution;
    }

    public JTextField getRateOfIntroductionOfTheBasicSolution() {
        return rateOfIntroductionOfTheBasicSolution;
    }

    public void setRateOfIntroductionOfTheBasicSolution(JTextField rateOfIntroductionOfTheBasicSolution) {
        this.rateOfIntroductionOfTheBasicSolution = rateOfIntroductionOfTheBasicSolution;
    }

    public JTextField getAmountGE() {
        return amountGE;
    }

    public void setAmountGE(JTextField amountGE) {
        this.amountGE = amountGE;
    }

    public JTextField getIntroductionGE() {
        return introductionGE;
    }

    public void setIntroductionGE(JTextField introductionGE) {
        this.introductionGE = introductionGE;
    }

    public JTextField getRateOfIntroductionGE() {
        return rateOfIntroductionGE;
    }

    public void setRateOfIntroductionGE(JTextField rateOfIntroductionGE) {
        this.rateOfIntroductionGE = rateOfIntroductionGE;
    }

    public JTextField getAmountOfTherapeuticDrugs() {
        return amountOfTherapeuticDrugs;
    }

    public void setAmountOfTherapeuticDrugs(JTextField amountOfTherapeuticDrugs) {
        this.amountOfTherapeuticDrugs = amountOfTherapeuticDrugs;
    }

    public JTextField getDoseKCLOnKg() {
        return doseKCLOnKg;
    }

    public void setDoseKCLOnKg(JTextField doseKCLOnKg) {
        this.doseKCLOnKg = doseKCLOnKg;
    }

    public JTextField getDoseKCLOnWeight() {
        return doseKCLOnWeight;
    }

    public void setDoseKCLOnWeight(JTextField doseKCLOnWeight) {
        this.doseKCLOnWeight = doseKCLOnWeight;
    }

    public JTextField getDoseGluconateCaOnKg() {
        return doseGluconateCaOnKg;
    }

    public void setDoseGluconateCaOnKg(JTextField doseGluconateCaOnKg) {
        this.doseGluconateCaOnKg = doseGluconateCaOnKg;
    }

    public JTextField getDoseNaCl10OnKg() {
        return doseNaCl10OnKg;
    }

    public void setDoseNaCl10OnKg(JTextField doseNaCl10OnKg) {
        this.doseNaCl10OnKg = doseNaCl10OnKg;
    }

    public JTextField getDoseGluconateCaOnWeight() {
        return doseGluconateCaOnWeight;
    }

    public void setDoseGluconateCaOnWeight(JTextField doseGluconateCaOnWeight) {
        this.doseGluconateCaOnWeight = doseGluconateCaOnWeight;
    }

    public JTextField getDoseNaCl10OnWeight() {
        return doseNaCl10OnWeight;
    }

    public void setDoseNaCl10OnWeight(JTextField doseNaCl10OnWeight) {
        this.doseNaCl10OnWeight = doseNaCl10OnWeight;
    }

    public JTextField getDoseNaCl09OnKg() {
        return doseNaCl09OnKg;
    }

    public void setDoseNaCl09OnKg(JTextField doseNaCl09OnKg) {
        this.doseNaCl09OnKg = doseNaCl09OnKg;
    }

    public JTextField getDoseNaCl09OnWeight() {
        return doseNaCl09OnWeight;
    }

    public void setDoseNaCl09OnWeight(JTextField doseNaCl09OnWeight) {
        this.doseNaCl09OnWeight = doseNaCl09OnWeight;
    }

    public JTextField getDoseMgSO4OnKg() {
        return doseMgSO4OnKg;
    }

    public void setDoseMgSO4OnKg(JTextField doseMgSO4OnKg) {
        this.doseMgSO4OnKg = doseMgSO4OnKg;
    }

    public JTextField getDoseMgSO4OnWeight() {
        return doseMgSO4OnWeight;
    }

    public void setDoseMgSO4OnWeight(JTextField doseMgSO4OnWeight) {
        this.doseMgSO4OnWeight = doseMgSO4OnWeight;
    }

    public JPanel getGeneralBalanceTab() {
        return generalBalanceTab;
    }

    public void setGeneralBalanceTab(JPanel generalBalanceTab) {
        this.generalBalanceTab = generalBalanceTab;
    }

    public JTextField getTotalVolumeOfLiquid() {
        return totalVolumeOfLiquid;
    }

    public void setTotalVolumeOfLiquid(JTextField totalVolumeOfLiquid) {
        this.totalVolumeOfLiquid = totalVolumeOfLiquid;
    }

    public JTextField getEnteralVolume() {
        return enteralVolume;
    }

    public void setEnteralVolume(JTextField enteralVolume) {
        this.enteralVolume = enteralVolume;
    }

    public JTextField getVolumeParenteralInfusion() {
        return volumeParenteralInfusion;
    }

    public void setVolumeParenteralInfusion(JTextField volumeParenteralInfusion) {
        this.volumeParenteralInfusion = volumeParenteralInfusion;
    }

    public JTextField getAmountOfDrugs() {
        return amountOfDrugs;
    }

    public void setAmountOfDrugs(JTextField amountOfDrugs) {
        this.amountOfDrugs = amountOfDrugs;
    }

    public JTextField getVolumeOfWaterForBreeding() {
        return volumeOfWaterForBreeding;
    }

    public void setVolumeOfWaterForBreeding(JTextField volumeOfWaterForBreeding) {
        this.volumeOfWaterForBreeding = volumeOfWaterForBreeding;
    }

    public JTextField getAmountOfProteinOnKgG() {
        return amountOfProteinOnKgG;
    }

    public void setAmountOfProteinOnKgG(JTextField amountOfProteinOnKgG) {
        this.amountOfProteinOnKgG = amountOfProteinOnKgG;
    }

    public JTextField getAmountOfProteinOnWeightG() {
        return amountOfProteinOnWeightG;
    }

    public void setAmountOfProteinOnWeightG(JTextField amountOfProteinOnWeightG) {
        this.amountOfProteinOnWeightG = amountOfProteinOnWeightG;
    }

    public JTextField getAmountOfFatOnKgG() {
        return amountOfFatOnKgG;
    }

    public void setAmountOfFatOnKgG(JTextField amountOfFatOnKgG) {
        this.amountOfFatOnKgG = amountOfFatOnKgG;
    }

    public JTextField getAmountOfCarbohydratesOnKgG() {
        return amountOfCarbohydratesOnKgG;
    }

    public void setAmountOfCarbohydratesOnKgG(JTextField amountOfCarbohydratesOnKgG) {
        this.amountOfCarbohydratesOnKgG = amountOfCarbohydratesOnKgG;
    }

    public JTextField getEnergyCarbohydratesOnKgG() {
        return energyCarbohydratesOnKgG;
    }

    public void setEnergyCarbohydratesOnKgG(JTextField energyCarbohydratesOnKgG) {
        this.energyCarbohydratesOnKgG = energyCarbohydratesOnKgG;
    }

    public JTextField getEnergyFatsOnKgG() {
        return energyFatsOnKgG;
    }

    public void setEnergyFatsOnKgG(JTextField energyFatsOnKgG) {
        this.energyFatsOnKgG = energyFatsOnKgG;
    }

    public JTextField getTotalEnergySupplyOnKgG() {
        return totalEnergySupplyOnKgG;
    }

    public void setTotalEnergySupplyOnKgG(JTextField totalEnergySupplyOnKgG) {
        this.totalEnergySupplyOnKgG = totalEnergySupplyOnKgG;
    }

    public JTextField getTotalEnergyOnKgG() {
        return totalEnergyOnKgG;
    }

    public void setTotalEnergyOnKgG(JTextField totalEnergyOnKgG) {
        this.totalEnergyOnKgG = totalEnergyOnKgG;
    }

    public JTextField getAmountOfFatOnWeightG() {
        return amountOfFatOnWeightG;
    }

    public void setAmountOfFatOnWeightG(JTextField amountOfFatOnWeightG) {
        this.amountOfFatOnWeightG = amountOfFatOnWeightG;
    }

    public JTextField getAmountOfCarbohydratesOnWeightG() {
        return amountOfCarbohydratesOnWeightG;
    }

    public void setAmountOfCarbohydratesOnWeightG(JTextField amountOfCarbohydratesOnWeightG) {
        this.amountOfCarbohydratesOnWeightG = amountOfCarbohydratesOnWeightG;
    }

    public JTextField getEnergyCarbohydratesOnWeightG() {
        return energyCarbohydratesOnWeightG;
    }

    public void setEnergyCarbohydratesOnWeightG(JTextField energyCarbohydratesOnWeightG) {
        this.energyCarbohydratesOnWeightG = energyCarbohydratesOnWeightG;
    }

    public JTextField getEnergyFatsOnWeightG() {
        return energyFatsOnWeightG;
    }

    public void setEnergyFatsOnWeightG(JTextField energyFatsOnWeightG) {
        this.energyFatsOnWeightG = energyFatsOnWeightG;
    }

    public JTextField getTotalEnergySupplyOnWeightG() {
        return totalEnergySupplyOnWeightG;
    }

    public void setTotalEnergySupplyOnWeightG(JTextField totalEnergySupplyOnWeightG) {
        this.totalEnergySupplyOnWeightG = totalEnergySupplyOnWeightG;
    }

    public JTextField getTotalEnergyOnWeightG() {
        return totalEnergyOnWeightG;
    }

    public void setTotalEnergyOnWeightG(JTextField totalEnergyOnWeightG) {
        this.totalEnergyOnWeightG = totalEnergyOnWeightG;
    }

    public JButton getPrintButton() {
        return printButton;
    }

    public void setPrintButton(JButton printButton) {
        this.printButton = printButton;
    }

    public JButton getNewCalculationButton() {
        return newCalculationButton;
    }

    public void setNewCalculationButton(JButton newCalculationButton) {
        this.newCalculationButton = newCalculationButton;
    }

    public JLabel getWeightLable() {
        return weightLable;
    }

    public void setWeightLable(JLabel weightLable) {
        this.weightLable = weightLable;
    }

    public JTextField getWeightBaby() {
        return weightBaby;
    }

    public void setWeightBaby(JTextField weightBaby) {
        this.weightBaby = weightBaby;
    }
}
