/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoiceRecognizer;

/**
 *
 * @author xyto_
 */
public class Mensaje {
    String Fecha;
    String Asunto;
    String Destinatario;
    String NombreUsuarioPertenece;
    boolean Estado;

    public Mensaje() {
    }

    public Mensaje(String Fecha, String Asunto, String Destinatario, String NombreUsuarioPertenece, boolean Estado) {
        this.Fecha = Fecha;
        this.Asunto = Asunto;
        this.Destinatario = Destinatario;
        this.NombreUsuarioPertenece = NombreUsuarioPertenece;
        this.Estado = Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getNombreUsuarioPertenece() {
        return NombreUsuarioPertenece;
    }

    public void setNombreUsuarioPertenece(String NombreUsuarioPertenece) {
        this.NombreUsuarioPertenece = NombreUsuarioPertenece;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "Destinatario=" + Destinatario + '}';
    }
    
    
}
