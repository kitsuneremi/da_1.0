/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.HoaDon;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public interface RepoHoadon {
    abstract public void insert(HoaDon Entity);

    abstract public void updateThanhToan(HoaDon Entity);
    
    abstract public void updateTrangThai(HoaDon Entity);
    
    abstract public void updateThanhtien(HoaDon Entity);
    
    abstract public void updateLydohuy(HoaDon Entity);
    
    abstract public void updateSLSPHUY(HoaDon Entity);

    abstract public void delete(HoaDon Entity);

    abstract public HoaDon selectById(int id);
    
    abstract public List<HoaDon> selectAll();
    abstract public List<HoaDon> selectAll_trangthai1();

    abstract public List<HoaDon> selectAll_trangthai0();

    abstract public List<HoaDon> selectAll_SQL_Find_HoatDong(Date a, Date b);

    abstract public List<HoaDon> selectAll_SQL_Find_HoatDong_keyword(String keyword);

    abstract public List<HoaDon> select_all_sql_find_HoatDong_keyword_IDMaNV(String keyword);

    abstract public List<HoaDon> select_all_sql_find_KoHoatDong_keyword_IDMaNV(String keyword);

    abstract public List<HoaDon> selectAll_SQL_Find_koHoatDong_keyword(String keyword);

    abstract public List<HoaDon> selectAll_SQL_Find_KoHoatDong(Date a, Date b);

    abstract public List<HoaDon> selectAll_SQL_Find_HoatDong_1ngay(Date a);

    abstract public List<HoaDon> selectAll_SQL_Find_KoHoatDong_1ngay(Date a);

    abstract public List<HoaDon> selectBySql(String sql, Object... args);
}
