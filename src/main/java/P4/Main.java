package P4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static Connection connection = null;

    public static void main(String[] args ) throws SQLException {
        getConnection();
        OVChipkaartDAOPsql OvDao = new OVChipkaartDAOPsql(connection) ;
        testOVChipkaartDAOPsql(OvDao);
        closeConnection();
    }

    private static Connection getConnection() throws SQLException {
        if (connection == null) {
            String database = "ovchip";
            String username = "postgres";
            String pass = "";
            String url =
                    "jdbc:postgresql://localhost/ovchip?user=postgres&password=iamlegend3";
            connection = DriverManager.getConnection(url);
        }
        return connection;
    }

    private static void closeConnection() throws
            SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

    private static void testOVChipkaartDAOPsql(OVChipkaartDAOPsql OvDao){

     //  Ovchipkaart OvKaart = new Ovchipkaart(12345,java.sql.Date.valueOf("2022-2-14"),1,25.00,1);


    }




}
