/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.itnetwork.evidencepojistenych;

import java.util.Scanner;       // Importuje třídy potřebné pro projekt (`java.util.Scanner`).

/**
 *
 * @author Franta
 */
public class EvidencePojistenych {

    static Scanner scanner = new Scanner(System.in, "Windows-1250");   // Vytváří statickou instanci třídy `Scanner` s názvem `scanner` pro načítání vstupu od uživatele.

    Pojistenci pojistenci = new Pojistenci();                       // Vytváří instanci třídy `Pojistenci` s názvem `pojistenci`.

    public static void main(String[] args) {                        // Hlavní metoda `main` - začátek programu:
        System.out.println("***********************");              // Vypisuje nadpis programu.
        System.out.println(" EVIDENCE POJIŠTĚNÝCH: ");
        System.out.println("***********************");
        EvidencePojistenych evidence = new EvidencePojistenych();   // Vytváří instanci třídy `EvidencePojistenych` s názvem `evidence`.
        evidence.spustit();                 // Metoda spustit() zpřístupní menu a volá metodu `spustit()`, která zahajuje běh programu.
    }

    public void spustit() {
        int volba;                          // Deklaruje proměnnou `volba` pro uchování volby uživatele.
        do {                                // Spouští smyčku `do-while`, která bude prováděna, dokud uživatel nezvolí volbu "4" (konec programu).
            zobrazitMenu();                 // Volá metodu `zobrazitMenu()` pro zobrazení menu uživateli.
            volba = scanner.nextInt();      // Čte vstup uživatele (volbu) a ukládá ji do proměnné `volba`.
            scanner.nextLine();             // Odstraňuje zbylý nový řádek vstupu (kvůli metodě `nextLine()`).
            zpracovatVolbu(volba);

        } while (volba != 4);
    }

    // Menu pro výběr požadované operace:
    private void zobrazitMenu() {             // Metoda `zobrazitMenu` vypisuje menu s volbami.
        System.out.println("Zadejte číslo vašeho požadavku:");
        System.out.println("1 - Přidání nového pojištěnce");
        System.out.println("2 - Vypsání seznamu pojištěnců z databáze");
        System.out.println("3 - Vhledání pojištěnce podle jména a příjmení");
        System.out.println("4 = KONEC programu");
    }

    // Metoda `zpracovatVolbu` provádí různé akce na základě volby uživatele.
    // Používá `switch` pro rozlišení volby:
    private void zpracovatVolbu(int volba) {    // KONSTRUKTOR PRO Výběr a provádění požadavků z menu
        switch (volba) {
            case 1 ->
                pojistenci.pridatPojistence();
            case 2 ->
                pojistenci.vypisPojistencu();
            case 3 ->
                pojistenci.vyhledatPojistence();
            case 4 ->
                System.out.println("Ukončuji program.");
            default ->
                System.out.println("Neplatná volba, zkuste to prosím znovu.");
        }
    }
}
