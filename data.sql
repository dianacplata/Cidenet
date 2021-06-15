/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  OlartePlata
 * Created: 13/06/2021
 */

DROP TABLE IF EXISTS empleado;
DROP TABLE IF EXISTS pais;
DROP TABLE IF EXISTS tipo_documento;
DROP TABLE IF EXISTS area;
 
CREATE TABLE empleado (
  id LONG AUTO_INCREMENT PRIMARY KEY,
  numero_identificacion VARCHAR(20) NOT NULL UNIQUE,
  primer_nombre VARCHAR(20) NOT NULL,
  otros_nombres VARCHAR(50) NULL,
  primer_apellido VARCHAR(20) NOT NULL,
  segundo_apellido VARCHAR(20) NULL,
  correo_electronico VARCHAR(300) NOT NULL UNIQUE,
  fecha_ingreso DATETIME NOT NULL,
  fecha_hora_registro DATETIME NOT NULL,
  fecha_hora_edicion DATETIME NULL,
  estado BIT NOT NULL DEFAULT 1,
  id_pais INT NOT NULL, 
  id_tipo_documento INT NOT NULL,
  id_area INT NOT NULL
);

CREATE TABLE pais (
    id LONG AUTO_INCREMENT  PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE tipo_documento (
    id LONG AUTO_INCREMENT  PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE area (
    id LONG AUTO_INCREMENT  PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL
);

ALTER TABLE empleado ADD CONSTRAINT fk_empleado_pais FOREIGN KEY (id_pais) REFERENCES pais(id); 
ALTER TABLE empleado ADD CONSTRAINT fk_empleado_tipoDocumento FOREIGN KEY (id_tipo_documento) REFERENCES tipo_documento(id);
ALTER TABLE empleado ADD CONSTRAINT fk_empleado_area FOREIGN KEY (id_area) REFERENCES area(id);