/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reopsitory;

import hibernateConfig.HibernateConfig;
import java.util.List;
import model.SinhVien;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public List<SinhVien> getListSinhVien() {
        Query q = session.createQuery("From SinhVien");// truy vấn trên entity(HQL)
        List<SinhVien> list = q.getResultList();
        return list;
    }

}
