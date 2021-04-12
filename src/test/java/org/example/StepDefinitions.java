package org.example;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class StepDefinitions {
    @Given("Konto z saldem 200 zł")
    public void konto_z_saldem(){
        System.out.println("Metoda given - konto z saldem");

    }
    @When("Użytkownik próbuje wypłacić 300 zł")
    public void wyplata_z_konta(){
        System.out.println("Metoda when - wyplata z konta");

    }
    @Then("Saldo nie zmienia sie i wynosi 200 zł")
    public void sprawdzenie_salda(){
        System.out.println("Metoda Then - weryfikacja salda");

    }

}
