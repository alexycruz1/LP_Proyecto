/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoiceRecognizer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author alexy
 */
public class Hilo implements Runnable{
    private JLabel hora;
    int Secs = 0;
    int Minutes = 0;
    int Hours = 0;
    

    public Hilo() {
    }

    public Hilo(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run(){
        while(true){
            String Time = Integer.toString(Hours) + ":" + Integer.toString(Minutes) + ":" + Integer.toString(Secs);
            hora.setText(Time);
            
            Secs++;
            
            if (Secs == 60) {
                Secs = 0;
                Minutes++;
                
                if (Minutes == 60) {
                    Minutes = 0;
                    Hours++;
                }
            }
            
            try{
               Thread.sleep(1000);
            } catch(InterruptedException ex){
                
            }
        }
    }
}
