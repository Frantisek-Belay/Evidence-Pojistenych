/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import static cz.itnetwork.evidencepojistenych.EvidencePojistenych.scanner;
import java.util.ArrayList;

/**
 *
 * @author Franta
 */
public class Pojistenci {    // Třída `Pojistenci` obsahuje seznam pojištěnců ve formě `ArrayList`.

    public ArrayList<Pojistenec> pojistenci;

    /**
     * KONSTRUKTOR pro vytváření proměnných:
     */
    public Pojistenci() {   // V konstruktoru třídy je seznam inicializován.
        this.pojistenci = new ArrayList<>();
    }

    public void pridatPojistence() {                         // Metoda `pridatPojistence` umožňuje přidat nového pojištěnce.
        System.out.println("Zadejte jméno pojištěnce:");
        String jmeno = scanner.nextLine();                   // Čte vstupy od uživatele (jméno, příjmení, věk, telefonní číslo) a vytváří nový objekt třídy `Pojistenec`.
        System.out.println("Zadejte příjmení pojištěnce:");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte věk pojištěnce:");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonní číslo pojištěnce:");
        String telCislo = scanner.nextLine();
        System.out.println();
        this.pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telCislo));  // Nový pojištěnec je přidán do seznamu `pojistenci`.
        System.out.println("Pojištěnec byl úspěšně přidán.");
    }

    public void vyhledatPojistence() {                       // Metoda `vyhledatPojistence` umožňuje vyhledat pojištěnce podle jména a příjmení.
        System.out.println("Zadejte jméno pojištěnce:");
        String jmeno = scanner.nextLine();                   // Čte jméno a příjmení od uživatele a prochází seznam pojištěnců.
        System.out.println("Zadejte příjmení pojištěnce:");
        String prijmeni = scanner.nextLine();
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equalsIgnoreCase(jmeno) && pojistenec.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println("Pojištěnec nalezen: " + pojistenec);
                return;     // Pokud nalezne shodu, vypíše informace o pojištěnci. Pokud nenalezne, vypíše, že pojištěnec nebyl nalezen.
            }
        }
        System.out.println("Pojištěnec nebyl nalezen.");
    }

    public void vypisPojistencu() {                 // Metoda `vypisPojistencu` vypisuje seznam pojištěnců.
        if (pojistenci.isEmpty()) {                 // Kontroluje, zda je seznam prázdný. Pokud ano, vypíše zprávu o prázdné databázi.
            System.out.println("V databázi nejsou žádní pojištěnci.");
            return;
        }
        System.out.println("Výpis pojištěnců:");
        for (Pojistenec pojistenec : pojistenci) {  // Pokud seznam není prázdný, vypisuje všechny pojištěnce.
            System.out.println(pojistenec);
        }
    }
}
