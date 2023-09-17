package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.Requerimiento;
import com.coti.proyecto.hiper.model.business.Servicio;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    e1.setPrecio(3000.00);

    Servicio e2 = new Servicio();
    e2.setNombre("Soporte Premium 24/7");
    e2.setCodigo("02");
    e2.setPrecio(3500.00);

    return ResponseEntity.ok(List.of(e1, e2));
  }

  @GetMapping("/requerimientos")
  public ResponseEntity<List<Requerimiento>> obtenerRequerimientos() {
    Requerimiento e1 = new Requerimiento();
    e1.setCodigo("01");
    e1.setDescripcion("Central Telefonica");
    e1.setCantidad("1");
    e1.setPrecio(12000.00);

    Requerimiento e2 = new Requerimiento();
    e2.setCodigo("02");
    e2.setDescripcion("Software Acceso Remoto");
    e2.setCantidad("1");
    e2.setPrecio(24000.00);

    Requerimiento e3 = new Requerimiento();
    e3.setCodigo("03");
    e3.setDescripcion("Informes Personalizados");
    e3.setCantidad("1");
    e3.setPrecio(10000.00);

    Requerimiento e4 = new Requerimiento();
    e4.setCodigo("04");
    e4.setDescripcion("Monitoreo Proactivo");
    e4.setCantidad("1");
    e4.setPrecio(30000.00);

    Requerimiento e5 = new Requerimiento();
    e5.setCodigo("05");
    e5.setDescripcion("Herramienta de Tickets");
    e5.setCantidad("1");
    e5.setPrecio(10.00);

    Requerimiento e6 = new Requerimiento();
    e6.setCodigo("06");
    e6.setDescripcion("Soporte Onsite");
    e6.setCantidad("1");
    e6.setPrecio(0.003);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4, e5, e6));
  }
}
