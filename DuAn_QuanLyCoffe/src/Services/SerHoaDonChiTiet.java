/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Repository.Impl.SanPhamRepoImpl;
import Repository.Impl.ChiTietGiamGiaRepoImpl;
import Repository.Impl.GiamGiaRepoImpl;
import Repository.Impl.DonViSanPhamRepoImpl;
import Model.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import View.HoadonchitietJDialog;
import Repository.Impl.HoadonchitietRepoImpl;
import Model.DonViSanPham;
import Model.GiamGiaChiTiet;
import Model.Hoadon;
import Model.SanPham;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author ADMIN ASUS
 */
public class SerHoaDonChiTiet {
    Locale vn = new Locale("vi", "VN");
     HoadonchitietRepoImpl dao=new HoadonchitietRepoImpl();
     GiamGiaRepoImpl DAOGG = new GiamGiaRepoImpl();
    ChiTietGiamGiaRepoImpl DAOGGCT = new ChiTietGiamGiaRepoImpl();
      public void filltotablehoadonchitiet(int a){
       List<HoaDonChiTiet> list = new ArrayList<>();
        DefaultTableModel model=(DefaultTableModel) HoadonchitietJDialog.tblHoaDonChiTiet.getModel();
        model.setRowCount(0);
        try {
          list= dao.selectById1(a);
           for (HoaDonChiTiet hd : list) {
//               hd.setGia(GiaTheoSize(hd.getID_SanPHam()));
//               hd.setTongGia(hd.getGia() * hd.getSoluong());
                model.addRow(new Object[]{
                    hd.getID_Hoadon(),
                    hd.getID_SanPHam(),
                    hd.getSoluong(),
//                    GiaTheoSize(hd.getID_SanPHam()),
//                    GiaTheoSize(hd.getID_SanPHam()) * hd.getSoluong(),
                    NumberFormat.getInstance().format(hd.getGia()),
                    NumberFormat.getInstance().format(hd.getTongGia()* hd.getSoluong()),
                    hd.isTrangThai() ?"" : "Hủy",
                        hd.getLyDoHuy()
                    
                });
                 
            }
       } catch (Exception e) {
       }
    }
     public int GiaTheoSize(String masp){
          GiamGiaRepoImpl DAOGG = new GiamGiaRepoImpl();
          ChiTietGiamGiaRepoImpl DAOGGCT = new ChiTietGiamGiaRepoImpl();
            SanPhamRepoImpl DAOSP = new SanPhamRepoImpl();
            DonViSanPhamRepoImpl DAODVSP = new DonViSanPhamRepoImpl();
        GiamGiaChiTiet ggct = DAOGGCT.selectbyIDSP(masp);
         SanPham sp = new SanPham();
         DonViSanPham dvdu = new DonViSanPham();
        sp = DAOSP.selectID(masp);
        dvdu = DAODVSP.selectID(sp.getId_donviSP());
        int gia = sp.getGia_sp();
       System.out.println(dvdu.getThemTien());
          if(ggct == null){
               gia = sp.getGia_sp() + dvdu.getThemTien();
          }else{
              gia = SanPhamGiamGia(masp, gia) + dvdu.getThemTien();
          }
          sp.setGia_sp(gia);
          return gia;
    }
      public int SanPhamGiamGia(String masp, int gia) {
          GiamGiaChiTiet ggct = DAOGGCT.selectbyIDSP(masp);
        if (ggct == null) {
            return 0;
        }
        GiamGia gg = DAOGG.selectByIdss(ggct.getidgiamgia());
        if (gg == null) {
            return 0;
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date datenow = new Date();
            Date datekt = gg.getNgayKT();
            Date datebd = gg.getNgayBD();
            if ((datenow.before(datekt) && datenow.after(datebd)) || datenow.equals(datekt) || datenow.equals(datebd)) {
                float tiengiam = (float) gia - (((float) ggct.getPhantramgiam() / 100) * gia);
                //System.out.println((float) gia - ((float) ggct.getPhantramgiam()/100) * gia);
                int tiengiamint = (int) tiengiam;
                // System.out.println(tiengiamint);
                String a = tiengiamint + "";
                //System.out.println(a.length());
                if (a.length() == 4) {
                    int soThu1 = Integer.parseInt(a.charAt(1) + "");
                    if (soThu1 < 5) {
                        //System.out.println("heelo");
                        a = a.substring(0, 1);
                        //System.out.println(a);
                        return Integer.parseInt(a + "000");
                    } else {
                        a = a.substring(0, 1);
                        tiengiamint = Integer.parseInt(a + "000");
                        return (int) tiengiamint + 1000;
                    }
                } else if (tiengiamint == 0) {
                    return 0;
                } else {
                    System.out.println("heelosssss");
                    int soThu2 = Integer.parseInt(a.charAt(2) + "");
                    if (soThu2 < 5) {
                        a = a.substring(0, 2);
                        ;
                        return Integer.parseInt(a + "000");
                    } else {
                        a = a.substring(0, 2);
                        tiengiamint = Integer.parseInt(a + "000");
                        return (int) tiengiamint + 1000;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
