/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.dao;

import com.example.demo.entity.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author OlartePlata
 */
public interface IEmpleadoDao extends PagingAndSortingRepository<Empleado, Long>  {
    
    @Query("select e from Empleado e where e.correoElectronico like ?1")
    public List<Empleado> findByCorreoElectronico(String correoElectronico);
    
    @Query("select e from Empleado e where e.numeroIdentificacion = ?1")
    public List<Empleado> findByIdentificacion(String documento);    
}
