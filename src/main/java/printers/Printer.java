package printers;

/**
 *
 * @author Стас
 */

import java.awt.*;

import java.awt.print.*;

import java.io.* ;

public class Printer implements Printable{
/*
    public static void main(String[] args){
//args=new String("test.doc");
        if (args.length < -1){

            System.err.println("Usage: Print2File path");

            System.exit(0);

        }

        PrinterJob pj = PrinterJob.getPrinterJob();

        PageFormat pf = pj.pageDialog(pj.defaultPage());

        pj.setPrintable(new FilePagePainter("test.doc"), pf);

        if (pj.printDialog()){

            try{

                pj.print();

            }catch(PrinterException e){}


            System.exit(0);

        }

    }


    static class FilePagePainter implements Printable{*/

        private BufferedReader br;

        private String file;

        private int page = -1;

        private boolean eof;

        private String[] line;

        private int numLines;

        public Printer(String file){

            this.file = file;

            try{

                br = new BufferedReader(new FileReader(file));

            }catch(IOException e){ eof = true; }

        }


        @Override
        public int print(Graphics g, PageFormat pf, int ind)throws PrinterException{

            g.setColor(Color.black);

            g.setFont(new Font("Times new roman", Font.PLAIN, 10));

            int h = (int)pf.getImageableHeight();

            int x = (int)pf.getImageableX() + 10;

            int у = (int)pf.getImageableY() + 12;

            try{

// Если система печати запросила эту страницу первый раз

                if (ind != page){

                    if (eof) return Printable.NO_SUCH_PAGE;

                    page = ind;

                    line = new String[h/12];           // Массив строк на странице

                    numLines =0;                       // Число строк на странице

// Читаем строки из файла и формируем массив строк

                    while (у + 48 < pf.getImageableY() + h){

                        line[numLines] = br.readLine();

                        if (line[numLines] == null){

                            eof = true; break; }

                        numLines++;

                        у+= 12;

                    }

                }

// Размещаем колонтитул

                у = (int)pf.getImageableY() + 12;

                g.drawString("Файл: " + file + ", страница " +

                        (ind + 1), x, у);

// Оставляем две пустые строки

                у += 36;

// Размещаем строки текста текущей страницы

                for (int i = 0; i < numLines; i++){

                    g.drawString(line[i], x, у) ;

                    у += 12;

                }

                return Printable.PAGE_EXISTS;

            }catch(IOException e){

                return Printable.NO_SUCH_PAGE;

            }

        }
    }
