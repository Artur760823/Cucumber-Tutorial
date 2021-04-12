package org.example;

import io.cucumber.java.en.*;
import org.junit.Assert;


public class LogowanieSteps {

    private Logowanie logowanie;
    private String userName;
    private String password;

    @Given("Użytkownik jest na stronie logowania")
    public void użytkownikJestNaStronieLogowania() {
        logowanie = new Logowanie();
    }

    @And("Użytkownik klika przycisk zaloguj")
    public void użytkownikKlikaPrzyciskZaloguj() {
        System.out.println("Klikamy na przycisk logowania.");
    }

    @Then("Użytkownik zostanie zalogowany i przeniesiony do strony domowej aplikacji")
    public void użytkownikZostanieZalogowanyIPrzeniesionyDoStronyDomowejAplikacji() {
        Assert.assertTrue(logowanie.isLoggedIn());
    }

    @And("Informacja o udanym logowaniu zostanie wyświetlona")
    public void informacjaOUdanymLogowaniuZostanieWyświetlona() {
        Assert.assertTrue(logowanie.getMsg().equals("Udało Ci się zalogować") );
    }

    @But("Dane logowania są niepoprawne")
    public void daneLogowaniaSąNiepoprawne() {
        String databaseUserName = logowanie.getCurrentUsername();
        String databasePassword = logowanie.getCurrentpassword();
        Assert.assertFalse((userName.equals(databaseUserName)) && (password.equals(databasePassword)));

    }

    @Then("Użytkowonik nie zostaje zalogowany i nie zostanie przekierowany na stronę domową aplikacji")
    public void użytkowonikNieZostajeZalogowanyINieZostaniePrzekierowanyNaStronęDomowąAplikacji() {
        Assert.assertFalse(logowanie.isLoggedIn());
    }

    @And("Informacja o nieudanej próbie zalogowania zostanie wyświetlona na ekranie.")
    public void informacjaONieudanejPróbieZalogowaniaZostanieWyświetlonaNaEkranie() {
        Assert.assertTrue(logowanie.getMsg().equals("Nie udało Ci się zalogować") );
    }

    @When("Użytkownik wprowadza nazwę użytkownika {string} i hasło {string}")
    public void użytkownikWprowadzaNazwęUżytkownikaIHasło(String login, String haslo) {
        System.out.printf("Użytkownik podaje login: %s i hasło: %s\n", login, haslo);
        this.userName = login;
        this.password = haslo;
        logowanie.logIn(login, haslo);
    }

    @And("Użytkownik o nazwie {string} i hasle {string} istnieje w bazie danych")
    public void użytkownikONazwieIHasleIstniejeWBazieDanych(String login, String haslo) {
        logowanie.setUserInDatabase(login, haslo);
    }
}
