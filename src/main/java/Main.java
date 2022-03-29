import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static Connection connection = null;

    public static void main(String[] args ) throws SQLException {
        getConnection();
      AdresDAOPsql adresDAOPsql = new AdresDAOPsql(connection);
      ReizigerDAOPsql reizigerDAOPsql = new ReizigerDAOPsql(connection);
      testAdresDAO(adresDAOPsql ,reizigerDAOPsql );

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

    public static void testAdresDAO (AdresDAO AdresDAO , ReizigerDAO rDao){
        System.out.println("\n---------- AdresDAO -------------");
        System.out.println("Save test");
        //test Save
        Reiziger R1 = new Reiziger(9 , "test3" , "tt3" , "doge3",java.sql.Date.valueOf("2022-2-14"));
        Adres A1 = new Adres(8 ,"1234DA","267","Riderkerk","Rotterdam" );


        rDao.save(R1);
        AdresDAO.save(A1);


        System.out.println("Update test");
        //test update
        Adres A2 = new Adres(3,"","267","","");
        AdresDAO.update(A2);

        //Delete
        System.out.println("Delete test");
        Adres A3 = new Adres(4,"","267","","");
        AdresDAO.delete(A3);


        //Find By Id
        System.out.println("Find By Id test");
        AdresDAO.findById(5);







    }
}
