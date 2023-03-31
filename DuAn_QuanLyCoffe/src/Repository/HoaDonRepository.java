/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author lilyp
 */
public interface HoaDonRepository {
    public boolean insert(HoaDon hd);
    public boolean update(HoaDon hd);
    public ArrayList<HoaDon> getlist();
    public ArrayList<HoaDon> getlistcanceled();
}
