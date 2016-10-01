package kdk;

import java.util.Date;
import java.util.Scanner;

public class Kot
{
String imie;
Date data;
Float waga;
String imieOpiekuna;
static Scanner sc = new Scanner(System.in);
public String przedstawSie(){
	return "Imiê kota" +imie +" Data: "+ data+" Waga: "+ waga +" Imiê opiekuna: " + imieOpiekuna;
}
public static String getUserInput()
{
	return sc.nextLine();
}
	public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
}
}