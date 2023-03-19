/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.GiamGia;
import repository.GiamGiaRepository;
import repository.impl.GiamGiaRepoImpl;

/**
 *
 * @author User1
 */
public class SerGiamGia {
        GiamGiaRepository dao = new GiamGiaRepoImpl();
         public void insert(GiamGia gg) {
        dao.insert(gg);
    }

    public void update(GiamGia gg) {
        dao.update(gg);
    }

    public void delete(GiamGia gg) {
//        dao.delete(gg.getId_GiamGia());
    }
}
