package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.Servicio;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(value = "com.proyecto", lazyInit = true)
public class HiperController {

  @GetMapping("/obtener/{id}")
  public String getBook(@PathVariable String id) {
    return id;
  }

  @GetMapping("/servicios")
  public ResponseEntity<List<Servicio>> obtenerServicios() {
    Servicio e1 = new Servicio();
    e1.setNombre("Soporte Tecnico Estandar");
    e1.setCodigo("01");
    e1.setPrecio("3000");

    Servicio e2 = new Servicio();
    e2.setNombre("Soporte Premium 24/7");
    e2.setCodigo("02");
    e2.setPrecio("3500");

    return ResponseEntity.ok(List.of(e1, e2));
  }
}
