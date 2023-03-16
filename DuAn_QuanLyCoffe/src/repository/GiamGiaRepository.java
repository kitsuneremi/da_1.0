/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import Model.GiamGia;
import java.util.List;

/**
 *
 * @author User1
 */
public interface GiamGiaRepository {
     abstract public void insert(GiamGia Entity);

    abstract public void update(GiamGia Entity);

    abstract public void delete(String id);
    
    abstract public GiamGia selectById(String id);
    
    abstract public GiamGia selectByIdSK(String SK);
    
    abstract public List<GiamGia> selectAll();

    abstract public List<GiamGia> selectBySql(String sql, Object... args);
}

