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
public class Usuario {
    String Nombre;
    String UserName;
    String Contraseña;
    String BirthDate;
    String Phone;
    String Country;

    public Usuario() {
    }

    public Usuario(String Nombre, String UserName, String Contraseña, String BirthDate, String Phone, String Country) {
        this.Nombre = Nombre;
        this.UserName = UserName;
        this.Contraseña = Contraseña;
        this.BirthDate = BirthDate;
        this.Phone = Phone;
        this.Country = Country;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return UserName;
    } 
}
