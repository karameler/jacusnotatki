package com.lusia.jacusnotatki;
import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.Date;

public class Notatki {
    /*
    https://my-json-server.typicode.com/karameler/jaceklistapytan/pytania
     */
    @SerializedName("tytul")
    public String tytulnotatki;
    @SerializedName("tresc")
    public String trescnotatki;
    @SerializedName("data")
    public String kal;



    /*public Notatki(int rok,int miesiac, int dzien) {
        kal.set(Calendar.YEAR, rok);
    }*/

    public Notatki(String tytulnotatki, String trescnotatki,String kal) {
        this.tytulnotatki = tytulnotatki;
        this.trescnotatki = trescnotatki;
        this.kal = kal;


    }

    @Override
    public String toString() {
        return "tytulnotatki: " + tytulnotatki + '\'' +
                ", trescnotatki: " + trescnotatki + '\'' +
                ", kal: " + kal ;
    }

    public Notatki() {
    }
}
