/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.TipoDocumento;
import com.example.demo.entity.dao.ITipoDocumentoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author OlartePlata
 */
@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService {

    @Autowired
    private ITipoDocumentoDao tipoDocumentoDao;
    
    @Override
    public List<TipoDocumento> findAll() {
        return (List<TipoDocumento>) tipoDocumentoDao.findAll();
    }
    
}
