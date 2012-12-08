package com.github.ikeirnez.commandsex.builder.helpers;

import java.awt.FontMetrics;

import javax.swing.JApplet;

public class CenteredString {

    private int x;
    private int y;

    /**
     * Class to handle getting the exact centre horizontally or vertically for a String
     * @param j The JApplet instance
     * @param g The graphics instance
     * @param s The string to be drawn
     */
    public CenteredString(JApplet j, FontMetrics fm, String s){
        int textHeight = (int)(fm.getHeight());
        int textWidth = (fm.getWidths()[0]);
        int panelHeight = j.getHeight();
        int panelWidth = j.getWidth();

        doCalcs(textHeight, textWidth, panelHeight, panelWidth, fm.getAscent());
    }
    
    /**
     * Class to handle getting the exact centre horizontally or vertically for a String
     * @param textHeight The height of the text to be drawn
     * @param textWidth The width of the text to be drawn
     * @param panelHeight The height of the panel
     * @param panelWidth The width of the panel
     * @param fontAscent The ascent of the font
     */
    public CenteredString(int textHeight, int textWidth, int panelHeight, int panelWidth, int fontAscent){
        doCalcs(textHeight, textWidth, panelHeight, panelWidth, fontAscent);
    }

    /**
     * Function to do the calculations for x and y
     * @param textHeight The height of the text to be drawn
     * @param textWidth The width of the text to be drawn
     * @param panelHeight The height of the panel
     * @param panelWidth The width of the panel
     * @param fontAscent The ascent of the font
     */
    private void doCalcs(int textHeight, int textWidth, int panelHeight, int panelWidth, int fontAscent){
        x = (panelWidth - textWidth) / 2;
        y = (panelHeight - textHeight) / 2 + fontAscent;
    }
    
    /**
     * The x coordinate of the string to draw
     * @return The x coordinate to place the string, when string is placed at this location it will be completely centred horizontally
     */
    public int getX(){
        return x;
    }
    
    /**
     * The y coordinate of the string to draw
     * @return The y coordinate to place the string, when string is placed at this location it will be completely in the middle vertically
     */
    public int getY(){
        return y;
    }
    
}
