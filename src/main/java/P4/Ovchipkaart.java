package P4;

import java.sql.Date;
import java.util.ArrayList;

//many ..
public class Ovchipkaart {
    private int Kaart_nummer;
    private Date Geldig_tot;
    private byte Klasse ;
    private double Saldo;

    private Reiziger reiziger_id;

    public Ovchipkaart(int kaart_nummer, Date geldig_tot, byte klasse, double saldo, Reiziger reiziger_id) {
        Kaart_nummer = kaart_nummer;
        Geldig_tot = geldig_tot;
        Klasse = klasse;
        Saldo = saldo;
        this.reiziger_id = reiziger_id;
    }

    public int getKaart_nummer() {
        return Kaart_nummer;
    }

    public Date getGeldig_tot() {
        return Geldig_tot;
    }

    public byte getKlasse() {
        return Klasse;
    }

    public double getSaldo() {
        return Saldo;
    }

    public Reiziger getReiziger_id() {
        return reiziger_id;
    }

    public void setKaart_nummer(int kaart_nummer) {
        Kaart_nummer = kaart_nummer;
    }

    public void setGeldig_tot(Date geldig_tot) {
        Geldig_tot = geldig_tot;
    }

    public void setKlasse(byte klasse) {
        Klasse = klasse;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public void setReiziger_id(Reiziger reiziger_id) {
        this.reiziger_id = reiziger_id;
    }
}
