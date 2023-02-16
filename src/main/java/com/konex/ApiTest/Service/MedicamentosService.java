package com.konex.ApiTest.Service;

import com.konex.ApiTest.Model.Medicamentos;

import java.util.List;
import java.util.Optional;

public interface MedicamentosService {
    public Medicamentos guardarMedicamentos(Medicamentos medicamentos);
    public Medicamentos buscarMedicamento(String medicamento);
    public List<Medicamentos> listaMedicamento();
    public Optional<Medicamentos> findById(Long id);
    public void eliminarMedicamento(Long MedId);
}
