package com.konex.ApiTest.Service;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Repository.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentosServiceImpl implements MedicamentosService {
    @Autowired
    private MedicamentosRepository medicamentosRepository;
    @Override
    public Medicamentos guardarMedicamentos(Medicamentos medicamentos) {
        return medicamentosRepository.save(medicamentos);
    }

    @Override
    public Medicamentos buscarMedicamento(String medicamento) {
        return null;
    }

    @Override
    public List<Medicamentos> listaMedicamento() {
        return medicamentosRepository.findAll();
    }

    @Override
    public Optional<Medicamentos> findById(Long id) {
        return medicamentosRepository.findById(id);
    }

    @Override
    public void eliminarMedicamento(Long MedId) {
        medicamentosRepository.deleteById(MedId);
    }
}
