package kdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Interfejs {

    static Scanner sc = new Scanner(System.in);
1213
    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.print("Podaj imię kota: ");
        kot.setImie(getUserInput());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        do {
            System.out.print("Podaj datę urodzenia kota w formacie RRRR.MM.DD: ");
            try {
                kot.setDataUrodzenia(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Coś jest nie tak z formatem daty! Przykładowa data: 2014.01.05");
            }
        } while (kot.getDataUrodzenia() == null);

        do {
            System.out.print("Podaj wagę kota: ");
            try {
                kot.setWaga(Float.valueOf(getUserInput()));
            } catch (NumberFormatException nfe) {
                System.out.println("Coś jest nie tak z formatem wagi! Przykładowa waga: 10.0");
            }
        } while (kot.getWaga() == null);

        System.out.print("Podaj kto jest opiekunem kota: ");
        kot.setImieOpiekuna(getUserInput());

        System.out.println("Dziękuję, teraz wiem o kocie naprawdę wszystko!");
    }

    public static String getUserInput() {
        return sc.nextLine().trim();
    }

}
