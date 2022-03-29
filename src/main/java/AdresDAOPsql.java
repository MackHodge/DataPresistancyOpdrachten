import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdresDAOPsql extends Adres implements AdresDAO{

    Connection conn;


    public AdresDAOPsql(Connection conn){
        super();
        this.conn = conn;

    }

    public boolean save(Adres adres){
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO adres (adres_id, postcode, huisnummer, straat, woonplaats, reiziger_id) VALUES (?, ?, ?, ?, ?, ?)");
            statement.setInt(1, adres.getId());
            statement.setString(2, adres.getPostcode());
            statement.setString(3, adres.getHuisnumer());
            statement.setString(4, adres.getStraat());
            statement.setString(5, adres.getWoonplaats());
            statement.setInt(6, adres.getReiziger().getId());
            // Execute the statement
            statement.executeUpdate();
            // Close the statement !!! (very important)
            statement.close();
            return true;
        } catch (SQLException throwables) {
            System.err.println("SQLException: " + throwables.getMessage());
        }
        return false;
    }

    public boolean update (Adres Adres){
        try{
                    PreparedStatement statement = conn.prepareStatement(
                            "UPDATE adres " +
                                    "SET woonplaats = ? " +
                                    "WHERE adres_id = ?" );
            statement.setString(1,Adres.getWoonplaats());
            statement.setInt(2,Adres.getId());
            // Execute the statement
            statement.executeUpdate();
            // Close the statement !!! (very important)
            statement.close();
            return true;

        }catch (SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return false;
    }

    public boolean delete (Adres Adres){

        try{
            PreparedStatement statement = conn.prepareStatement(
                    "DELETE FROM adres "
                            +
                            "WHERE adres_id = ?" );
            statement.setInt(1,getId());
            statement.executeUpdate();
            // Close the statement !!! (very important)
            statement.close();

        }catch (SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return false;
    }

    @Override
    public Adres FindByReiziger(Reiziger reiziger) {
        try{
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM  ");

        }catch (SQLException e){

            System.err.println("SQLException: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Adres> findAll() {
        ArrayList<Adres> adresArray = new ArrayList<Adres>();
        try {

            PreparedStatement statement = conn.prepareStatement("SELECT * FROM adres");
            ResultSet theSet = statement.executeQuery();
            // Iterate over the resultset, extract the data from each set
            // And store this data in a new Reiziger
            while (theSet.next()) {
                Adres r = new Adres();
                r.setId(theSet.getInt("adres_id"));
                r.setPostcode(theSet.getString("postcode"));
                r.setHuisnumer(theSet.getString("huisnummer"));
                r.setStraat(theSet.getString("straat"));
                r.setReiziger_id(theSet.getInt("reiziger_id"));
                // Add the new Reiziger to the list
                adresArray.add(r);
            }
            theSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }

        return null;
    }

    @Override
    public Adres findById(int id) {
        Adres a = new Adres();
        try{
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM adres WHERE adres_id = ?");

            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
           while (result.next()){
               a.setId(result.getInt("adres_id"));
               a.setPostcode(result.getString("postcode"));
               a.setHuisnumer(result.getString("huisnummer"));
               a.setStraat(result.getString("straat"));
               a.setReiziger_id(result.getInt("reiziger_id"));

           }
            statement.executeUpdate();
            statement.close();

        }catch (SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return a;
    }

    public boolean findById (Adres Adres){

        return false;
    }
    public boolean findByReiziger (Adres Adres){


        return false;
    }


}
