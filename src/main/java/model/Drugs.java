package model;

import java.io.*;
import java.util.Properties;

public class Drugs {
    private double carbohydrates;
    private double fats;
    private double proteins;
    private double kKal;
    private double osmolality;
    private double osmolarity;
    private String name;

    public String getName() {
        return name;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getProteins() {
        return proteins;
    }

    public double getkKal() {
        return kKal;
    }

    public double getOsmolality() {
        return osmolality;
    }

    public double getOsmolarity() {
        return osmolarity;
    }

    public Drugs(String drug){
        String propsName = getPropsFileName(drug);
        Properties props = new Properties();
        name = drug;

        File f = new File("resources/"+propsName + ".prop");
        if (f.exists()) {
            try {
                InputStream is = new BufferedInputStream(new FileInputStream(f));
                props.load(is);
                is.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            try {
                carbohydrates = Double.parseDouble(props.getProperty("carbohydrates"));
                fats = Double.parseDouble(props.getProperty("fats"));
                proteins = Double.parseDouble(props.getProperty("proteins"));
                kKal = Double.parseDouble(props.getProperty("kKal"));
                osmolality = Double.parseDouble(props.getProperty("osmolality"));
                osmolarity = Double.parseDouble(props.getProperty("osmolarity"));
            } catch (NumberFormatException nfe) {
            }
        } else {
            //todo
            try {
                System.out.println("no prop file"+ f.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private String getPropsFileName(String drug) {
        String propsName = "breastMilkMature";
        switch (drug) {
            case "Грудное молоко зрелое":
                propsName = "breastMilkMature";
                break;
            case "Nestogen":
                propsName = "nestogen";
                break;
            case "NAN 1 жидкий":
                propsName = "nan1";
                break;
            case "Нутрилон":
                propsName = "nutrilon";
                break;
            case "Энфамил премиум 1":
                propsName = "enfamil";
                break;
            case "NAN антирефлюкс":
                propsName = "nanAntirefluks";
                break;
            case "Грудное молоко (преждевременные роды)":
                propsName = "milkMature";
                break;
            case "Альфаре":
                propsName = "alfare";
                break;
            case "Pre NAN NEW":
                propsName = "preNanNew";
                break;
            case "Инфатрини":
                propsName = "infatrini";
                break;
            case "Нутрилон Пепти ТСЦ":
                propsName = "nutrilonPepti";
                break;
            case "Пре-Нутрилон 0":
                propsName = "preNutrilon0";
                break;
            case "Пре-Нутрилон 1":
                propsName = "preNutrilon1";
                break;
            case "Similac Neo Sure":
                propsName = "similacNeoSure";
                break;
            case "Similac Special Care":
                propsName = "similacSpecialCare";
                break;
            case "Фрисопре":
                propsName = "frisopre";
                break;
            case "Прегестимил":
                propsName = "pregestimil";
                break;
            case "Enfamil Premature":
                propsName = "enfamilPremature";
                break;
        }
        return propsName;
    }
}
