/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mmdc.samplegit2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author micahbule
 */
public class SampleGit2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        System.out.println("Hello Mapua Malayan Digital College!");

        SampleGui sampleGui = new SampleGui();

        frame.setContentPane(sampleGui.mainPanel);

        frame.setPreferredSize(new Dimension(800, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setVisible(true);
    }
}
