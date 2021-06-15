/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Empleado;
import com.example.demo.entity.dao.IEmpleadoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OlartePlata
 */
@Service
public class EmpleadoServiceImpl  implements IEmpleadoService {
    
    @Autowired
    private IEmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findOne(Long id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        empleadoDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findByCorreoElectronico(String correoElectronico) {
        return empleadoDao.findByCorreoElectronico(correoElectronico + "%");
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findByIdentificacion(String documento) {
        return empleadoDao.findByIdentificacion(documento);
    }

   
}
