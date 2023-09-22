package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.outsourcing.CotizacionOutsourcing;
import com.coti.proyecto.hiper.model.business.outsourcing.Servicio;
import com.coti.proyecto.hiper.model.business.outsourcing.SubServicio;
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
public class HelpDeskController {

  private List<CotizacionOutsourcing> cotizacionOutsourcings = new ArrayList<>();

  @PostMapping("/outsourcing/grabar")
  public String grabar(@RequestBody CotizacionOutsourcing c1) {
    cotizacionOutsourcings.stream()
        .filter(x -> Objects.equals(x.getNroCotizacion(), c1.getNroCotizacion()))
        .findFirst()
        .ifPresentOrElse(x -> {
          x.setServicio(c1.getServicio());
          x.setSubServicio(c1.getSubServicio());
          x.setHoras(c1.getHoras());
          x.setPersonal(c1.getPersonal());
          x.setTipo(c1.getTipo());
          x.setCostoXServicio(c1.getCostoXServicio());
        }, () -> cotizacionOutsourcings.add(c1));

    System.out.println("========================================");
    cotizacionOutsourcings.forEach(x-> System.out.println(x.toString()));
    System.out.println("========================================");

    return "Guardado exitosamente";
  }

  @GetMapping("/outsourcing/listar")
  public ResponseEntity<List<CotizacionOutsourcing>> listar() {
    return ResponseEntity.ok(cotizacionOutsourcings);
  }
}
