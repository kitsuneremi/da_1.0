/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Repository.Impl.BanChiTietRepoImpl;
import Repository.Impl.BanRepoImpl;
import Repository.Impl.HoaDonRepoImpl;
import Model.Ban;
import Model.BanChiTiet;
import Model.HoaDon;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HP
 */
public class ChuyenBanJDialog extends javax.swing.JDialog {
    static int idBan;
    static int idHoaDon;
    /**
     * Creates new form ChuyenBanJDialog
     */
    public ChuyenBanJDialog(java.awt.Frame parent, boolean modal, int ban, int hoaDon) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        idBan = ban;
        idHoaDon = hoaDon;
        lblban.setText(ban+"");
        filltoBan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblban = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboBan = new javax.swing.JComboBox<>();
        btnChuyen = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(116, 169, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bàn");

        lblban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblban.setForeground(new java.awt.Color(255, 255, 255));
        lblban.setText("......");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("chuyển sang");
        jLabel3.setToolTipText("");

        cboBan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnChuyen.setBackground(new java.awt.Color(255, 255, 255));
        btnChuyen.setText("Chuyển");
        btnChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblban)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(cboBan, 0, 117, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblban)
                        .addComponent(jLabel3))
                    .addComponent(cboBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChuyen)
                    .addComponent(btnHuy))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenActionPerformed
        // TODO add your handling code here:
        Ban ban = (Ban) cboBan.getSelectedItem();
        DAOBANCT.update(ban.getIdBan(), idHoaDon);
        List<BanChiTiet> listbct = DAOBANCT.selectByIdBan(idBan);
        //DAOBAN.deleteHoatDong(idBan);
            if (listbct.isEmpty()) {//nnếu không còn đơn thanh toán nào nauwx sẽ đổi trạng tahis bàn
                DAOBAN.deleteHoatDong(idBan);
            }
        DAOBAN.updateHoatDong(ban.getIdBan());
        this.dispose();
    }//GEN-LAST:event_btnChuyenActionPerformed
boolean status = true;
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        status = false;
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChuyenBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenBanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChuyenBanJDialog dialog = new ChuyenBanJDialog(new javax.swing.JFrame(), true, idBan, idHoaDon);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyen;
    private javax.swing.JButton btnHuy;
    private javax.swing.JComboBox<String> cboBan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblban;
    // End of variables declaration//GEN-END:variables
BanRepoImpl DAOBAN = new BanRepoImpl();
BanChiTietRepoImpl DAOBANCT = new BanChiTietRepoImpl();
HoaDonRepoImpl DAOhd = new HoaDonRepoImpl();
public void filltoBan(){
    DefaultComboBoxModel model = (DefaultComboBoxModel) cboBan.getModel();
    model.removeAllElements();
    List<Ban> list = DAOBAN.selectAll();
    for (Ban ban : list) {
        List<BanChiTiet> listbct = DAOBANCT.selectByIdBan(ban.getIdBan());
        if (!listbct.isEmpty()) {
            HoaDon hd = DAOhd.selectById(listbct.get(0).getID_HoaDon());
            //System.out.println(hd.getSDT());
            if (hd.getSDT() != null) {
                continue;
            }
        }
        if (ban.getIdBan() == idBan) {
            continue;
        }else{
            model.addElement(ban);
        }
    }
}
}
