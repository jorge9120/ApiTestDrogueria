package com.konex.ApiTest.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp fechaHora;
    private int cantidad;
    private Long precioUni;
    private Long precioTotal;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="med_id", nullable=false)
    private Medicamentos medicamentos;

}
