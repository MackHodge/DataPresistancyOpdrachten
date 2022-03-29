import java.sql.Date;

public class Reiziger  {

    private int id;
    private String voorletter;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;
//attribute associatie
    private Adres adres;

    public Reiziger(int id, String voorletter, String tussenvoegsel, String achternaam, Date geboortedatum) {
        this.id = id;
        this.voorletter = voorletter;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;

    }

    public Reiziger (){}


    public int getId() {
        return id;
    }

    public String getVoorletter() {
        return voorletter;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVoorletter(String voorletter) {
        this.voorletter = voorletter;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Reiziger{" +
                "id=" + id +
                ", voorletter='" + voorletter + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboortedatum=" + geboortedatum +
                '}';
    }
}
