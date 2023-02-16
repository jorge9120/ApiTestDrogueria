package com.konex.ApiTest.Repository;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VentasRepository extends JpaRepository<Ventas,Long> {
    //public Ventas findVentasByMedId(Long med_id);
    List<Ventas> findBymedicamentos(Medicamentos med);
}
