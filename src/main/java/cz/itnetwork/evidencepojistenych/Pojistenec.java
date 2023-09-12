/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

/**
 * Deklarace proměnných:
 *
 * @author Franta
 */
public class Pojistenec {       // Třída `Pojistenec` představuje jednotlivé pojištěnce.

    private String jmeno;       // Má privátní atributy pro jméno, příjmení, věk a telefonní číslo.
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    /**
     * KONSTRUKTOR pro vytváření proměnných:
     * jmeno
     * prijmeni
     * vek
     * telCislo
     */
    // Konstruktor třídy slouží k inicializaci atributů pojištěnce.
    public Pojistenec(String jmeno, String prijmeni, int vek, String telCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telCislo;
    }

    /**
     * Gettery pro vyhledání záznamů pojištěnce z databáze:
     */
    public String getJmeno() {      // Metody `get` slouží k získání hodnot atributů pojištěnce.
        return this.jmeno;
    }

    public String getPrijmeni() {
        return this.prijmeni;
    }

      @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", (" + vek + " roků), " + telefonniCislo + " ";
    }
    /*
     Metoda `toString` je přetížená metoda ze třídy `Object`,
     která slouží k formátování textového zobrazení pojištěnce.
     Je volána, když je objekt konvertován na řetězec.
    */
}
