/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoiceRecognizer;

import javax.speech.recognition.Recognizer;
import javax.speech.recognition.Result;
import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;

/**
 *
 * @author xyto_
 */
public class Escucha extends ResultAdapter {
    static Recognizer recognizer;
    String gst;
    Escucha Temp;

    public Escucha() {
    }

    public Escucha(String gst) {
        this.gst = gst;
    }
    
    public Escucha(Escucha Temp) {
        this.Temp = Temp;
    }
    
    public void resultAccepted(ResultEvent re) {
        try {
            Result res = (Result) (re.getSource());
            ResultToken tokens[] = res.getBestTokens();

            String args[] = new String[1];
            args[0] = "";
            for (int i = 0; i < tokens.length; i++) {
                gst = tokens[i].getSpokenText();
                args[0] += gst + " ";
                System.out.print(gst);
            }
            
            Temp.setGst(gst);
            System.out.println();
            if (gst.equals("Exit")) {
                recognizer.deallocate();
                args[0] = "Hasta la proxima!";
                System.out.println(args[0]);
                System.exit(0);
            } else {
                recognizer.suspend();
                recognizer.resume();
            }
        } catch (Exception ex) {
            System.out.println("Palabra captada");
        }
    }

    public static Recognizer getRecognizer() {
        return recognizer;
    }

    public static void setRecognizer(Recognizer recognizer) {
        Escucha.recognizer = recognizer;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public Escucha getTemp() {
        return Temp;
    }

    public void setTemp(Escucha Temp) {
        this.Temp = Temp;
    }
    
    
}
