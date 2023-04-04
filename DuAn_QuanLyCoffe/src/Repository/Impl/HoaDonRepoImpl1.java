package Repository.Impl;

import Connect.DBConnections;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Repository.HoaDonRepository;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author lilyp
 */
public class HoaDonRepoImpl1 implements HoaDonRepository {

    @Override
    public boolean insert(HoaDon hd) {
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            String sql = "insert into hoadon values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hd.getIdHoaDon());
            ps.setString(2, hd.getIdNhanVien());
            ps.setDate(3, (Date) hd.getNgayTao());
            ps.setInt(4, 0);
            ps.setInt(5, 0);
            ps.setString(6, hd.getGhiChu());
            ps.setString(7, hd.getSDT());
            ps.setString(8, hd.getTen());
            ps.setString(9, hd.getDiaChi());
            ps.setInt(10, hd.getTienShip());
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
                hd.setIdNhanVien(rs.getString(2));
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

    public String getName(String idnv) {
        try {
            String sql = "select tennv from nhanvien where id_nhanvien = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idnv);
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
                hd.setIdNhanVien(rs.getString(2));
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

    public HoaDon findOne(String mahd) {
        try {
            String sql = "select * from hoadon where id_hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mahd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHoaDon(rs.getInt(1));
                hd.setIdNhanVien(rs.getString(2));
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
                return hd;
            }
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean updateTrangthai(String idhd, int trangthai) {
        try {
            String sql = "update dbo.HoaDon set Trangthai = ? where ID_Hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, trangthai);
            ps.setString(2, idhd);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateThanhTien(int idhd, int tt) {
        try {
            String sql = "update dbo.HoaDon set Thanhtien = ? where ID_Hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tt);
            ps.setInt(2, idhd);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateLyDoHuy(String idhd) {
        try {
            String sql = "update dbo.HoaDon set Lydohuy = ? where ID_Hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idhd);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateslsphuy(int idhd, int sl) {
        try {
            String sql = "update dbo.HoaDon set Soluongsanphamhuy = ? where ID_Hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setInt(2, idhd);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateTttt(int idhd,int tt) {
        try {
            String sql = "update dbo.HoaDon set TTThanhtoan = ? where ID_Hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tt);
            ps.setInt(2, idhd);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    
    public ArrayList<HoaDonChiTiet> gethdct(String idhd){
    try {
        ArrayList<HoaDonChiTiet> list = new ArrayList<>();
            String sql = "select * from hoadonchitiet where id_hoadon = ?";
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idhd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setID_Hoadon(rs.getInt(1));
                hdct.setID_SanPHam(rs.getString(2));
                hdct.setSoluong(rs.getInt(3));
                hdct.setTrangThai(rs.getBoolean(3));
                hdct.setGhiChu(rs.getString(4));
                list.add(hdct);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<HoaDon> getctt(int a){
        String sql = "select * from HoaDon join BanChiTiet on BanChiTiet.ID_Hoadon = HoaDon.ID_Hoadon where TTThanhtoan = 0 and HoaDon.Trangthai = 1 and ID_Ban = ? ";
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHoaDon(rs.getInt(1));
                hd.setIdNhanVien(rs.getString(2));
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
    
    public ArrayList<HoaDon> getallctt(){
        String sql = "select * from dbo.HoaDon where Trangthai = 1 and TTThanhtoan = 0";
        try {
            ArrayList<HoaDon> list = new ArrayList<>();
            Connection conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHoaDon(rs.getInt(1));
                hd.setIdNhanVien(rs.getString(2));
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
