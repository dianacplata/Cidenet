/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.controllers;

import com.example.demo.entity.Area;
import com.example.demo.entity.Empleado;
import com.example.demo.entity.Pais;
import com.example.demo.entity.TipoDocumento;
import com.example.demo.service.IAreaService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IPaisService;
import com.example.demo.service.ITipoDocumentoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author OlartePlata
 */
@RestController
@SessionAttributes("empleado")
@RequestMapping("/empleado")
public class EmpleadoController {

    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IPaisService paisService;

    @Autowired
    private IAreaService areaService;

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    @RequestMapping(value = {"/listar"}, method = RequestMethod.GET)
    public String listar() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Empleado> empleados = empleadoService.findAll();
        return objectMapper.writeValueAsString(empleados);
    }

    @RequestMapping(value = {"/listarpaises"}, method = RequestMethod.GET)
    public String listarPais() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Pais> paises = paisService.findAll();
        return objectMapper.writeValueAsString(paises);
    }

    @RequestMapping(value = {"/listarareas"}, method = RequestMethod.GET)
    public String listarArea() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Area> areas = areaService.findAll();
        return objectMapper.writeValueAsString(areas);
    }

    @RequestMapping(value = {"/listartipodocumentos"}, method = RequestMethod.GET)
    public String listarTipoDocumento() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<TipoDocumento> tipoDocumentos = tipoDocumentoService.findAll();
        return objectMapper.writeValueAsString(tipoDocumentos);
    }
    
    @RequestMapping(value = {"/consultar/{id}"}, method = RequestMethod.GET)
    public ResponseEntity<Empleado> consultarId(@PathVariable(value = "id") String empleadoId) {
        try {
            Long id = Long.parseLong(empleadoId);
            Empleado empleado = empleadoService.findOne(id);

            if (empleado == null) {
                return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
            }
            
            return ResponseEntity.ok(empleado);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
    
    @RequestMapping(value = {"/correo/{correo}"}, method = RequestMethod.GET)
    public String consultarEmpleados(@PathVariable(value = "correo") String correo) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Empleado> empleados = empleadoService.findByCorreoElectronico(correo);
        return objectMapper.writeValueAsString(empleados);
    }
    
    @RequestMapping(value = {"/consultardocumento/{documento}"}, method = RequestMethod.GET)
    public String consultarIdentificacion(@PathVariable(value = "documento") String documento) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Empleado> empleados = empleadoService.findByIdentificacion(documento);
        return objectMapper.writeValueAsString(empleados);
    }
    
    @RequestMapping(method = RequestMethod.POST, path = "/guardar")
    public ResponseEntity<Empleado> guardar(@RequestBody Empleado empleado) {
        try {
            empleadoService.save(empleado);
            return ResponseEntity.ok(empleado);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/modificar")
    public ResponseEntity<Empleado> modificar(@RequestBody Empleado empleado) {
        try {
            Long id = empleado.getId().longValue();
            Empleado empleadoFind = empleadoService.findOne(id);

            if (empleadoFind == null) {
                return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
            }

            empleadoService.save(empleado);
            return ResponseEntity.ok(empleado);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> deleteUser(
            @PathVariable(value = "id") String empleadoId) throws Exception {
        try {
            Long id = Long.parseLong(empleadoId);
            Empleado empleadoFind = empleadoService.findOne(id);

            if (empleadoFind == null) {
                return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
            }

            empleadoService.delete(id);
            return ResponseEntity.ok("Se elimino correctamente");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
