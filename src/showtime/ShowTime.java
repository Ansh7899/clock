/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showtime;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowTime extends JFrame{
    ShowTime(){
    JTextField text=new JTextField(10);
      add(text);
      text.setEditable(false);
      pack();
      setVisible(true);
      while(true){
      try {
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      text.setText(hour + ":" + minute + ":" + second);
      } 
      catch (Exception e) {}
      }
   }
public static void main(String args[]){
ShowTime s = new ShowTime();
}
}