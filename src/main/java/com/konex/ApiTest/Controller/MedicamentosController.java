package com.konex.ApiTest.Controller;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicamentos")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicamentosController {

    @Autowired
    private MedicamentosService medicamentosService;
    @GetMapping("")
    public ResponseEntity<List<Medicamentos>> getMedicamentos(){
        List<Medicamentos> medicamentos = medicamentosService.listaMedicamento();
        return new ResponseEntity<List<Medicamentos>>(medicamentos, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> creaMedicamento(@RequestBody Medicamentos medicamentos){
        medicamentosService.guardarMedicamentos(medicamentos);
        return new ResponseEntity("Medicamento creado", HttpStatus.OK);
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> borrarTorre(@PathVariable("id") Long id){
        Optional<Medicamentos> buscar = medicamentosService.findById(id);
        if (buscar==null)
            return new ResponseEntity("No existe el medicamento", HttpStatus.NOT_FOUND);
        medicamentosService.eliminarMedicamento(id);
        return new ResponseEntity("Medicamento eliminado", HttpStatus.OK);
    }

}
