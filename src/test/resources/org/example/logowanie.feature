Feature: Logowanie do aplikacji
  W tym pliku będziemy testować logowanie użytkownika
  do aplikacji. Sekcja ta jest traktowana jako opis
  i nie wpływa na wykonanie testu.

  Scenario: Użytkownik podaje poprawne dane
    #given jest warunkiem wstępnym do przeprowadzenia testu
    Given Użytkownik jest na stronie logowania
    And Użytkownik o nazwie "login1" i hasle "haslo" istnieje w bazie danych

    #when określa akcję, która zostanie wykonana
    When Użytkownik wprowadza nazwę użytkownika "login1" i hasło "haslo"

    #and opisuje dodatkową akcję lub warunek
    And Użytkownik klika przycisk zaloguj

    #then opisuje oczekiwane rezultaty (wynik poprzednich kroków)
    Then Użytkownik zostanie zalogowany i przeniesiony do strony domowej aplikacji
    #Opisuje dodtkowy oczekiwany rezultat
    And Informacja o udanym logowaniu zostanie wyświetlona



  Scenario: Użytkownik podaje błędne hasło
    Given Użytkownik jest na stronie logowania
    And Użytkownik o nazwie "login2" i hasle "haslo" istnieje w bazie danych
    When Użytkownik wprowadza nazwę użytkownika "login2" i hasło "zlehaslo"
    And Użytkownik klika przycisk zaloguj
    #but umożliwia dodanie negatywnego komentarza, używany do negatywnych warunków
    But Dane logowania są niepoprawne
    Then Użytkowonik nie zostaje zalogowany i nie zostanie przekierowany na stronę domową aplikacji
    And Informacja o nieudanej próbie zalogowania zostanie wyświetlona na ekranie.




