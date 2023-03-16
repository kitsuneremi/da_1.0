/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Ban;

/**
 *
 * @author DELL
 */
public interface BanRepository {
    abstract public void insert(Ban Entity);

    abstract public void update(Ban Entity);
    
    abstract public void updateTrangThai(int id);
    
    abstract public void updateHoatDong(int id);

    abstract public void deleteTRangThai(int id);
    
    abstract public void deleteHoatDong(int id);
    
    abstract public void delete(int id);

    abstract public Ban selectById(int id);
    
    abstract public List<Ban> selectByIdcheck(int id);
    
    abstract public List<Ban> selectAll();
    
    abstract public List<Ban> selectAll_banthuc();

    abstract public List<Ban> selectBySql(String sql, Object... args);
}
