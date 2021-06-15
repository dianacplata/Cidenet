/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Empleado;
import java.util.List;

/**
 *
 * @author OlartePlata
 */
public interface IEmpleadoService {

    public List<Empleado> findAll();

    public void save(Empleado empleado);

    public Empleado findOne(Long id);

    public void delete(Long id);
    
    public List<Empleado> findByCorreoElectronico(String correoElectronico);
    
    public List<Empleado> findByIdentificacion(String documento);
}
