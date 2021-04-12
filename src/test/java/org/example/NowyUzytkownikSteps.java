package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class NowyUzytkownikSteps {

    @Given("Użutkownik jest na stronie formularza dodawania nowego użytkownika")
    public void użutkownikJestNaStronieFormularzaDodawaniaNowegoUżytkownika() {
        System.out.println("Jesteś na stronie formularza dodawania nowego użytkownika");
    }

    @When("Wprowadzamy poprawne dane do formularza.")
    public void wprowadzamyPoprawneDaneDoFormularza(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        System.out.println("imie: " + data.get("imie"));
        System.out.println("nazwisko: " + data.get("nazwisko"));
        System.out.println("miasto: " + data.get("miasto"));
        System.out.println("ulica: " + data.get("ulica"));
    }

    @Then("Informacja o dodaniu użytkownika pojawia się na ekranie.")
    public void informacjaODodaniuUżytkownikaPojawiaSięNaEkranie() {
        System.out.println("Dodano nowego użytkownika");
    }
}
