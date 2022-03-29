package P4;

import java.util.List;

public interface OvchipkaartDAO {
    boolean save(Ovchipkaart ovchipkaart);
    boolean update(Ovchipkaart ovchipkaart);
    boolean delete(Ovchipkaart ovchipkaart);
    List<Ovchipkaart> FindByReiziger(Reiziger reiziger);


}
