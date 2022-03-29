import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ReizigerDAOPsql extends Reiziger implements ReizigerDAO {
    private Connection conn;
    private ReizigerDAO rdao;
    private AdresDAO adao ;
    private AdresDAOPsql adresDAOPsql;

    public ReizigerDAOPsql(Connection conn){
        super();
        this.conn = conn;}


    @Override
    public boolean save(Reiziger reiziger) {

        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO Reiziger (reiziger_id, voorletters, tussenvoegsel, achternaam, geboortedatum) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, reiziger.getId());
            statement.setString(2, reiziger.getVoorletter());
            statement.setString(3, reiziger.getTussenvoegsel());
            statement.setString(4, reiziger.getAchternaam());
            statement.setDate(5, reiziger.getGeboortedatum());


            statement.executeUpdate();

            statement.close();
            if(this.adao != null){
                this.adao.save(reiziger.getAdres());
            }
            return true;
        } catch (SQLException throwables) {
            System.err.println("SQLException: " + throwables.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Reiziger reiziger) {


        return false;
    }

    @Override
    public boolean delete(Reiziger reiziger) {
        return false;
    }

    @Override
    public List<Reiziger> findByGbdatum(String datum) {
        return null;
    }

    @Override
    public Reiziger findById(int id) {
        return null;
    }
}
