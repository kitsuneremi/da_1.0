/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.BanChiTiet;

/**
 *
 * @author DELL
 */
public interface BanChiTietRepository {
     abstract public void insert(BanChiTiet Entity);

    abstract public void update(int idban,int idHoadon);

    abstract public void delete(int id);

    abstract public BanChiTiet selectById(int idban,int idHoadon);
    
    abstract public List<BanChiTiet> selectByIdHD(int idHoadon);
    
    abstract public List<BanChiTiet> selectByIdBan(int idban);
    
    abstract public List<BanChiTiet> selectAll();
    

    abstract public List<BanChiTiet> selectBySql(String sql, Object... args);
}
