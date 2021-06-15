/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Area;
import com.example.demo.entity.dao.IAreaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author OlartePlata
 */
@Service
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private IAreaDao areaDao;
    
    @Override
    public List<Area> findAll() {
        return (List<Area>) areaDao.findAll();
    }
    
}
