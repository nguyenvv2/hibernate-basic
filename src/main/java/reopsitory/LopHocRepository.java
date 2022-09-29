package reopsitory;

import hibernateConfig.HibernateConfig;
import java.util.List;
import model.LopHoc;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class LopHocRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public List<LopHoc> getList() {
        Query query = session.createQuery("From LopHoc ");// truy vấn trên entity(HQL)
        List<LopHoc> list = query.getResultList();
        return list;
    }

}
