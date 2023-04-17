/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reposioty.impl;

import Model.*;
import Model.GiamGia;
import Helper.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Reposioty.GiamGiaChiTietRepository;

/**
 *
 * @author top1z
 */
public class GiamGiaChiTietRepositoryImpl implements GiamGiaChiTietRepository {

    String insert = "insert dbo.Giamgiachitiet values(?,?,?)";
    String select_All = "select * from Giamgiachitiet";
    String delete = "delete from GIAMGIACHITIET where  ID_Sanpham = ?";
    String update = "update Giamgiachitiet set Giam = ? where  ID_Sanpham = ?";
    String select_IdSP = "SELECT * FROM dbo.GiamGia JOIN dbo.Giamgiachitiet ON Giamgiachitiet.Id_GiamGia = GiamGia.Id_GiamGia WHERE ID_Sanpham = ? ORDER BY ngaykt DESC ";

    @Override
    public void insert(GiamGiaChiTiet sale) {
        SQLConlection.update(insert, sale.getidgiamgia(), sale.getidSP(), sale.getPhantramgiam());
    }

    @Override
    public void update(int phantramGiam, String idsanpham) {
        SQLConlection.update(update, phantramGiam, idsanpham);
    }

    @Override
    public void delete(String giamgia) {
        SQLConlection.update(delete, giamgia);
    }

    @Override
    public List<GiamGiaChiTiet> selectll() {
        return selectBysql(select_All);
    }

    @Override
    public GiamGiaChiTiet selectID(int id, String idsanpham) {
        String select_IdSP = "SELECT * FROM GIAMGIACHITIET WHERE ID_GIAMGIA=? and ID_SANPHAM=?";
        List<GiamGiaChiTiet> list = selectBysql(select_IdSP, id, idsanpham);
//        System.out.println(select_IdSP);
        if (list.isEmpty()) {
            return null;
        }
        System.out.println(list.get(0).getidgiamgia());
        return list.get(0);
    }

    @Override
    public List<GiamGiaChiTiet> selectBysql(String sql, Object... agrs) {
        List<GiamGiaChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = SQLConlection.query(sql, agrs);
            while (rs.next()) {
                GiamGiaChiTiet gg = new GiamGiaChiTiet();
                gg.setidgiamgia(rs.getInt("ID_GiamGia"));
                gg.setidSp(rs.getString("ID_Sanpham"));
                gg.setPhantramgiam(rs.getInt("Giam"));
                list.add(gg);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<GiamGiaChiTiet> selectbyEvent(String id) {
        String sql = "select * from GiamGiachitiet where Id_GiamGia =?";
        return selectBysql(sql, id);
    }

    //
    public GiamGiaChiTiet selectbyIDSP(String id) {
        String select_IdSP = "SELECT * FROM dbo.GiamGia JOIN dbo.Giamgiachitiet ON "
                + "Giamgiachitiet.Id_GiamGia = GiamGia.Id_GiamGia WHERE ID_Sanpham = ? ORDER BY ngaykt DESC ";
        List<GiamGiaChiTiet> list = selectBysql(select_IdSP, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public String selectIDD() {
        String sql = "select * from GIAMGIACHITIET";
        return selectBysql(sql).get(0).getidSP();
    }
    
}
