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
public class Contacto {
    String Name;
    String PhoneticName;
    String NickName;
    String RutaImagen;
    String Phone;
    String PhonePlace;
    String Email;
    String BirthDay;

    public Contacto() {
    }

    public Contacto(String Nombre, String PhoneticName, String NickName, String RutaImagen, String Phone, String PhonePlace, String Email, String BirthDate) {
        this.Name = Nombre;
        this.PhoneticName = PhoneticName;
        this.NickName = NickName;
        this.RutaImagen = RutaImagen;
        this.Phone = Phone;
        this.PhonePlace = PhonePlace;
        this.Email = Email;
        this.BirthDay = BirthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneticName() {
        return PhoneticName;
    }

    public void setPhoneticName(String PhoneticName) {
        this.PhoneticName = PhoneticName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPhonePlace() {
        return PhonePlace;
    }

    public void setPhonePlace(String PhonePlace) {
        this.PhonePlace = PhonePlace;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    @Override
    public String toString() {
        return Name;
    }
}
