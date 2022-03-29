public class Adres {
    private int id;
    private String postcode;
    private String huisnumer;
    private String straat;
    private String woonplaats;
    private int reiziger_id;

    private Reiziger reiziger;

    public Adres(int id , String postcode, String huisnumer , String straat , String woonplaats ){
        this.id = id;
        this.postcode = postcode;
        this.huisnumer = huisnumer;
        this.straat = straat;
        this.woonplaats = woonplaats;
       // this.reiziger_id = reiziger.getId();

    }

    public Adres() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnumer() {
        return huisnumer;
    }

    public void setHuisnumer(String huisnumer) {
        this.huisnumer = huisnumer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public int getReiziger_id() {
        return reiziger_id;
    }

    public void setReiziger_id(int reiziger_id) {
        this.reiziger_id = reiziger_id;
    }

    public Reiziger getReiziger() {return reiziger;}

    public void setReiziger(Reiziger reiziger) {this.reiziger = reiziger;}

    @Override
    public String toString() {
        return "adres{" +
                "id=" + id +
                ", postcode='" + postcode + '\'' +
                ", huisnumer='" + huisnumer + '\'' +
                ", straat='" + straat + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", reiziger_id=" + reiziger_id +
                '}';
    }
}
