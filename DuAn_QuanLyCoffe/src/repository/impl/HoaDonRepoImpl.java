package repository.impl;

import Connect.DBConnections;
import Model.HoaDon;
import java.util.ArrayList;
import repository.HoaDonRepository;
import java.sql.*;

/**
 *
 * @author lilyp
 */
public class HoaDonRepoImpl implements HoaDonRepository {

    @Override
    public boolean insert(HoaDon hd) {
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            String sql = "insert into hoadon values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(HoaDon hd) {
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            String sql = "update hoadon set";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<HoaDon> getlist() {
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            String sql = "select ID_Hoadon, ID_Nhanvien, Ngaytao, Trangthai, TTThanhtoan, Thanhtien, Lydohuy, Soluongsanphamhuy, ghichu, sdt, ten, diachi, tenship from hoadon";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHoaDon(rs.getInt(1));
                hd.setIdNhanVien(rs.getInt(2));
                hd.setNgayTao(rs.getDate(3));
                hd.setTrangThai(rs.getBoolean(4));
                hd.setTrangThaiTT(rs.getBoolean(5));
                hd.setThanhTien(rs.getInt(6));
                hd.setLyDoHuy(rs.getString(7));
                hd.setSlSanPhamHuy(rs.getInt(8));
                hd.setGhiChu(rs.getString(9));
                hd.setSDT(rs.getString(10));
                hd.setTen(rs.getString(11));
                hd.setDiaChi(rs.getString(12));
                hd.setTienShip(rs.getInt(13));
                list.add(hd);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<HoaDon> getlistcanceled() {
        return null;
    }

    public String getName(int idnv) {
        try {
            String sql = "select tennv from nhanvien where id_nhanvien = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idnv);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<HoaDon> search(String sql) {
        ArrayList<HoaDon> list = new ArrayList<>();
        try {
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHoaDon(rs.getInt(1));
                hd.setIdNhanVien(rs.getInt(2));
                hd.setNgayTao(rs.getDate(3));
                hd.setTrangThai(rs.getBoolean(4));
                hd.setTrangThaiTT(rs.getBoolean(5));
                hd.setThanhTien(rs.getInt(6));
                hd.setLyDoHuy(rs.getString(7));
                hd.setSlSanPhamHuy(rs.getInt(8));
                hd.setGhiChu(rs.getString(9));
                hd.setSDT(rs.getString(10));
                hd.setTen(rs.getString(11));
                hd.setDiaChi(rs.getString(12));
                hd.setTienShip(rs.getInt(13));
                list.add(hd);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
