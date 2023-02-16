package com.konex.ApiTest.Repository;

import com.konex.ApiTest.Model.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentosRepository extends JpaRepository<Medicamentos,Long> {
    //public Medicamentos findByName(String name);
}
