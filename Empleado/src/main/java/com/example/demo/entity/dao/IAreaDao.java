/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.dao;

import com.example.demo.entity.Area;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author OlartePlata
 */
public interface IAreaDao extends PagingAndSortingRepository<Area, Long>{
    
}
