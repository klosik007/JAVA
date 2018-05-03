package com.firstapplet;
import javax.swing.JApplet;
import java.awt.Graphics;

public class FirstApp extends JApplet{
	public void paint (Graphics gDC){
		gDC.drawString("pierwszy app", 100, 100);
	}

}
