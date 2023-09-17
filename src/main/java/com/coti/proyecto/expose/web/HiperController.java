package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.Canal;
import com.coti.proyecto.hiper.model.business.Cotizacion;
import com.coti.proyecto.hiper.model.business.Jornada;
import com.coti.proyecto.hiper.model.business.Modalidad;
import com.coti.proyecto.hiper.model.business.Requerimiento;
import com.coti.proyecto.hiper.model.business.Servicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@ComponentScan(value = "com.proyecto", lazyInit = true)
public class HiperController {

  private List<Cotizacion> cotizacions = new ArrayList<>();

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

  @GetMapping("/canales")
  public ResponseEntity<List<Canal>> obtenerCanales() {
    Canal e1 = new Canal();
    e1.setCodigo("01");
    e1.setDescripcion("Canal Telefonico");
    e1.setPorcentaje(1.0);
    e1.setPrecio(1200.00);

    Canal e2 = new Canal();
    e2.setCodigo("02");
    e2.setDescripcion("Chat en Vivo");
    e2.setPorcentaje(0.5);
    e2.setPrecio(1500.00);

    Canal e3 = new Canal();
    e3.setCodigo("03");
    e3.setDescripcion("Redes Sociales");
    e3.setPorcentaje(1.0);
    e3.setPrecio(2500.00);

    Canal e4 = new Canal();
    e4.setCodigo("04");
    e4.setDescripcion("Correo Electronico");
    e4.setPorcentaje(0.5);
    e4.setPrecio(2200.00);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4));
  }

  @GetMapping("/jornadas")
  public ResponseEntity<List<Jornada>> obtenerJornadas() {
    Jornada e1 = new Jornada();
    e1.setCodigo("01");
    e1.setDescripcion("00:00 AM - 08:00 AM");
    e1.setPorcentaje(1.0);
    e1.setPrecio(3000.00);

    Jornada e2 = new Jornada();
    e2.setCodigo("02");
    e2.setDescripcion("08:00 AM - 12:00 PM");
    e2.setPorcentaje(1.1);
    e2.setPrecio(3300.00);

    Jornada e3 = new Jornada();
    e3.setCodigo("03");
    e3.setDescripcion("12:00 PM - 00:00 AM");
    e3.setPorcentaje(1.2);
    e3.setPrecio(3000.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @GetMapping("/modalidades")
  public ResponseEntity<List<Modalidad>> obtenerModalidades() {
    Modalidad e1 = new Modalidad();
    e1.setCodigo("01");
    e1.setDescripcion("Hibrido");
    e1.setPorcentaje(0.3);
    e1.setPrecio(90.00);

    Modalidad e2 = new Modalidad();
    e2.setCodigo("02");
    e2.setDescripcion("Remoto");
    e2.setPorcentaje(0.0);
    e2.setPrecio(0.0);

    Modalidad e3 = new Modalidad();
    e3.setCodigo("03");
    e3.setDescripcion("Presencial");
    e3.setPorcentaje(0.6);
    e3.setPrecio(180.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @PostMapping("/grabar")
  public String grabar(@RequestBody Cotizacion c1) {
    cotizacions.stream()
        .filter(x -> Objects.equals(x.getCodigo(), c1.getCodigo()))
        .findFirst()
        .map(x -> {
          System.out.println("reemplazado");
          x.setCodigo(c1.getCodigo());
          return  x;
        })
        .orElseGet(() -> {
          System.out.println("agregado");
          cotizacions.add(c1);
          return c1;
        });

    System.out.println("========================================");
    cotizacions.forEach(x-> System.out.println(x.getCodigo()));
    System.out.println("========================================");

    return "Guardado exitosamente";
  }
}
