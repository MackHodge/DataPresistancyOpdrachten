package P4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OVChipkaartDAOPsql extends Ovchipkaart implements OvchipkaartDAO {
    private Connection conn;

    public OVChipkaartDAOPsql(Connection conn) {
        this.conn = conn;
    }


    //TB
    @Override
    public boolean save(Ovchipkaart ovchipkaart) {
        try {
            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO ov_chipkaart (kaart_nummer, geldig_tot, klasse, saldo, reiziger_id) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, ovchipkaart.getKaart_nummer());
            statement.setDate(2, ovchipkaart.getGeldig_tot());
            statement.setByte(3, ovchipkaart.getKlasse());
            statement.setDouble(4, ovchipkaart.getSaldo());
            //foreign key of table a
            statement.setInt(5,ovchipkaart.getReiziger_id().getId());

            statement.executeUpdate();

            statement.close();
            return true;
        } catch (SQLException throwables) {
            System.err.println("SQLException: " + throwables.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Ovchipkaart ovchipkaart) {
        return false;
    }

    @Override
    public boolean delete(Ovchipkaart ovchipkaart) {
        return false;
    }

    @Override
    public List<Ovchipkaart> FindByReiziger(Reiziger reiziger) {
        return null;
    }
}
