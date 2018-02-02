package controllers;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class DigitalFilter  extends DocumentFilter {
    private static final String DIGITS = "\\d|\\.";

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string.matches(DIGITS) || string.matches("")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attrs) throws BadLocationException {
        if (string.matches(DIGITS) || string.matches("")) {
            super.replace(fb, offset, length, string, attrs);
        }
    }
}