package printers;
import sun.nio.cs.UnicodeEncoder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import java.nio.charset.Charset;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class RTFView extends JFrame {
    public JEditorPane editor;
    public RTFView() {
        setTitle("RTF Text Application");
        setSize(400, 240);
        setBackground(Color.gray);
        getContentPane().setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.CENTER);

        // Create an RTF editor window
        RTFEditorKit rtf = new RTFEditorKit();
        editor = new JEditorPane();
        editor.setEditorKit(rtf);
        editor.setBackground(Color.white);

        // This text could be big so add a scroll pane
        JScrollPane scroller = new JScrollPane();
        scroller.getViewport().add(editor);
        topPanel.add(scroller, BorderLayout.CENTER);

        editor.setDocument(new DefaultStyledDocument() {
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException  {
                try {
                   // str = new String(str.getBytes("ISO-8859-1"), "cp1251");
                    str = new String(str.getBytes("ISO-8859-1"), "ISO-8859-1");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                super.insertString(offs, str, a);
            }
        });

        try {
            FileInputStream fl;
            BufferedReader br1;
            fl = new FileInputStream("resources/"+"output.rtf");
            br1 = new BufferedReader(new InputStreamReader(fl, "cp1251"));
            rtf.read(br1, editor.getDocument(), 0);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O error");
        } catch (BadLocationException e) {
        }
    }

    /*public static void main(String args[]) {
        // Create an instance of the test application
        RTFView mainFrame = new RTFView();
        mainFrame.setVisible(true);
    }*/
}