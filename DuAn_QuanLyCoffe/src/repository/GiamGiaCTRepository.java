/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import Model.GiamGiaChiTiet;
import java.util.List;

/**
 *
 * @author User1
 */
public interface GiamGiaCTRepository {
    abstract public void insert(GiamGiaChiTiet sale);
    abstract public void update(int phantramGiam,String idsanpham);
    abstract public void delete(String id);
    abstract public List<GiamGiaChiTiet> selectll();
    abstract public GiamGiaChiTiet selectID(int id, String idsanpham);
    abstract public List<GiamGiaChiTiet> selectBysql(String sql, Object...agrs);
}
