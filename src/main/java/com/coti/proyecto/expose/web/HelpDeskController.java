package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.heldesk.HelpDeskCotizacion;
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
public class HelpDeskController {

  private List<HelpDeskCotizacion> helpDeskCotizacions = new ArrayList<>();

  @PostMapping("/helpdesk/grabar")
  public ResponseEntity<?> grabar(@RequestBody HelpDeskCotizacion c1) {
    helpDeskCotizacions.stream()
        .filter(x -> Objects.equals(x.getNroCotizacion(), c1.getNroCotizacion()))
        .findFirst()
        .ifPresentOrElse(x -> {
          x.setTipoServicio(c1.getTipoServicio());
          x.setDuracion(c1.getDuracion());
          x.setUsuarios(c1.getUsuarios());
          x.setModalidad(c1.getModalidad());
          x.setCostoXAno(c1.getCostoXAno());
        }, () -> helpDeskCotizacions.add(c1));

    System.out.println("========================================");
    helpDeskCotizacions.forEach(x -> System.out.println(x.toString()));
    System.out.println("========================================");

    return new ResponseEntity<>(helpDeskCotizacions,HttpStatus.OK);
  }

  @GetMapping("/helpdesk/listar")
  public ResponseEntity<List<HelpDeskCotizacion>> listar() {
    return ResponseEntity.ok(helpDeskCotizacions);
  }
}
