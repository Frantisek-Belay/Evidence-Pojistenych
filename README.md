Evidence Pojistenych

Projekt je řešen jako základní konzolová aplikace psaná v jazyce Java OOP, bez ošetření vstupů uživatele a řešení výjimek.
Po spuštění aplikace je uživatel uvítán nadpisem "EVIDENCE POJIŠTĚNÝCH" a kontaktními údaji autora. 
Následně je uživateli zobrazeno menu s možnostmi operací, které může provést:

- 1. Vložit pojištěnce, věk, telefonní číslo.
- 2. Vypsání seznamu pojištěnců
- 3. Vyhledat pojištěnce podle jména a příjmení.
- 4. Konec programu.

Program je implementován pomocí objektově orientovaného přístupu, kde třída `EvidencePojistenych` obsahuje instanci třídy `Pojistenci`. 
Metoda `spustit()` řídí hlavní běh programu a využívá smyčku `do-while` pro opakované zobrazení menu a zpracování volby uživatele. 
K tomu slouží metoda `zobrazitMenu()` pro zobrazení menu a metoda `zpracovatVolbu()` pro zpracování volby a provedení příslušné operace.
