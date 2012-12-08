package com.github.ikeirnez.commandsex.builder;

import java.awt.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

import com.github.ikeirnez.commandsex.builder.helpers.CenteredString;

/**
 * The CommandsEX Builder applet
 * @author iKeirNez
 */
public class AppletBuilder extends JApplet {

    private String title = "CommandsEX Builder";
    private JTextArea titleTxt;
    private static boolean application = false;
    
    /**
     * This method allows us to run the Applet from a Runnable JAR
     */
    public static void main(String[] args){
        System.out.println("Starting as Application");
        application = true;
        
        JFrame frame = new JFrame("CommandsEX");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AppletBuilder.class.getClassLoader().getResource("resources/cex.png")));
        frame.pack();
        
        AppletBuilder applet = new AppletBuilder() {
            public String getParameter(String name){
                if (name.equalsIgnoreCase("msg")){
                    return "Local Frame";
                }
                
                return null;
            }
        };
        
        applet.init();
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    public void init(){
        if (!application){
            System.out.println("Starting as Web Applet");
        }
        
        //setLayout(new BoxLayout(getContentPane(), SwingConstants.HORIZONTAL));
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.WHITE);
        titleTxt = new JTextArea(title);
        add(titleTxt);
    }
    
    public void paint(Graphics g){
        System.out.println("Painting Graphics");
        super.paint(g);
        refreshObjects();
        
        //g.drawImage(img, 5, 5, 50, 50, null);
    }
    
    public void refreshObjects(){
        CenteredString ct = new CenteredString(this, titleTxt.getFontMetrics(titleTxt.getFont()), title);
        titleTxt.setFont(new Font(titleTxt.getFont().getName(), titleTxt.getFont().getStyle(), 20));
        titleTxt.setLocation(ct.getX(), 0);
    }
}
