package com.konex.ApiTest.Service;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Model.Ventas;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    public Ventas guardarVentas(Ventas ventas);
    public List<Ventas> obtenerVentas(Medicamentos medId);
}
