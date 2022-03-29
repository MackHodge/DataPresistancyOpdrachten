import java.util.List;

public interface ReizigerDAO {

    boolean save(Reiziger reiziger);
    boolean update(Reiziger reiziger);
    boolean delete(Reiziger reiziger);

    List<Reiziger> findByGbdatum(String datum);
    Reiziger findById(int id);
    }
