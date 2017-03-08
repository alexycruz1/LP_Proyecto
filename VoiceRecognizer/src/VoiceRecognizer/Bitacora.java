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
public class Bitacora {
    String Fecha;
    String Accion;
    String NombreUsuarioPertenece;

    public Bitacora() {
    }

    public Bitacora(String Fecha, String Accion, String NombreUsuarioPertenece) {
        this.Fecha = Fecha;
        this.Accion = Accion;
        this.NombreUsuarioPertenece = NombreUsuarioPertenece;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public String getNombreUsuarioPertenece() {
        return NombreUsuarioPertenece;
    }

    public void setNombreUsuarioPertenece(String NombreUsuarioPertenece) {
        this.NombreUsuarioPertenece = NombreUsuarioPertenece;
    }

    @Override
    public String toString() {
        return "Bitacora{" + "Fecha=" + Fecha + '}';
    }
}
