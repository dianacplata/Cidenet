INSERT INTO area (nombre) VALUES ('Administracion');
INSERT INTO area (nombre) VALUES ('Financiera');
INSERT INTO area (nombre) VALUES ('Compras');
INSERT INTO area (nombre) VALUES ('Infraestructura');
INSERT INTO area (nombre) VALUES ('Operacion');
INSERT INTO area (nombre) VALUES ('Talento Humano');
INSERT INTO area (nombre) VALUES ('Servicios Varios');

INSERT INTO pais (nombre) VALUES ('Colombia');
INSERT INTO pais (nombre) VALUES ('Estados Unidos');

INSERT INTO tipo_documento (nombre) VALUES ('Cedula de Ciudadania');
INSERT INTO tipo_documento (nombre) VALUES ('Cedula Extranjeria');
INSERT INTO tipo_documento (nombre) VALUES ('Pasaporte');
INSERT INTO tipo_documento (nombre) VALUES ('Permiso Especial');

INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('1098641387','Jaime', 'Andres Alberto', 'Olarte', 'Fuentes', 'jaime.olarte@cidenet.com.co', '2021-06-03', '2021-06-13 12:42:00', NULL, 1, 1, 1, 1);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('37861816','Diana', 'Cecilia', 'Plata', 'Tellez', 'diana.plata@cidenet.com.co', '2021-06-10 10:30:00', '2021-06-13 12:42:00', NULL, 1, 1, 1, 2);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('8768767','Ana', 'Paula', 'Olarte', 'Plata', 'ana.olarte@cidenet.com.co', '2021-06-10', '2021-06-13 12:42:00', NULL, 1, 1, 1, 7);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('A123456','Andres', NULL, 'Guzman', 'Pepito', 'andres.guzman@cidenet.com.co', '2021-06-04 10:30:00', '2021-06-13 12:42:00', NULL, 1, 1, 1, 3);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('B123456','Jane', NULL, 'Doe', NULL, 'jane.doe@cidenet.com.us', '2021-06-05 10:31:00', '2021-06-13 12:42:00', NULL, 1, 2, 2, 4);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('C234234234','Johnny', NULL, 'Doe', NULL, 'johnny.doe@cidenet.com.us', '2021-06-05', '2021-06-13 12:42:00', NULL, 1, 2, 2, 5);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('D234234234','Phillip', NULL, 'Webb', NULL, 'phillip.webb@cidenet.com.us', '2021-06-06', '2021-06-13 12:42:00', NULL, 1, 2, 2, 6);
INSERT INTO empleado (numero_identificacion, primer_nombre, otros_nombres, primer_apellido,segundo_apellido, correo_electronico, fecha_ingreso,fecha_hora_registro, fecha_hora_edicion, estado, id_pais, id_tipo_documento, id_area) VALUES ('H325234234','Richard', 'Andres Alberto', 'Vlissides', 'Lee', 'jaimeolartef@cidenet.com.us', '2021-06-08', '2021-06-13 12:42:00', NULL, 1, 2, 2, 7);