package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.*;

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
    e1.setSelected(false);

    Requerimiento e2 = new Requerimiento();
    e2.setCodigo("02");
    e2.setDescripcion("Software Acceso Remoto");
    e2.setCantidad("1");
    e2.setPrecio(24000.00);
    e2.setSelected(false);

    Requerimiento e3 = new Requerimiento();
    e3.setCodigo("03");
    e3.setDescripcion("Informes Personalizados");
    e3.setCantidad("1");
    e3.setPrecio(10000.00);
    e3.setSelected(false);

    Requerimiento e4 = new Requerimiento();
    e4.setCodigo("04");
    e4.setDescripcion("Monitoreo Proactivo");
    e4.setCantidad("1");
    e4.setPrecio(30000.00);
    e4.setSelected(false);

    Requerimiento e5 = new Requerimiento();
    e5.setCodigo("05");
    e5.setDescripcion("Herramienta de Tickets");
    e5.setCantidad("1");
    e5.setPrecio(10.00);
    e5.setSelected(false);

    Requerimiento e6 = new Requerimiento();
    e6.setCodigo("06");
    e6.setDescripcion("Soporte Onsite");
    e6.setCantidad("1");
    e6.setPrecio(0.003);
    e6.setSelected(false);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4, e5, e6));
  }

  @GetMapping("/canales")
  public ResponseEntity<List<Canal>> obtenerCanales() {
    Canal e1 = new Canal();
    e1.setCodigo("01");
    e1.setDescripcion("Canal Telefonico");
    e1.setPorcentaje(0.01);
    e1.setSelected(false);

    Canal e2 = new Canal();
    e2.setCodigo("02");
    e2.setDescripcion("Chat en Vivo");
    e2.setPorcentaje(0.005);
    e2.setSelected(false);

    Canal e3 = new Canal();
    e3.setCodigo("03");
    e3.setDescripcion("Redes Sociales");
    e3.setPorcentaje(0.01);
    e3.setSelected(false);

    Canal e4 = new Canal();
    e4.setCodigo("04");
    e4.setDescripcion("Correo Electronico");
    e4.setPorcentaje(0.01);
    e4.setSelected(false);

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
    e1.setPorcentaje(0.03);
    e1.setPrecio(90.00);

    Modalidad e2 = new Modalidad();
    e2.setCodigo("02");
    e2.setDescripcion("Remoto");
    e2.setPorcentaje(0.0);
    e2.setPrecio(0.0);

    Modalidad e3 = new Modalidad();
    e3.setCodigo("03");
    e3.setDescripcion("Presencial");
    e3.setPorcentaje(0.06);
    e3.setPrecio(180.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @GetMapping("/dias")
  public ResponseEntity<List<Dias>> obtenerDias() {
    Dias e1 = new Dias();
    e1.setCodigo("01");
    e1.setDescripcion("Lunes");
    e1.setAbreviatura("Lu");
    e1.setPorcentaje(1.0);
    e1.setSelected(false);

    Dias e2 = new Dias();
    e2.setCodigo("02");
    e2.setDescripcion("Martes");
    e2.setAbreviatura("Ma");
    e2.setPorcentaje(1.0);
    e2.setSelected(false);

    Dias e3 = new Dias();
    e3.setCodigo("03");
    e3.setDescripcion("Miercoles");
    e3.setAbreviatura("Mi");
    e3.setPorcentaje(1.0);
    e3.setSelected(false);

    Dias e4 = new Dias();
    e4.setCodigo("04");
    e4.setDescripcion("Jueves");
    e4.setAbreviatura("Ju");
    e4.setPorcentaje(1.0);
    e4.setSelected(false);

    Dias e5 = new Dias();
    e5.setCodigo("05");
    e5.setDescripcion("Viernes");
    e5.setAbreviatura("Vi");
    e5.setPorcentaje(1.0);
    e5.setSelected(false);

    Dias e6 = new Dias();
    e6.setCodigo("06");
    e6.setDescripcion("Sabado");
    e6.setAbreviatura("Sa");
    e6.setPorcentaje(1.003);
    e6.setSelected(false);

    Dias e7 = new Dias();
    e7.setCodigo("07");
    e7.setDescripcion("Domingo");
    e7.setAbreviatura("Do");
    e7.setPorcentaje(1.005);
    e7.setSelected(false);

    return ResponseEntity.ok(List.of(e1, e2, e3,e4,e5,e6,e7));
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

  @GetMapping("/outsourcing/desarrollo/software")
  public ResponseEntity<List<DesarrolloSoftware>> outsourcingDesarrolloSoftware() {
    DesarrolloSoftware e1 = new DesarrolloSoftware();
    e1.setCodigo("01");
    e1.setDescripcion("Desarrollo de aplicaciones web");
    e1.setCostoXHora(17.00);

    DesarrolloSoftware e2 = new DesarrolloSoftware();
    e2.setCodigo("02");
    e2.setDescripcion("Desarrollo de aplicaciones moviles");
    e2.setCostoXHora(17.00);

    DesarrolloSoftware e3 = new DesarrolloSoftware();
    e3.setCodigo("03");
    e3.setDescripcion("Desarrollo de software personalizado");
    e3.setCostoXHora(17.00);

    DesarrolloSoftware e4 = new DesarrolloSoftware();
    e4.setCodigo("04");
    e4.setDescripcion("Desarrollo de software de gestion empresarial");
    e4.setCostoXHora(17.00);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4));
  }
}
