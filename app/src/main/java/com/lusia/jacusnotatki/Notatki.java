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
    public Calendar kal = Calendar.getInstance();



    /*public Notatki(int rok,int miesiac, int dzien) {
        kal.set(Calendar.YEAR, rok);
    }*/

    public Notatki(String tytulnotatki, String trescnotatki,int rok,int miesiac, int dzien) {
        this.tytulnotatki = tytulnotatki;
        this.trescnotatki = trescnotatki;
        kal.set(Calendar.YEAR, rok);
        kal.set(Calendar.MONTH, miesiac);
        kal.set(Calendar.DAY_OF_MONTH, dzien);


    }
}
