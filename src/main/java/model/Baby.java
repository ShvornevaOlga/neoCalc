package model;

import java.io.*;
import java.util.Properties;

public class Baby {
    private double weightBaby;
    private double gestationalAge;
    private double dayOfLife;
    //***************************
    private double aminoAcidsKg;
    private double aminoAcidsOnWeight;

    private double fatsOnKg;
    private double fatsOnWeight;

    private double carbohydratesOnKg;
    private double carbohydratesOnWeight;

    private double volumeOfFluidOnKg;
    private double volumeOfFluidOnWeight;

    private double sodiumOnKg;
    private double sodiumOnWeight;

    private double potassiumOnKg;
    private double potassiumOnWeight;

    private double calciumOnKg;
    private double calciumOnWeight;

    private double magnesiumOnKg;
    private double magnesiumOnWeight;

    //------------------------------------------------------------------------

    private double numberOfFeedings;

    private double enteralVolumeOnKg;
    private double enteralVolumeOnWeight;

    private double singleEntVolumeOnKg;
    private double singleEntVolumeOnWeight;

    private double amountOfProteinOnKg;
    private double amountOfProteinOnWeight;

    private double amountOfFatOnKg;
    private double amountOfFatOnWeight;

    private double amountOfCarbohydratesOnKg;
    private double amountOfCarbohydratesOnWeight;

    private double energyCarbohydratesOnKg;
    private double energyCarbohydratesOnWeight;

    private double energyFatsOnKg;
    private double energyFatsOnWeight;

    private double totalEnergySupplyOnKg;
    private double totalEnergySupplyOnWeight;

    private double totalEnergyOnKg;
    private double totalEnergyOnWeight;

    //**************************************************************************************************
    private double doseOfAminoAcidsOnKg;
    private double doseOfAminoAcidsOnWeight;

    private double doseFatOnKg;
    private double doseFatOnWeight;

    private double rateOfGlucoseOnKg;
    private double rateOfGlucoseOnWeight;

    private double doseOfGlucoseOnKg;
    private double doseOfGlucoseOnWeight;

    private double aminovenOnKg;
    private double aminovenOnWeight;

    private double fatEmulsionOnKg;
    private double fatEmulsionOnWeight;

    private double glucoseOnKg;
    private double glucoseOnWeight;

    private double energyCarbohydratesOnKgP;
    private double energyCarbohydratesOnWeightP;

    private double energyFatsOnKgP;
    private double energyFatsOnWeightP;

    private double totalEnergySupplyOnKgP;
    private double totalEnergySupplyOnWeightP;

    private double totalEnergyOnKgP;
    private double totalEnergyOnWeightP;

    //***************************************************************************
    private double doseKCLOnKg;
    private double doseKCLOnWeight;

    private double doseGluconateCaOnKg;
    private double doseGluconateCaOnWeight;

    private double doseNaCl10OnKg;
    private double doseNaCl10OnWeight;

    private double doseNaCl09OnKg;
    private double doseNaCl09OnWeight;

    private double doseMgSO4OnKg;
    private double doseMgSO4OnWeight;

    private double waterForFarming;
    private double aminoven;
    private double glucose;
    private double KCl4;
    private double gluconateCa;
    private double NaCl10;
    private double NaCl09;
    private double MgSO4;
    private double totalPr;

    private double dryMass;
    private double concentration;
    private double introductionOfTheBasicSolution;
    private double rateOfIntroductionOfTheBasicSolution;
    private double amountGE;
    private double introductionGE;
    private double rateOfIntroductionGE;
    private double amountOfTherapeuticDrugs;

    //****************************************************************************

    private double amountOfProteinOnKgG;
    private double amountOfProteinOnWeightG;

    private double amountOfFatOnKgG;
    private double amountOfFatOnWeightG;

    private double amountOfCarbohydratesOnKgG;
    private double amountOfCarbohydratesOnWeightG;

    private double energyCarbohydratesOnKgG;
    private double energyCarbohydratesOnWeightG;

    private double energyFatsOnKgG;
    private double energyFatsOnWeightG;

    private double totalEnergySupplyOnKgG;
    private double totalEnergySupplyOnWeightG;

    private double totalEnergyOnKgG;
    private double totalEnergyOnWeightG;

    private double totalVolumeOfLiquid;
    private double volumeParenteralInfusion;

    private double enteralVolume;
    private double amountOfDrugs;

    private double volumeOfWaterForBreeding;

    //******************************************************************************************************************
    private Drugs drugs;
    private final double kKalCarbohydrates = 3.4;
    private final double kKalFats = 9;

    //*****************************************************************************************************************

    public Drugs getDrugs() {
        return drugs;
    }

    public double getWeightBaby() {
        return weightBaby;
    }

    public void setWeightBaby(double weightBaby) {
        this.weightBaby = weightBaby;
    }

    public double getDayOfLife() {
        return dayOfLife;
    }

    public void setDayOfLife(double dayOfLife) {
        this.dayOfLife = dayOfLife;
    }

    public double getAminoAcidsKg() {
        return aminoAcidsKg;
    }

    public void setAminoAcidsKg(double aminoAcidsKg) {
        this.aminoAcidsKg = aminoAcidsKg;
    }

    public double getAminoAcidsOnWeight() {
        return aminoAcidsOnWeight;
    }

    public void setAminoAcidsOnWeight(double aminoAcidsOnWeight) {
        this.aminoAcidsOnWeight = aminoAcidsOnWeight;
    }

    public double getFatsOnKg() {
        return fatsOnKg;
    }

    public void setFatsOnKg(double fatsOnKg) {
        this.fatsOnKg = fatsOnKg;
    }

    public double getCarbohydratesOnKg() {
        return carbohydratesOnKg;
    }

    public void setCarbohydratesOnKg(double carbohydratesOnKg) {
        this.carbohydratesOnKg = carbohydratesOnKg;
    }

    public double getVolumeOfFluidOnKg() {
        return volumeOfFluidOnKg;
    }

    public void setVolumeOfFluidOnKg(double volumeOfFluidOnKg) {
        this.volumeOfFluidOnKg = volumeOfFluidOnKg;
    }

    public double getSodiumOnKg() {
        return sodiumOnKg;
    }

    public void setSodiumOnKg(double sodiumOnKg) {
        this.sodiumOnKg = sodiumOnKg;
    }

    public double getPotassiumOnKg() {
        return potassiumOnKg;
    }

    public void setPotassiumOnKg(double potassiumOnKg) {
        this.potassiumOnKg = potassiumOnKg;
    }

    public double getCalciumOnKg() {
        return calciumOnKg;
    }

    public void setCalciumOnKg(double calciumOnKg) {
        this.calciumOnKg = calciumOnKg;
    }

    public double getMagnesiumOnKg() {
        return magnesiumOnKg;
    }

    public void setMagnesiumOnKg(double magnesiumOnKg) {
        this.magnesiumOnKg = magnesiumOnKg;
    }

    public double getFatsOnWeight() {
        return fatsOnWeight;
    }

    public void setFatsOnWeight(double fatsOnWeight) {
        this.fatsOnWeight = fatsOnWeight;
    }

    public double getCarbohydratesOnWeight() {
        return carbohydratesOnWeight;
    }

    public void setCarbohydratesOnWeight(double carbohydratesOnWeight) {
        this.carbohydratesOnWeight = carbohydratesOnWeight;
    }

    public double getVolumeOfFluidOnWeight() {
        return volumeOfFluidOnWeight;
    }

    public void setVolumeOfFluidOnWeight(double volumeOfFluidOnWeight) {
        this.volumeOfFluidOnWeight = volumeOfFluidOnWeight;
    }

    public double getSodiumOnWeight() {
        return sodiumOnWeight;
    }

    public void setSodiumOnWeight(double sodiumOnWeight) {
        this.sodiumOnWeight = sodiumOnWeight;
    }

    public double getPotassiumOnWeight() {
        return potassiumOnWeight;
    }

    public void setPotassiumOnWeight(double potassiumOnWeight) {
        this.potassiumOnWeight = potassiumOnWeight;
    }

    public double getCalciumOnWeight() {
        return calciumOnWeight;
    }

    public void setCalciumOnWeight(double calciumOnWeight) {
        this.calciumOnWeight = calciumOnWeight;
    }

    public double getMagnesiumOnWeight() {
        return magnesiumOnWeight;
    }

    public void setMagnesiumOnWeight(double magnesiumOnWeight) {
        this.magnesiumOnWeight = magnesiumOnWeight;
    }

    public double getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(double gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public double getNumberOfFeedings() {
        return numberOfFeedings;
    }

    public void setNumberOfFeedings(double numberOfFeedings) {
        this.numberOfFeedings = numberOfFeedings;
    }

    public double getTotalEnergyOnKg() {
        return totalEnergyOnKg;
    }

    public void setTotalEnergyOnKg(double totalEnergyOnKg) {
        this.totalEnergyOnKg = totalEnergyOnKg;
    }

    public double getTotalEnergyOnWeight() {
        return totalEnergyOnWeight;
    }

    public void setTotalEnergyOnWeight(double totalEnergyOnWeight) {
        this.totalEnergyOnWeight = totalEnergyOnWeight;
    }

    public double getEnteralVolumeOnKg() {
        return enteralVolumeOnKg;
    }

    public void setEnteralVolumeOnKg(double enteralVolumeOnKg) {
        this.enteralVolumeOnKg = enteralVolumeOnKg;
    }

    public double getEnteralVolumeOnWeight() {
        return enteralVolumeOnWeight;
    }

    public void setEnteralVolumeOnWeight(double enteralVolumeOnWeight) {
        this.enteralVolumeOnWeight = enteralVolumeOnWeight;
    }

    public double getSingleEntVolumeOnKg() {
        return singleEntVolumeOnKg;
    }

    public void setSingleEntVolumeOnKg(double singleEntVolumeOnKg) {
        this.singleEntVolumeOnKg = singleEntVolumeOnKg;
    }

    public double getSingleEntVolumeOnWeight() {
        return singleEntVolumeOnWeight;
    }

    public void setSingleEntVolumeOnWeight(double singleEntVolumeOnWeight) {
        this.singleEntVolumeOnWeight = singleEntVolumeOnWeight;
    }

    public double getAmountOfProteinOnKg() {
        return amountOfProteinOnKg;
    }

    public void setAmountOfProteinOnKg(double amountOfProteinOnKg) {
        this.amountOfProteinOnKg = amountOfProteinOnKg;
    }

    public double getAmountOfProteinOnWeight() {
        return amountOfProteinOnWeight;
    }

    public void setAmountOfProteinOnWeight(double amountOfProteinOnWeight) {
        this.amountOfProteinOnWeight = amountOfProteinOnWeight;
    }

    public double getAmountOfFatOnKg() {
        return amountOfFatOnKg;
    }

    public void setAmountOfFatOnKg(double amountOfFatOnKg) {
        this.amountOfFatOnKg = amountOfFatOnKg;
    }

    public double getAmountOfFatOnWeight() {
        return amountOfFatOnWeight;
    }

    public void setAmountOfFatOnWeight(double amountOfFatOnWeight) {
        this.amountOfFatOnWeight = amountOfFatOnWeight;
    }

    public double getAmountOfCarbohydratesOnKg() {
        return amountOfCarbohydratesOnKg;
    }

    public void setAmountOfCarbohydratesOnKg(double amountOfCarbohydratesOnKg) {
        this.amountOfCarbohydratesOnKg = amountOfCarbohydratesOnKg;
    }

    public double getAmountOfCarbohydratesOnWeight() {
        return amountOfCarbohydratesOnWeight;
    }

    public void setAmountOfCarbohydratesOnWeight(double amountOfCarbohydratesOnWeight) {
        this.amountOfCarbohydratesOnWeight = amountOfCarbohydratesOnWeight;
    }

    public double getEnergyCarbohydratesOnKg() {
        return energyCarbohydratesOnKg;
    }

    public void setEnergyCarbohydratesOnKg(double energyCarbohydratesOnKg) {
        this.energyCarbohydratesOnKg = energyCarbohydratesOnKg;
    }

    public double getEnergyCarbohydratesOnWeight() {
        return energyCarbohydratesOnWeight;
    }

    public void setEnergyCarbohydratesOnWeight(double energyCarbohydratesOnWeight) {
        this.energyCarbohydratesOnWeight = energyCarbohydratesOnWeight;
    }

    public double getEnergyFatsOnKg() {
        return energyFatsOnKg;
    }

    public void setEnergyFatsOnKg(double energyFatsOnKg) {
        this.energyFatsOnKg = energyFatsOnKg;
    }

    public double getEnergyFatsOnWeight() {
        return energyFatsOnWeight;
    }

    public void setEnergyFatsOnWeight(double energyFatsOnWeight) {
        this.energyFatsOnWeight = energyFatsOnWeight;
    }

    public double getTotalEnergySupplyOnKg() {
        return totalEnergySupplyOnKg;
    }

    public void setTotalEnergySupplyOnKg(double totalEnergySupplyOnKg) {
        this.totalEnergySupplyOnKg = totalEnergySupplyOnKg;
    }

    public double getTotalEnergySupplyOnWeight() {
        return totalEnergySupplyOnWeight;
    }

    public void setTotalEnergySupplyOnWeight(double totalEnergySupplyOnWeight) {
        this.totalEnergySupplyOnWeight = totalEnergySupplyOnWeight;
    }

    public double getFatEmulsionOnKg() {
        return fatEmulsionOnKg;
    }

    public void setFatEmulsionOnKg(double fatEmulsionOnKg) {
        this.fatEmulsionOnKg = fatEmulsionOnKg;
    }

    public double getGlucoseOnKg() {
        return glucoseOnKg;
    }

    public void setGlucoseOnKg(double glucoseOnKg) {
        this.glucoseOnKg = glucoseOnKg;
    }

    public double getFatEmulsionOnWeight() {
        return fatEmulsionOnWeight;
    }

    public void setFatEmulsionOnWeight(double fatEmulsionOnWeight) {
        this.fatEmulsionOnWeight = fatEmulsionOnWeight;
    }

    public double getGlucoseOnWeight() {
        return glucoseOnWeight;
    }

    public void setGlucoseOnWeight(double glucoseOnWeight) {
        this.glucoseOnWeight = glucoseOnWeight;
    }

    public double getDoseOfAminoAcidsOnKg() {
        return doseOfAminoAcidsOnKg;
    }

    public void setDoseOfAminoAcidsOnKg(double doseOfAminoAcidsOnKg) {
        this.doseOfAminoAcidsOnKg = doseOfAminoAcidsOnKg;
    }

    public double getDoseOfAminoAcidsOnWeight() {
        return doseOfAminoAcidsOnWeight;
    }

    public void setDoseOfAminoAcidsOnWeight(double doseOfAminoAcidsOnWeight) {
        this.doseOfAminoAcidsOnWeight = doseOfAminoAcidsOnWeight;
    }

    public double getDoseFatOnKg() {
        return doseFatOnKg;
    }

    public void setDoseFatOnKg(double doseFatOnKg) {
        this.doseFatOnKg = doseFatOnKg;
    }

    public double getDoseFatOnWeight() {
        return doseFatOnWeight;
    }

    public void setDoseFatOnWeight(double doseFatOnWeight) {
        this.doseFatOnWeight = doseFatOnWeight;
    }

    public double getRateOfGlucoseOnKg() {
        return rateOfGlucoseOnKg;
    }

    public void setRateOfGlucoseOnKg(double rateOfGlucoseOnKg) {
        this.rateOfGlucoseOnKg = rateOfGlucoseOnKg;
    }

    public double getRateOfGlucoseOnWeight() {
        return rateOfGlucoseOnWeight;
    }

    public void setRateOfGlucoseOnWeight(double rateOfGlucoseOnWeight) {
        this.rateOfGlucoseOnWeight = rateOfGlucoseOnWeight;
    }

    public double getDoseOfGlucoseOnKg() {
        return doseOfGlucoseOnKg;
    }

    public void setDoseOfGlucoseOnKg(double doseOfGlucoseOnKg) {
        this.doseOfGlucoseOnKg = doseOfGlucoseOnKg;
    }

    public double getDoseOfGlucoseOnWeight() {
        return doseOfGlucoseOnWeight;
    }

    public void setDoseOfGlucoseOnWeight(double doseOfGlucoseOnWeight) {
        this.doseOfGlucoseOnWeight = doseOfGlucoseOnWeight;
    }

    public double getAminovenOnKg() {
        return aminovenOnKg;
    }

    public void setAminovenOnKg(double aminovenOnKg) {
        this.aminovenOnKg = aminovenOnKg;
    }

    public double getAminovenOnWeight() {
        return aminovenOnWeight;
    }

    public void setAminovenOnWeight(double aminovenOnWeight) {
        this.aminovenOnWeight = aminovenOnWeight;
    }

    public double getEnergyCarbohydratesOnKgP() {
        return energyCarbohydratesOnKgP;
    }

    public void setEnergyCarbohydratesOnKgP(double energyCarbohydratesOnKgP) {
        this.energyCarbohydratesOnKgP = energyCarbohydratesOnKgP;
    }

    public double getEnergyCarbohydratesOnWeightP() {
        return energyCarbohydratesOnWeightP;
    }

    public void setEnergyCarbohydratesOnWeightP(double energyCarbohydratesOnWeightP) {
        this.energyCarbohydratesOnWeightP = energyCarbohydratesOnWeightP;
    }

    public double getEnergyFatsOnKgP() {
        return energyFatsOnKgP;
    }

    public void setEnergyFatsOnKgP(double energyFatsOnKgP) {
        this.energyFatsOnKgP = energyFatsOnKgP;
    }

    public double getEnergyFatsOnWeightP() {
        return energyFatsOnWeightP;
    }

    public void setEnergyFatsOnWeightP(double energyFatsOnWeightP) {
        this.energyFatsOnWeightP = energyFatsOnWeightP;
    }

    public double getTotalEnergySupplyOnKgP() {
        return totalEnergySupplyOnKgP;
    }

    public void setTotalEnergySupplyOnKgP(double totalEnergySupplyOnKgP) {
        this.totalEnergySupplyOnKgP = totalEnergySupplyOnKgP;
    }

    public double getTotalEnergySupplyOnWeightP() {
        return totalEnergySupplyOnWeightP;
    }

    public void setTotalEnergySupplyOnWeightP(double totalEnergySupplyOnWeightP) {
        this.totalEnergySupplyOnWeightP = totalEnergySupplyOnWeightP;
    }

    public double getTotalEnergyOnKgP() {
        return totalEnergyOnKgP;
    }

    public void setTotalEnergyOnKgP(double totalEnergyOnKgP) {
        this.totalEnergyOnKgP = totalEnergyOnKgP;
    }

    public double getTotalEnergyOnWeightP() {
        return totalEnergyOnWeightP;
    }

    public void setTotalEnergyOnWeightP(double totalEnergyOnWeightP) {
        this.totalEnergyOnWeightP = totalEnergyOnWeightP;
    }

    public double getAmountOfProteinOnKgG() {
        return amountOfProteinOnKgG;
    }

    public void setAmountOfProteinOnKgG(double amountOfProteinOnKgG) {
        this.amountOfProteinOnKgG = amountOfProteinOnKgG;
    }

    public double getAmountOfProteinOnWeightG() {
        return amountOfProteinOnWeightG;
    }

    public void setAmountOfProteinOnWeightG(double amountOfProteinOnWeightG) {
        this.amountOfProteinOnWeightG = amountOfProteinOnWeightG;
    }

    public double getAmountOfFatOnKgG() {
        return amountOfFatOnKgG;
    }

    public void setAmountOfFatOnKgG(double amountOfFatOnKgG) {
        this.amountOfFatOnKgG = amountOfFatOnKgG;
    }

    public double getAmountOfFatOnWeightG() {
        return amountOfFatOnWeightG;
    }

    public void setAmountOfFatOnWeightG(double amountOfFatOnWeightG) {
        this.amountOfFatOnWeightG = amountOfFatOnWeightG;
    }

    public double getAmountOfCarbohydratesOnKgG() {
        return amountOfCarbohydratesOnKgG;
    }

    public void setAmountOfCarbohydratesOnKgG(double amountOfCarbohydratesOnKgG) {
        this.amountOfCarbohydratesOnKgG = amountOfCarbohydratesOnKgG;
    }

    public double getAmountOfCarbohydratesOnWeightG() {
        return amountOfCarbohydratesOnWeightG;
    }

    public void setAmountOfCarbohydratesOnWeightG(double amountOfCarbohydratesOnWeightG) {
        this.amountOfCarbohydratesOnWeightG = amountOfCarbohydratesOnWeightG;
    }

    public double getEnergyCarbohydratesOnKgG() {
        return energyCarbohydratesOnKgG;
    }

    public void setEnergyCarbohydratesOnKgG(double energyCarbohydratesOnKgG) {
        this.energyCarbohydratesOnKgG = energyCarbohydratesOnKgG;
    }

    public double getEnergyCarbohydratesOnWeightG() {
        return energyCarbohydratesOnWeightG;
    }

    public void setEnergyCarbohydratesOnWeightG(double energyCarbohydratesOnWeightG) {
        this.energyCarbohydratesOnWeightG = energyCarbohydratesOnWeightG;
    }

    public double getEnergyFatsOnKgG() {
        return energyFatsOnKgG;
    }

    public void setEnergyFatsOnKgG(double energyFatsOnKgG) {
        this.energyFatsOnKgG = energyFatsOnKgG;
    }

    public double getEnergyFatsOnWeightG() {
        return energyFatsOnWeightG;
    }

    public void setEnergyFatsOnWeightG(double energyFatsOnWeightG) {
        this.energyFatsOnWeightG = energyFatsOnWeightG;
    }

    public double getTotalEnergySupplyOnKgG() {
        return totalEnergySupplyOnKgG;
    }

    public void setTotalEnergySupplyOnKgG(double totalEnergySupplyOnKgG) {
        this.totalEnergySupplyOnKgG = totalEnergySupplyOnKgG;
    }

    public double getTotalEnergySupplyOnWeightG() {
        return totalEnergySupplyOnWeightG;
    }

    public void setTotalEnergySupplyOnWeightG(double totalEnergySupplyOnWeightG) {
        this.totalEnergySupplyOnWeightG = totalEnergySupplyOnWeightG;
    }

    public double getTotalEnergyOnKgG() {
        return totalEnergyOnKgG;
    }

    public void setTotalEnergyOnKgG(double totalEnergyOnKgG) {
        this.totalEnergyOnKgG = totalEnergyOnKgG;
    }

    public double getTotalEnergyOnWeightG() {
        return totalEnergyOnWeightG;
    }

    public void setTotalEnergyOnWeightG(double totalEnergyOnWeightG) {
        this.totalEnergyOnWeightG = totalEnergyOnWeightG;
    }

    public double getTotalVolumeOfLiquid() {
        return totalVolumeOfLiquid;
    }

    public void setTotalVolumeOfLiquid(double totalVolumeOfLiquid) {
        this.totalVolumeOfLiquid = totalVolumeOfLiquid;
    }

    public double getVolumeParenteralInfusion() {
        return volumeParenteralInfusion;
    }

    public void setVolumeParenteralInfusion(double volumeParenteralInfusion) {
        this.volumeParenteralInfusion = volumeParenteralInfusion;
    }

    public double getEnteralVolume() {
        return enteralVolume;
    }

    public void setEnteralVolume(double enteralVolume) {
        this.enteralVolume = enteralVolume;
    }

    public double getAmountOfDrugs() {
        return amountOfDrugs;
    }

    public void setAmountOfDrugs(double amountOfDrugs) {
        this.amountOfDrugs = amountOfDrugs;
    }

    public double getDoseKCLOnKg() {
        return doseKCLOnKg;
    }

    public void setDoseKCLOnKg(double doseKCLOnKg) {
        this.doseKCLOnKg = doseKCLOnKg;
    }

    public double getDoseKCLOnWeight() {
        return doseKCLOnWeight;
    }

    public void setDoseKCLOnWeight(double doseKCLOnWeight) {
        this.doseKCLOnWeight = doseKCLOnWeight;
    }

    public double getDoseGluconateCaOnKg() {
        return doseGluconateCaOnKg;
    }

    public void setDoseGluconateCaOnKg(double doseGluconateCaOnKg) {
        this.doseGluconateCaOnKg = doseGluconateCaOnKg;
    }

    public double getDoseGluconateCaOnWeight() {
        return doseGluconateCaOnWeight;
    }

    public void setDoseGluconateCaOnWeight(double doseGluconateCaOnWeight) {
        this.doseGluconateCaOnWeight = doseGluconateCaOnWeight;
    }

    public double getDoseNaCl10OnKg() {
        return doseNaCl10OnKg;
    }

    public void setDoseNaCl10OnKg(double doseNaCl10OnKg) {
        this.doseNaCl10OnKg = doseNaCl10OnKg;
    }

    public double getDoseNaCl10OnWeight() {
        return doseNaCl10OnWeight;
    }

    public void setDoseNaCl10OnWeight(double doseNaCl10OnWeight) {
        this.doseNaCl10OnWeight = doseNaCl10OnWeight;
    }

    public double getDoseNaCl09OnKg() {
        return doseNaCl09OnKg;
    }

    public void setDoseNaCl09OnKg(double doseNaCl09OnKg) {
        this.doseNaCl09OnKg = doseNaCl09OnKg;
    }

    public double getDoseNaCl09OnWeight() {
        return doseNaCl09OnWeight;
    }

    public void setDoseNaCl09OnWeight(double doseNaCl09OnWeight) {
        this.doseNaCl09OnWeight = doseNaCl09OnWeight;
    }

    public double getDoseMgSO4OnKg() {
        return doseMgSO4OnKg;
    }

    public void setDoseMgSO4OnKg(double doseMgSO4OnKg) {
        this.doseMgSO4OnKg = doseMgSO4OnKg;
    }

    public double getDoseMgSO4OnWeight() {
        return doseMgSO4OnWeight;
    }

    public void setDoseMgSO4OnWeight(double doseMgSO4OnWeight) {
        this.doseMgSO4OnWeight = doseMgSO4OnWeight;
    }

    public double getWaterForFarming() {
        return waterForFarming;
    }

    public void setWaterForFarming(double waterForFarming) {
        this.waterForFarming = waterForFarming;
    }

    public double getAminoven() {
        return aminoven;
    }

    public void setAminoven(double aminoven) {
        this.aminoven = aminoven;
    }

    public double getGlucose() {
        return glucose;
    }

    public void setGlucose(double glucose) {
        this.glucose = glucose;
    }

    public double getKCl4() {
        return KCl4;
    }

    public void setKCl4(double KCl4) {
        this.KCl4 = KCl4;
    }

    public double getGluconateCa() {
        return gluconateCa;
    }

    public void setGluconateCa(double gluconateCa) {
        this.gluconateCa = gluconateCa;
    }

    public double getNaCl10() {
        return NaCl10;
    }

    public void setNaCl10(double naCl10) {
        NaCl10 = naCl10;
    }

    public double getNaCl09() {
        return NaCl09;
    }

    public void setNaCl09(double naCl09) {
        NaCl09 = naCl09;
    }

    public double getMgSO4() {
        return MgSO4;
    }

    public void setMgSO4(double mgSO4) {
        MgSO4 = mgSO4;
    }

    public double getTotalPr() {
        return totalPr;
    }

    public void setTotalPr(double totalPr) {
        this.totalPr = totalPr;
    }

    public double getDryMass() {
        return dryMass;
    }

    public void setDryMass(double dryMass) {
        this.dryMass = dryMass;
    }

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    public double getIntroductionOfTheBasicSolution() {
        return introductionOfTheBasicSolution;
    }

    public void setIntroductionOfTheBasicSolution(double introductionOfTheBasicSolution) {
        this.introductionOfTheBasicSolution = introductionOfTheBasicSolution;
    }

    public double getRateOfIntroductionOfTheBasicSolution() {
        return rateOfIntroductionOfTheBasicSolution;
    }

    public void setRateOfIntroductionOfTheBasicSolution(double rateOfIntroductionOfTheBasicSolution) {
        this.rateOfIntroductionOfTheBasicSolution = rateOfIntroductionOfTheBasicSolution;
    }

    public double getAmountGE() {
        return amountGE;
    }

    public void setAmountGE(double amountGE) {
        this.amountGE = amountGE;
    }

    public double getIntroductionGE() {
        return introductionGE;
    }

    public void setIntroductionGE(double introductionGE) {
        this.introductionGE = introductionGE;
    }

    public double getRateOfIntroductionGE() {
        return rateOfIntroductionGE;
    }

    public void setRateOfIntroductionGE(double rateOfIntroductionGE) {
        this.rateOfIntroductionGE = rateOfIntroductionGE;
    }

    public double getAmountOfTherapeuticDrugs() {
        return amountOfTherapeuticDrugs;
    }

    public void setAmountOfTherapeuticDrugs(double amountOfTherapeuticDrugs) {
        this.amountOfTherapeuticDrugs = amountOfTherapeuticDrugs;
    }

    public double getVolumeOfWaterForBreeding() {
        return volumeOfWaterForBreeding;
    }

    public void setVolumeOfWaterForBreeding(double volumeOfWaterForBreeding) {
        this.volumeOfWaterForBreeding = volumeOfWaterForBreeding;
    }

    public void calculate() {
        if (weightBaby != 0) {
            calcNeeds();

            if (enteralVolumeOnKg != 0 && numberOfFeedings != 0) {
                if (drugs == null) {
                    setDrugs("Грудное молоко зрелое");
                }
                calcEnteralNutrition();
            }
            if (doseOfAminoAcidsOnKg != 0 && doseFatOnKg != 0 & rateOfGlucoseOnKg != 0) {
                calcParenteralNutrition();
            }
            calcPP24();
        }
    }

    private void calcNeeds() {

        volumeOfFluidOnWeight = volumeOfFluidOnKg * weightBaby;

        aminoAcidsOnWeight = aminoAcidsKg * weightBaby;
        if (aminoAcidsKg != 0) {
            doseOfAminoAcidsOnKg = aminoAcidsKg - amountOfProteinOnKg;
        }
        fatsOnWeight = fatsOnKg * weightBaby;
        if (fatsOnKg != 0) {
            doseFatOnKg = fatsOnKg - amountOfFatOnKg;
        }
        carbohydratesOnWeight = carbohydratesOnKg * weightBaby;
        if (carbohydratesOnKg != 0) {
            doseOfGlucoseOnKg = carbohydratesOnKg - amountOfCarbohydratesOnKg;
            rateOfGlucoseOnKg = doseOfGlucoseOnKg / 1.44;
        }

        sodiumOnWeight = sodiumOnKg * weightBaby;
        potassiumOnWeight = potassiumOnKg * weightBaby;
        calciumOnWeight = calciumOnKg * weightBaby;
        magnesiumOnWeight = magnesiumOnKg * weightBaby;
       /*
       todo
       doseKCLOnKg = potassiumOnKg /520*13.4;
        doseGluconateCaOnKg = calciumOnKg /40;
        doseMgSO4OnKg = magnesiumOnKg
*/

    }

    public void calcEnteralNutrition() {
        enteralVolumeOnWeight = enteralVolumeOnKg * weightBaby;
        singleEntVolumeOnKg = enteralVolumeOnKg / numberOfFeedings;
        singleEntVolumeOnWeight = singleEntVolumeOnKg * weightBaby;
        amountOfProteinOnWeight = enteralVolumeOnWeight * drugs.getProteins() / 100;
        amountOfProteinOnKg = amountOfProteinOnWeight / weightBaby;
        amountOfFatOnWeight = enteralVolumeOnWeight * drugs.getFats() / 100;
        amountOfFatOnKg = amountOfFatOnWeight / weightBaby;
        amountOfCarbohydratesOnWeight = enteralVolumeOnWeight * drugs.getCarbohydrates() / 100;
        amountOfCarbohydratesOnKg = amountOfCarbohydratesOnWeight / weightBaby;

        /*totalEnergySupplyOnWeight = enteralVolumeOnWeight * drugs.getkKal() / 100;
        totalEnergySupplyOnKg = totalEnergySupplyOnWeight / weightBaby;*/
        energyCarbohydratesOnWeight = amountOfCarbohydratesOnWeight * kKalCarbohydrates;
        energyCarbohydratesOnKg = energyCarbohydratesOnWeight / weightBaby;
        energyFatsOnWeight = amountOfFatOnWeight * kKalFats;
        energyFatsOnKg = energyFatsOnWeight / weightBaby;
        totalEnergySupplyOnKg = energyCarbohydratesOnKg + energyFatsOnKg;
        totalEnergySupplyOnWeight = totalEnergySupplyOnKg * weightBaby;
        totalEnergyOnKg = totalEnergySupplyOnKg + amountOfProteinOnKg * 4;
        totalEnergyOnWeight = totalEnergyOnKg * weightBaby;
        if (aminoAcidsKg != 0) {
            doseOfAminoAcidsOnKg = aminoAcidsKg - amountOfProteinOnKg;
        }
        if (fatsOnKg != 0) {
            doseFatOnKg = fatsOnKg - amountOfFatOnKg;
        }
        if (carbohydratesOnKg != 0) {
            doseOfGlucoseOnKg = carbohydratesOnKg - amountOfCarbohydratesOnKg;
            rateOfGlucoseOnKg = doseOfGlucoseOnKg / 1.44;
        }
        calcParenteralNutrition();
        calcPP24();
    }

    public void setDrugs(String drug) {
        drugs = new Drugs(drug);
    }

    public void calcParenteralNutrition() {
        doseOfAminoAcidsOnWeight = doseOfAminoAcidsOnKg * weightBaby;
        doseFatOnWeight = doseFatOnKg * weightBaby;
        rateOfGlucoseOnWeight = rateOfGlucoseOnKg * weightBaby;
        doseOfGlucoseOnWeight = rateOfGlucoseOnWeight * 1.44;
        doseOfGlucoseOnKg = doseOfGlucoseOnWeight / weightBaby;
        aminovenOnKg = doseOfAminoAcidsOnKg * 100 / 10;
        aminovenOnWeight = aminovenOnKg * weightBaby;
        fatEmulsionOnKg = doseFatOnKg * 100 / 20;
        fatEmulsionOnWeight = fatEmulsionOnKg * weightBaby;
        glucoseOnKg = doseOfGlucoseOnKg * 100 / 40;
        glucoseOnWeight = doseOfGlucoseOnWeight * 100 / 40;

        energyCarbohydratesOnWeightP = doseOfGlucoseOnWeight * kKalCarbohydrates;
        energyCarbohydratesOnKgP = energyCarbohydratesOnWeightP / weightBaby;
        energyFatsOnWeightP = doseFatOnWeight * kKalFats;
        energyFatsOnKgP = energyFatsOnWeightP / weightBaby;
        totalEnergySupplyOnKgP = energyCarbohydratesOnKgP + energyFatsOnKgP;
        totalEnergySupplyOnWeightP = totalEnergySupplyOnKgP * weightBaby;
        totalEnergyOnKgP = totalEnergySupplyOnKgP + doseOfAminoAcidsOnKg * 4;
        totalEnergyOnWeightP = totalEnergyOnKgP * weightBaby;
        calcPP24();
    }

    public void calcPP24() {
        doseKCLOnWeight = doseKCLOnKg * weightBaby * 1.8;
        doseGluconateCaOnWeight = doseGluconateCaOnKg * weightBaby * 3.33;
        doseNaCl10OnWeight = doseNaCl10OnKg * weightBaby * 0.58;
        doseNaCl09OnWeight = doseNaCl09OnKg * weightBaby * 6.67;
        doseMgSO4OnWeight = doseMgSO4OnKg * weightBaby / 2;
        aminoven = aminovenOnWeight;
        glucose = glucoseOnWeight;
        KCl4 = doseKCLOnWeight;
        gluconateCa = doseGluconateCaOnWeight;
        NaCl10 = doseNaCl10OnWeight;
        NaCl09 = doseNaCl09OnWeight;
        MgSO4 = doseMgSO4OnWeight;
        double volume = aminoven + glucose + KCl4 + gluconateCa + NaCl10 + NaCl09 + MgSO4;
        if (introductionOfTheBasicSolution != 0) {
            rateOfIntroductionOfTheBasicSolution = volume / introductionOfTheBasicSolution;
        }
        amountGE = fatEmulsionOnWeight;
        if (introductionGE != 0) {
            rateOfIntroductionGE = amountGE / introductionGE;
        }

        totalVolumeOfLiquid = volumeOfFluidOnWeight;
        volumeParenteralInfusion = volume + amountGE;
        enteralVolume = enteralVolumeOnWeight;
        amountOfDrugs = amountOfTherapeuticDrugs;
        double water = totalVolumeOfLiquid - enteralVolume - volumeParenteralInfusion - amountOfDrugs;
        waterForFarming = water>0? water:0;
        dryMass = aminoven * 0.1 + glucose * 0.4;
        //double volume = aminoven + glucose + KCl4 + gluconateCa + NaCl10 + NaCl09 + MgSO4 + waterForFarming;
        totalPr = volume + waterForFarming;
        if (totalPr != 0)
            concentration = (dryMass*100 / totalPr);
    }


    public void calcGeneralBalance() {
        amountOfProteinOnKgG = amountOfProteinOnKg + doseOfAminoAcidsOnKg;
        amountOfProteinOnWeightG = amountOfProteinOnKgG * weightBaby;
        amountOfFatOnKgG = amountOfFatOnKg + doseFatOnKg;
        amountOfFatOnWeightG = amountOfFatOnKgG * weightBaby;
        amountOfCarbohydratesOnKgG = amountOfCarbohydratesOnKg + doseOfGlucoseOnKg;
        amountOfCarbohydratesOnWeightG = amountOfCarbohydratesOnKgG * weightBaby;
        energyCarbohydratesOnKgG = energyCarbohydratesOnKg + energyCarbohydratesOnKgP;
        energyCarbohydratesOnWeightG = energyCarbohydratesOnKgG * weightBaby;
        energyFatsOnKgG = energyFatsOnKg + energyFatsOnKgP;
        energyFatsOnWeightG = energyFatsOnKgG * weightBaby;
        totalEnergySupplyOnKgG = totalEnergySupplyOnKg + totalEnergySupplyOnKgP;
        totalEnergySupplyOnWeightG = totalEnergySupplyOnKgG * weightBaby;
        totalEnergyOnKgG = totalEnergyOnKg + totalEnergyOnKgP;
        totalEnergyOnWeightG = totalEnergyOnKgG * weightBaby;
        volumeOfWaterForBreeding = waterForFarming;
    }
}
