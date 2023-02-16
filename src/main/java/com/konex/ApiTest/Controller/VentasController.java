package com.konex.ApiTest.Controller;

import com.konex.ApiTest.Model.Medicamentos;
import com.konex.ApiTest.Model.Ventas;
import com.konex.ApiTest.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas/")
@CrossOrigin(origins = "http://localhost:4200")
public class VentasController {
    @Autowired
    private VentaService ventaService;

    @GetMapping("/buscar")
    public ResponseEntity<List<Ventas>> buscarVentas(@RequestBody Medicamentos medicamentos){
        List<Ventas> ventas = ventaService.obtenerVentas(medicamentos);
        return new ResponseEntity<List<Ventas>>(ventas, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> creaVenta(@RequestBody Ventas venta){
        ventaService.guardarVentas(venta);
        return new ResponseEntity("Venta registrada", HttpStatus.OK);
    }
}
