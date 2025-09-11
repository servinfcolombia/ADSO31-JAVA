/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Felipe Rodriguez
 * Created: 1 sept 2025
 */

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
    documento VARCHAR(180) NOT NULL,
    correo VARCHAR(150) NOT NULL,
    fecha_vacunacion DATE NOT NULL,
    edad INT NOT NULL,
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

