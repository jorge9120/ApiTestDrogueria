package com.konex.ApiTest.Service;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Model.Ventas;
import com.konex.ApiTest.Repository.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasServiceImpl implements VentaService {
    @Autowired
    private VentasRepository ventasRepository;
    @Override
    public Ventas guardarVentas(Ventas ventas) {
        return ventasRepository.save(ventas);
    }

    @Override
    public List<Ventas> obtenerVentas(Medicamentos medId) {
        return ventasRepository.findBymedicamentos(medId);
    }
}
