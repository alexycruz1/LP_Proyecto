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
    String FirstName;
    String LastName;
    String UserName;
    String Contraseña;
    String BirthDay;
    String Phone;
    String Country;
    String Genero;
    boolean Estado;

    public Usuario() {
    }

    public Usuario(String FirstName, String LastName, String UserName, String Contraseña, String BirthDay, String Phone, String Country, String Genero, boolean Estado) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Contraseña = Contraseña;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Country = Country;
        this.Genero = Genero;
        this.Estado = Estado;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
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

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    

    @Override
    public String toString() {
        return UserName;
    } 
}
