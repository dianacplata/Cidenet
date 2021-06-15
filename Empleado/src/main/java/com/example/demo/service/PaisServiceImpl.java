/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Pais;
import com.example.demo.entity.dao.IPaisDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author OlartePlata
 */
@Service
public class PaisServiceImpl implements IPaisService {
    
    @Autowired
    private IPaisDao paisDao;

    @Override
    public List<Pais> findAll() {
        return (List<Pais>) paisDao.findAll();
    }
}
