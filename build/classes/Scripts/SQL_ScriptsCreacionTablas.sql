/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Felipe Rodriguez
 * Created: 1 sept 2025
 */

DROP DATABASE crud_java_mvc;
-- Crear base de datos si no existe
CREATE DATABASE IF NOT EXISTS crud_java_mvc;
USE crud_java_mvc;

-- Crear tabla Roles
CREATE TABLE Roles(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    PRIMARY KEY(id)
);
-- Crear tabla Persona
CREATE TABLE Persona(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(180) NOT NULL,
    apellidos VARCHAR(180) NOT NULL,
    correo VARCHAR(150) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    pais VARCHAR(180) NOT NULL,
    profesion VARCHAR(150) NOT NULL,
    rol_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (rol_id) REFERENCES Roles(id)
);
-- Insertar algunos datos de ejemplo en la tabla Roles
INSERT INTO Roles (nombre) VALUES 
('Administrador'),
('Usuario'),
('Invitado');

USE crud_java_mvc;

INSERT INTO Persona (nombre, apellidos, correo, fecha_nacimiento, pais, profesion, rol_id) VALUES
('Carlos Andrés', 'Gómez Pérez', 'carlos.gomez@gmail.com', '1985-03-15', 'México', 'Médico', 1),
('Laura Valentina', 'Martínez Ríos', 'laura.martinez@gmail.com', '1990-11-22', 'España', 'Diseñadora Gráfica', 2),
('Juan Sebastián', 'Hernández López', 'juan.hernandez@gmail.com', '1988-05-10', 'Argentina', 'Abogado', 3),
('María José', 'Ramírez Castro', 'maria.ramirez@gmail.com', '1992-08-18', 'Chile', 'Profesora', 2),
('Andrés Felipe', 'Torres Mejía', 'andres.torres@gmail.com', '1987-01-25', 'Perú', 'Arquitecto', 1),
('Valentina Andrea', 'Morales Ruiz', 'valentina.morales@gmail.com', '1995-12-03', 'Uruguay', 'Psicóloga', 2),
('Camilo Esteban', 'Vargas Silva', 'camilo.vargas@gmail.com', '1983-09-14', 'Ecuador', 'Contador', 3),
('Sofía Isabel', 'Castro Ortiz', 'sofia.castro@gmail.com', '1991-04-08', 'Bolivia', 'Veterinaria', 2),
('Mateo Julián', 'Rojas Pineda', 'mateo.rojas@gmail.com', '1986-07-21', 'Venezuela', 'Ingeniero Civil', 1),
('Isabella María', 'Mendoza Flores', 'isabella.mendoza@gmail.com', '1993-10-30', 'Paraguay', 'Nutricionista', 2),
('Santiago David', 'Cárdenas Molina', 'santiago.cardenas@gmail.com', '1984-02-17', 'Colombia', 'Fisioterapeuta', 3),
('Valeria Nicole', 'Peña Herrera', 'valeria.pena@gmail.com', '1989-06-05', 'México', 'Periodista', 2),
('Emmanuel José', 'Suárez Delgado', 'emmanuel.suarez@gmail.com', '1996-01-12', 'España', 'Chef', 3),
('Antonella Paz', 'Reyes Aguilar', 'antonella.reyes@gmail.com', '1982-11-28', 'Argentina', 'Diseñadora de Modas', 2),
('Gabriel Alejandro', 'Jiménez Romero', 'gabriel.jimenez@gmail.com', '1990-03-09', 'Chile', 'Economista', 1),
('Martina Alejandra', 'Navarro Campos', 'martina.navarro@gmail.com', '1994-08-20', 'Perú', 'Trabajadora Social', 2),
('Thiago Sebastián', 'Domínguez Vega', 'thiago.dominguez@gmail.com', '1987-12-15', 'Uruguay', 'Ingeniero Mecánico', 1),
('Renata Valentina', 'Guerrero Soto', 'renata.guerrero@gmail.com', '1991-05-07', 'Ecuador', 'Actriz', 3),
('Diego Armando', 'Salazar Mora', 'diego.salazar@gmail.com', '1988-09-23', 'Bolivia', 'Policía', 3),
('Emilia Sofía', 'Ortega Pacheco', 'emilia.ortega@gmail.com', '1995-02-26', 'Venezuela', 'Enfermera', 2),
('Lucas Matías', 'Aguilar Rojas', 'lucas.aguilar@gmail.com', '1983-07-11', 'Paraguay', 'Ingeniero Eléctrico', 1),
('Mía Camila', 'Delgado Castillo', 'mia.delgado@gmail.com', '1992-10-14', 'Colombia', 'Farmacéutica', 2),
('Benjamín Isaac', 'Vega Salas', 'benjamin.vega@gmail.com', '1986-04-19', 'México', 'Abogado', 3),
('Abril Daniela', 'Paredes Méndez', 'abril.paredes@gmail.com', '1993-08-02', 'España', 'Docente', 2),
('Maximiliano Andrés', 'Cordero Serrano', 'maximiliano.cordero@gmail.com', '1989-12-25', 'Argentina', 'Ingeniero Químico', 1),
('Luciana Gabriela', 'Ibarra Lugo', 'luciana.ibarra@gmail.com', '1994-06-16', 'Chile', 'Psicopedagoga', 2),
('Facundo Ezequiel', 'Núñez Rivas', 'facundo.nunez@gmail.com', '1985-01-30', 'Perú', 'Músico', 3),
('Julieta Antonella', 'Valdez Peralta', 'julieta.valdez@gmail.com', '1990-09-05', 'Uruguay', 'Bailarina', 2),
('Ignacio Tomás', 'Ríos Segura', 'ignacio.rios@gmail.com', '1996-03-12', 'Ecuador', 'Ingeniero de Software', 1),
('Morena Isabel', 'Zambrano Villalobos', 'morena.zambrano@gmail.com', '1987-07-27', 'Bolivia', 'Gerente de Ventas', 3),
('Agustín Leonardo', 'Molina Contreras', 'agustin.molina@gmail.com', '1992-11-08', 'Venezuela', 'Arquitecto', 1),
('Catalina Emilia', 'Escobar Fuentes', 'catalina.escobar@gmail.com', '1984-05-21', 'Paraguay', 'Diseñadora Interior', 2),
('Tobías Nahuel', 'Guerra Álvarez', 'tobias.guerra@gmail.com', '1995-02-14', 'Colombia', 'Contador Público', 3),
('Juana Valeria', 'Camacho Acosta', 'juana.camacho@gmail.com', '1988-08-29', 'México', 'Traductora', 2),
('Bautista Oliver', 'Pacheco Guevara', 'bautista.pacheco@gmail.com', '1991-12-05', 'España', 'Ingeniero Industrial', 1),
('Ariana Sofía', 'Salas Quintana', 'ariana.salas@gmail.com', '1993-04-18', 'Argentina', 'Estilista', 2),
('Dylan Jerónimo', 'Herrera Rosales', 'dylan.herrera@gmail.com', '1986-10-22', 'Chile', 'Locutor', 3);

-- DRECRIBE LA TABLA Persona
DESCRIBE Persona;
DESCRIBE Roles;

-- Mostrar datos de la tabla
SELECT * FROM Persona;
SELECT * FROM Roles;