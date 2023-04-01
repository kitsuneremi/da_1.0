/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Model.HoaDon;
import Repository.Impl.HoaDonRepoImpl1;
import View.HoadonchitietJDialog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLyHoaDon extends javax.swing.JPanel {

    HoaDonRepoImpl1 repo = new HoaDonRepoImpl1();

    /**
     * Creates new form QuanLyHoaDon
     */
    public QuanLyHoaDon() {
        initComponents();
//        loadHoaDon(repo.getlist());
//        loadHoaDonHuy(repo.getlist());
    }

    void loadHoaDon(ArrayList<HoaDon> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblHoaDon.getModel();
        dtm.setRowCount(0);
        for (HoaDon hoaDon : list) {
            if (hoaDon.isTrangThai() == true) {
                Object[] rowData = {
                    hoaDon.getIdHoaDon(),
                    hoaDon.getNgayTao(),
                    hoaDon.isTrangThaiTT() == true ? "đã" : "chưa",
                    repo.getName(hoaDon.getIdNhanVien()),
                    hoaDon.getThanhTien(),
                    hoaDon.getSDT()
                };
                dtm.addRow(rowData);
            }
        }
    }

    void loadHoaDonHuy(ArrayList<HoaDon> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblHoaDonHuy.getModel();
        dtm.setRowCount(0);
        for (HoaDon hoaDon : list) {
            if (hoaDon.isTrangThai() == false) {
                Object[] rowData = {
                    hoaDon.getIdHoaDon(),
                    hoaDon.getNgayTao(),
                    hoaDon.isTrangThaiTT() == true ? "đã" : "chưa",
                    repo.getName(hoaDon.getIdNhanVien()),
                    hoaDon.getThanhTien(),
                    hoaDon.getLyDoHuy(),
                    hoaDon.getSDT()
                };
                dtm.addRow(rowData);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoaDonHuy = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Jdatebatdau = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsearchmahoadon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jdateketthuc = new com.toedter.calendar.JDateChooser();
        btnTim = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtsearchmanv = new javax.swing.JTextField();
        btn_lammoi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rdoda = new javax.swing.JRadioButton();
        rdochua = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Tạo", "TT Thanh Toán", "Người Tạo", "Thành Tiền", "SĐT"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn hủy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblHoaDonHuy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Tạo", "Thanh Toán", "Người Tạo", "Thành Tiền", "Lý Do Hủy", "SDT"
            }
        ));
        tblHoaDonHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonHuyMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblHoaDonHuy);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Từ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã hóa đơn");

        txtsearchmahoadon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchmahoadonKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("đến");

        btnTim.setBackground(new java.awt.Color(255, 204, 204));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã Nhân Viên");

        txtsearchmanv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchmanvKeyReleased(evt);
            }
        });

        btn_lammoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_lammoi.setText("Làm Mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        jLabel5.setText("trạng thái");

        buttonGroup1.add(rdoda);
        rdoda.setText("đã thanh toán");

        buttonGroup1.add(rdochua);
        rdochua.setText("chưa thanh toán");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(Jdatebatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(Jdateketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnTim))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtsearchmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_lammoi))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsearchmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(rdoda)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdochua)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(Jdatebatdau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jdateketthuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnTim))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsearchmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lammoi))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoda)
                    .addComponent(rdochua))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setText("hủy đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1254, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        try {
            ArrayList<HoaDon> list = repo.getlist();
            ArrayList<HoaDon> newlist = new ArrayList<>();
            String sql = "";
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
            inputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
            String st = "";
            String en = "";
            try {
                st = sdf.format(inputFormat.parse(String.valueOf(Jdatebatdau.getDate())));

            } catch (ParseException ex) {

            }
            try {
                en = sdf.format(inputFormat.parse(String.valueOf(Jdateketthuc.getDate())));

            } catch (ParseException ex) {
                en = sdf.format(inputFormat.parse(String.valueOf(new Date())));
            }
            System.out.println(en);
            String mahd = txtsearchmahoadon.getText();
            String manv = txtsearchmanv.getText();
            int t = 0;
            if (rdochua.isSelected()) {
                t = 0;
            } else if (rdoda.isSelected()) {
                t = 1;
            } else {
                t = 2;
            }
            if (!"".equals(st)) {
                if ("".equals(mahd)) {
                    if ("".equals(manv)) {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where ttthanhtoan = 0 and ngaytao >" + st;
                            case 1 ->
                                "select * from hoadon where ttthanhtoan = 1 and ngaytao >" + st;
                            default ->
                                "select * from hoadon where ngaytao >" + st;
                        };
                    } else {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where ttthanhtoan = 0 and id_nhanvien =" + manv + " and ngaytao >" + st;
                            case 1 ->
                                "select * from hoadon where ttthanhtoan = 1 and id_nhanvien =" + manv + " and ngaytao >" + st;
                            default ->
                                "select * from hoadon where id_nhanvien =" + manv + " and ngaytao >" + st;
                        };
                    }
                } else {
                    if ("".equals(manv)) {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where ngaytao >" + st + " and ttthanhtoan = 0";
                            case 1 ->
                                "select * from hoadon where ngaytao >" + st + " and ttthanhtoan = 1";
                            default ->
                                "select * from hoadon where ngaytao >" + st;
                        };
                    } else {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where id_hoadon = " + mahd + " ngaytao >" + st + " and ttthanhtoan = 0 and manv =" + manv;
                            case 1 ->
                                "select * from hoadon where id_hoadon = " + mahd + " ngaytao >" + st + " and ttthanhtoan = 1 and manv =" + manv;
                            default ->
                                "select * from hoadon where id_hoadon = " + mahd + " ngaytao >" + st + " and manv =" + manv;
                        };
                    }
                }
            } else {
                if ("".equals(mahd)) {
                    if ("".equals(manv)) {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where ttthanhtoan = 0";
                            case 1 ->
                                "select * from hoadon where ttthanhtoan = 1";
                            default ->
                                "select * from hoadon";
                        };
                    } else {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon hoadon where ttthanhtoan = 0 and id_nhanvien = " + manv;
                            case 1 ->
                                "select * from hoadon hoadon where ttthanhtoan = 1 and id_nhanvien = " + manv;
                            default ->
                                "select * from hoadon where id_nhanvien = " + manv;
                        };
                    }
                } else {
                    if ("".equals(manv)) {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon where ttthanhtoan = 0 and id_hoadon = " + mahd;
                            case 1 ->
                                "select * from hoadon where ttthanhtoan = 1 and id_hoadon = " + mahd;
                            default ->
                                "select * from hoadon where id_hoadon = " + mahd;
                        };
                    } else {
                        sql = switch (t) {
                            case 0 ->
                                "select * from hoadon hoadon where ttthanhtoan = 0 and id_nhanvien = " + manv + " and id_hoadon = " + mahd;
                            case 1 ->
                                "select * from hoadon hoadon where ttthanhtoan = 1 and id_nhanvien = " + manv + " and id_hoadon = " + mahd;
                            default ->
                                "select * from hoadon hoadon where id_nhanvien = " + manv + " and id_hoadon = " + mahd;
                        };
                    }
                }
            }

            System.out.println(sql);
            ArrayList<HoaDon> listx = repo.search(sql);
            loadHoaDon(listx);
            loadHoaDonHuy(listx);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnTimActionPerformed

    private void txtsearchmanvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchmanvKeyReleased
    }//GEN-LAST:event_txtsearchmanvKeyReleased

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        loadHoaDon(repo.getlist());
        loadHoaDonHuy(repo.getlist());
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void txtsearchmahoadonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchmahoadonKeyReleased

    }//GEN-LAST:event_txtsearchmahoadonKeyReleased

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int row = tblHoaDon.getSelectedRow();
//        HoaDon hdx = repo.findOne(tblHoaDon.getValueAt(row, 0).toString());
//        System.out.println(hdx.getTen());
        HoadonchitietJDialog hd = new HoadonchitietJDialog(tblHoaDon.getValueAt(row, 0).toString());
        hd.setVisible(true);
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblHoaDonHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonHuyMouseClicked
        int row = tblHoaDon.getSelectedRow();
        HoadonchitietJDialog hd = new HoadonchitietJDialog(tblHoaDon.getValueAt(row, 0).toString());
        hd.setVisible(true);
    }//GEN-LAST:event_tblHoaDonHuyMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblHoaDon.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "bạn chưa chọn hóa đơn nào");
            return;
        } else {
            HoaDon hd = repo.findOne(tblHoaDon.getValueAt(row, 0).toString());
            repo.updateTttt(Integer.parseInt(tblHoaDon.getValueAt(row, 0).toString()), 0);
            JOptionPane.showMessageDialog(this, "đã hủy đơn");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser Jdatebatdau;
    public static com.toedter.calendar.JDateChooser Jdateketthuc;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rdochua;
    private javax.swing.JRadioButton rdoda;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblHoaDonHuy;
    private javax.swing.JTextField txtsearchmahoadon;
    private javax.swing.JTextField txtsearchmanv;
    // End of variables declaration//GEN-END:variables
}
