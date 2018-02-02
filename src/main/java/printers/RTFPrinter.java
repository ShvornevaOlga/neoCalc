package printers;


import model.Baby;
import javax.swing.text.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;


public class RTFPrinter {
    private Baby baby;
    public RTFPrinter(Baby baby){
        this.baby = baby;
    }

    public void convert() {
        InputStream in = null;
        OutputStreamWriter out = null;
        File f = new File("resources/"+"output.rtf");
        try {
            in = new FileInputStream("resources/"+"template.rtf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //todo
        }
        try {
            RTFEditorKit rtfParser = new RTFEditorKit();
            Document document = rtfParser.createDefaultDocument();

            rtfParser.read(in, document, 0);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                out = new OutputStreamWriter(new FileOutputStream(f),"ISO-8859-1");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
               // Baby baby = new Baby();
               String sss;
               String reg;
                sss = document.getText(0, document.getLength());
                reg ="$drugName";
                if(sss.contains(reg)) {
                    int index = sss.indexOf(reg);
                    document.remove(index, reg.length());
                    if(baby.getDrugs()!=null)
                    document.insertString(index, baby.getDrugs().getName(), null);
                }
                sss = document.getText(0, document.getLength());
                reg ="$date";
                if(sss.contains(reg)) {
                    int index = sss.indexOf(reg);
                    document.remove(index, reg.length());
                    Date date = new Date();
                    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss");

                    document.insertString(index, String.valueOf(formatForDateNow.format(date)), null);
                }
                List<Field> filds = Arrays.asList(baby.getClass().getDeclaredFields());
                Collections.sort(filds, new Comparator<Field>(){
                    public int compare(Field s1, Field s2) {
                        return s1.getName().length()>s2.getName().length()?-1:1;
                    }
                });
                for (Field field : filds) {
                    field.setAccessible(true);
                    try {
                        String nameBaby = field.getName();
                        sss = document.getText(0, document.getLength());
                        reg = "$"+nameBaby;
                        if(sss.contains(reg)) {
                            int index = sss.indexOf(reg);
                            document.remove(index, reg.length());
                            Method method = baby.getClass().getMethod("get"+nameBaby.substring(0, 1).toUpperCase() + nameBaby.substring(1));
                            String txt =String.valueOf(new BigDecimal((Double) method.invoke(baby)).setScale(2, RoundingMode.HALF_UP).doubleValue());
                            document.insertString(index,txt, null);
                        }
                    }
                    catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                    }
                }

                rtfParser.write(baos, document, 0, document.getLength());
                out.write(baos.toString());
                out.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        } finally {
            try {

                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}