package com.github.ikeirnez.commandsex.builder.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;

public class LoadJar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JProgressBar progBar = new JProgressBar();
        progBar.setValue(50);
    }

    
}
