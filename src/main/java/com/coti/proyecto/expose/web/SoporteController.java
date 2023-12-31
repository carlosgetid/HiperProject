package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.outsourcing.OutsourcingCotizacion;
import com.coti.proyecto.hiper.model.business.soporte.SoporteCotizacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
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

    private Integer counter = 0;

  @PostMapping("/soporte/grabar")
  public ResponseEntity<?> grabar(@RequestBody SoporteCotizacion c1) {
      counter++;
      int numZeros = 6 - counter.toString().length();

      String zeros = "0".repeat(numZeros);

      c1.setNroCotizacion("C"+zeros+counter);
    soporteCotizacions.stream()
        .filter(x -> Objects.equals(x.getNroCotizacion(), c1.getNroCotizacion()))
        .findFirst()
        .ifPresentOrElse(x -> {
            x.setNroCotizacion(c1.getNroCotizacion());
          x.setServicio(c1.getServicio());
          x.setHorario(c1.getHorario());
          x.setEquipos(c1.getEquipos());
          x.setCostoXServicio(c1.getCostoXServicio());
        }, () -> soporteCotizacions.add(c1));

    System.out.println("========================================");
    soporteCotizacions.forEach(x -> System.out.println(x.toString()));
    System.out.println("========================================");

      return new ResponseEntity<>(soporteCotizacions, HttpStatus.OK);
  }

  @GetMapping("/soporte/listar")
  public ResponseEntity<List<SoporteCotizacion>> listar() {
    return ResponseEntity.ok(soporteCotizacions);
  }
}
