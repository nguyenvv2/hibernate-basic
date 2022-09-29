/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.LopHoc;
import reopsitory.LopHocRepository;
import service.LopHocService;

/**
 *
 * @author nguyenvv
 */
public class LopHocServiceImpl implements LopHocService {

    private LopHocRepository lopHocRepository = new LopHocRepository();

    @Override
    public List<LopHoc> getList() {
        //xu ly logic
        return lopHocRepository.getList();
    }

}
