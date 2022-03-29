import java.util.List;

public interface AdresDAO {

    boolean save(Adres adres);
    boolean update(Adres Adres);
    boolean delete(Adres Adres);
    Adres FindByReiziger(Reiziger reiziger);
    List <Adres> findAll();
    Adres findById(int id);

}
