package Services;

import Repository.Impl.NhanVienRepoImpl;
import Model.NhanVien;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SerNhanVien {

    NhanVienRepoImpl dao = new NhanVienRepoImpl();

    public void insert(NhanVien nv) {
        dao.insert(nv);//thằng này thao tác với SQL
    }

    public void update(NhanVien nv) {
        dao.update(nv);
    }

    public void delete(NhanVien nv) {
        dao.delete(nv.getId_Nhanvien());
    }

    private boolean checkSame(JTextField txtMaNV) {
        if (dao.selectById(txtMaNV.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã nhân viên");
            return false;
        }
    }

    private boolean checkSameAccount(JTextField txtTaikhoan) {
        if (dao.selectByAccount(txtTaikhoan.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng tài khoản nhân viên");
            return false;
        }
    }
}
