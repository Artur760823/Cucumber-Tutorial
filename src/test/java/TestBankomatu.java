import org.junit.Assert;
import org.junit.Test;

public class TestBankomatu {

    @Test
    public void testWplaty(){
        Bankomat atm = new Bankomat();
        atm.wplataPieniędzy(500);
        Assert.assertTrue(atm.pokazSaldo() == 500);
        atm.wplataPieniędzy(-500);
        Assert.assertTrue(atm.pokazSaldo() == 500);
    }

    @Test
    public void testWyplaty(){
        Bankomat atm = new Bankomat();
        atm.wyplataPieniedzy(500);
        Assert.assertTrue(atm.pokazSaldo() == 0);
        atm.wplataPieniędzy(500);
        Assert.assertTrue(atm.pokazSaldo() == 500);
        atm.wyplataPieniedzy(300);
        Assert.assertTrue(atm.pokazSaldo() == 200);

    }
}
