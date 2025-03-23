package com.rollerspeed.rollerspeed.model;

import java.util.Date;

import com.rollerspeed.rollerspeed.util.Genero;
import com.rollerspeed.rollerspeed.util.MedioPago;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "EstudiantesEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long Id;
    private String nombre;
    private Date fechaNacimiento;
    private Genero genero;
    private String correo;
    private String telefono;
    private MedioPago mediopago;
}

// nombre, fecha Nacimiento ,Genero, correo, teléfono y medio de pago.