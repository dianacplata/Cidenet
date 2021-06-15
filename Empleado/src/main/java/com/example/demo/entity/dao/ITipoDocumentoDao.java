/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.dao;

import com.example.demo.entity.TipoDocumento;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author OlartePlata
 */
public interface ITipoDocumentoDao extends PagingAndSortingRepository<TipoDocumento, Long>{
    
}
