public class Bankomat {

    private int saldo;
    public void wplataPieniędzy(int wplata){
        if(wplata > 0) {
            saldo = saldo + wplata;
            System.out.println("Masz na koncie: " + saldo);
        }

    }

    public void wyplataPieniedzy(int wyplata){
        if(wyplata <= saldo) {
            saldo = saldo - wyplata;
        }else{
            System.out.println("Niewystarcająca ilosc pieniedzy na koncie. Stan konta to: " + saldo);
        }
    }

    public int pokazSaldo(){
        System.out.println("Masz na koncie: " + saldo);
        return saldo;
    }
}
