Feature: Dodawanie użytkownika

  Scenario Outline: Dodawanie użytkownika z poprawnymi danymi

    Given Użutkownik jest na stronie formularza dodawania nowego użytkownika

    When Wprowadzamy poprawne dane do formularza
      | imie     | <imie>   |
      | nazwisko | <nazwisko>|
      | miasto   | <miasto> |
      | ulica    | <ulica>   |

    Then Informacja o dodaniu użytkownika pojawia się na ekranie

    Examples:
      |imie  | nazwisko|miasto|ulica|
      |Tomasz|Kot      |Warszawa|Bracka|
      |Jan   |Kowalski |Wrocław |wrocławska|
