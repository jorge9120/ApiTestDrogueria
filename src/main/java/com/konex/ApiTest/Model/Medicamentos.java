package com.konex.ApiTest.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Medicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String laboratorio;
    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private Long cantidad;
    private Long precio;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy="medicamentos")
    private Set<Ventas> ventasModels;


}
