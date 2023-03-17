/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.NhanVien;
import java.util.List;

/**
 *
 * @author nguye
 */
public abstract class NhanVienService {
    abstract public void insert(NhanVien Entity);

    abstract public void update(NhanVien Entity);

    abstract public void delete(String id);

    abstract public NhanVien selectById(String id);

    abstract public NhanVien selectByAccount(String account);

    abstract public List<NhanVien> selectAll();

    abstract public List<NhanVien> selectBySql(String sql, Object... args);
}
