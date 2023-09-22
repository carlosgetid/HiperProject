package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.soporte.SoporteCotizacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@ComponentScan(value = "com.proyecto", lazyInit = true)
public class SoporteController {

  private List<SoporteCotizacion> soporteCotizacions = new ArrayList<>();

  @PostMapping("/soporte/grabar")
  public String grabar(@RequestBody SoporteCotizacion c1) {
    soporteCotizacions.stream()
        .filter(x -> Objects.equals(x.getNroCotizacion(), c1.getNroCotizacion()))
        .findFirst()
        .ifPresentOrElse(x -> {
          x.setServicio(c1.getServicio());
          x.setHorario(c1.getHorario());
          x.setEquipos(c1.getEquipos());
          x.setCostoXServicio(c1.getCostoXServicio());
        }, () -> soporteCotizacions.add(c1));

    System.out.println("========================================");
    soporteCotizacions.forEach(x -> System.out.println(x.toString()));
    System.out.println("========================================");

    return "Guardado exitosamente";
  }

  @GetMapping("/soporte/listar")
  public ResponseEntity<List<SoporteCotizacion>> listar() {
    return ResponseEntity.ok(soporteCotizacions);
  }
}
