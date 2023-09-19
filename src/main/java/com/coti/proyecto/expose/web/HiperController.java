package com.coti.proyecto.expose.web;

import com.coti.proyecto.hiper.model.business.*;

import java.util.ArrayList;
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
          return  c1;
        })
        .orElseGet(() -> {
          System.out.println("agregado");
          cotizacions.add(c1);
          return c1;
        });

    System.out.println("========================================");
    cotizacions.forEach(x-> System.out.println(x.toString()));
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

  @GetMapping("/outsourcing/consultoria/asesoriamiento")
  public ResponseEntity<List<ConsultoriaAsesoramiento>> outsourcingConsultoriaAsesoramiento() {
    ConsultoriaAsesoramiento e1 = new ConsultoriaAsesoramiento();
    e1.setCodigo("01");
    e1.setDescripcion("Consultoria en estrategia de TI");
    e1.setCostoXHora(16.00);

    ConsultoriaAsesoramiento e2 = new ConsultoriaAsesoramiento();
    e2.setCodigo("02");
    e2.setDescripcion("Consultoria en ciberseguridad");
    e2.setCostoXHora(16.00);

    ConsultoriaAsesoramiento e3 = new ConsultoriaAsesoramiento();
    e3.setCodigo("03");
    e3.setDescripcion("Consultoria en gestion de proyectos");
    e3.setCostoXHora(16.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @GetMapping("/outsourcing/gestion/proyectos")
  public ResponseEntity<List<GestionProyectos>> outsourcingGestionProyectos() {
    GestionProyectos e1 = new GestionProyectos();
    e1.setCodigo("01");
    e1.setDescripcion("Gestion de proyectos de desarrollo de software");
    e1.setCostoXHora(16.00);

    GestionProyectos e2 = new GestionProyectos();
    e2.setCodigo("02");
    e2.setDescripcion("Gestion de proyectos de TI");
    e2.setCostoXHora(16.00);

    GestionProyectos e3 = new GestionProyectos();
    e3.setCodigo("03");
    e3.setDescripcion("Gestion de proyectos de infraestructura");
    e3.setCostoXHora(16.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @GetMapping("/outsourcing/gestion/basededatos")
  public ResponseEntity<List<GestionBaseDeDatos>> outsourcingGestionBaseDeDatos() {
    GestionBaseDeDatos e1 = new GestionBaseDeDatos();
    e1.setCodigo("01");
    e1.setDescripcion("Administracion y mantenimiento de bases de datos");
    e1.setCostoXHora(17.00);

    GestionBaseDeDatos e2 = new GestionBaseDeDatos();
    e2.setCodigo("02");
    e2.setDescripcion("Optimizacion de bases de datos para el rendimiento");
    e2.setCostoXHora(17.00);

    GestionBaseDeDatos e3 = new GestionBaseDeDatos();
    e3.setCodigo("03");
    e3.setDescripcion("Migracion de datos entre sistemas");
    e3.setCostoXHora(17.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));

  }

  @GetMapping("/outsourcing/integracion/datos")
  public ResponseEntity<List<IntegracionDatos>> outsourcingIntegracionDatos() {
    IntegracionDatos e1 = new IntegracionDatos();
    e1.setCodigo("01");
    e1.setDescripcion("Integracion de sistemas y flujos de datos");
    e1.setCostoXHora(19.00);

    IntegracionDatos e2 = new IntegracionDatos();
    e2.setCodigo("02");
    e2.setDescripcion("ETL (Extraccion, Transformacion y Carga) de datos");
    e2.setCostoXHora(19.00);

    IntegracionDatos e3 = new IntegracionDatos();
    e3.setCodigo("03");
    e3.setDescripcion("Automatizacion de procesos de datos");
    e3.setCostoXHora(19.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
    
  }

  @GetMapping("/outsourcing/bigdata/cienciadedatos")
  public ResponseEntity<List<BigDataCienciaDeDatos>> outsourcingBigDataCienciaDeDatos() {
    BigDataCienciaDeDatos e1 = new BigDataCienciaDeDatos();
    e1.setCodigo("01");
    e1.setDescripcion("Proyectos de analisis de Big Data");
    e1.setCostoXHora(21.00);

    BigDataCienciaDeDatos e2 = new BigDataCienciaDeDatos();
    e2.setCodigo("02");
    e2.setDescripcion("Modelado predictivo y analisis avanzado");
    e2.setCostoXHora(21.00);

    BigDataCienciaDeDatos e3 = new BigDataCienciaDeDatos();
    e3.setCodigo("03");
    e3.setDescripcion("Implementacion de soluciones de ciencia de datos");
    e3.setCostoXHora(21.00);

    return ResponseEntity.ok(List.of(e1, e2, e3));
  }

  @GetMapping("/outsourcing/automatizacion/procesodenegocios")
  public ResponseEntity<List<AutomatizacionDeProcesosDeNegocios>> outsourcingAutomatizacionDeProcesosDeNegocios() {
    AutomatizacionDeProcesosDeNegocios e1 = new AutomatizacionDeProcesosDeNegocios();
    e1.setCodigo("01");
    e1.setDescripcion("Proyectos de analisis de Big Data");
    e1.setCostoXHora(19.00);

    AutomatizacionDeProcesosDeNegocios e2 = new AutomatizacionDeProcesosDeNegocios();
    e2.setCodigo("02");
    e2.setDescripcion("Modelado predictivo y analisis avanzado");
    e2.setCostoXHora(19.00);

    return ResponseEntity.ok(List.of(e1, e2));
  }

  @GetMapping("/outsourcing/evaluacionymejora/seguridadcibernetica")
  public ResponseEntity<List<EvaluacionMejoraSeguridadCibernetica>> outsourcingEvaluacionMejoraSeguridadCibernetica() {
    EvaluacionMejoraSeguridadCibernetica e1 = new EvaluacionMejoraSeguridadCibernetica();
    e1.setCodigo("01");
    e1.setDescripcion("Identificacion de vulnerabilidades en aplicaciones, bases de datos, sistemas operativos, etc");
    e1.setCostoXHora(23.00);

    EvaluacionMejoraSeguridadCibernetica e2 = new EvaluacionMejoraSeguridadCibernetica();
    e2.setCodigo("02");
    e2.setDescripcion("Evaluacion de la seguridad de la red y la infraestructura de TI");
    e2.setCostoXHora(23.00);

    EvaluacionMejoraSeguridadCibernetica e3 = new EvaluacionMejoraSeguridadCibernetica();
    e3.setCodigo("03");
    e3.setDescripcion("Desarrollo de un plan de respuesta a incidentes");
    e3.setCostoXHora(23.00);

    EvaluacionMejoraSeguridadCibernetica e4 = new EvaluacionMejoraSeguridadCibernetica();
    e4.setCodigo("04");
    e4.setDescripcion("Auditorias Regulares de Seguridad");
    e4.setCostoXHora(23.00);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4));
  }

  @GetMapping("/soporte/modalidad")
  public ResponseEntity<List<SoporteModalidad>> soporteSoporteModalidad() {
    SoporteModalidad e1 = new SoporteModalidad();
    e1.setCodigo("01");
    e1.setDescripcion("Soporte Tecnico Estandar");
    e1.setPrecio(10.00);

    SoporteModalidad e2 = new SoporteModalidad();
    e2.setCodigo("02");
    e2.setDescripcion("Soporte Remoto");
    e2.setPrecio(05.00);

    return ResponseEntity.ok(List.of(e1, e2));
  }

  @GetMapping("/soporte/office")
  public ResponseEntity<List<SoporteOficina>> soporteSoporteOficina() {
    SoporteOficina e1 = new SoporteOficina();
    e1.setCodigo("01");
    e1.setDescripcion("Dentro de Oficina");
    e1.setPorcentaje(0.0);

    SoporteOficina e2 = new SoporteOficina();
    e2.setCodigo("02");
    e2.setDescripcion("Fuera de Oficina");
    e2.setPorcentaje(0.5);

    return ResponseEntity.ok(List.of(e1, e2));
  }

  @GetMapping("/soporte/otros")
  public ResponseEntity<List<SoporteOtros>> soporteOtros() {
    SoporteOtros e1 = new SoporteOtros();
    e1.setCodigo("01");
    e1.setDescripcion("Instalacion y Configuracion de Software");
    e1.setPrecio(0.0);

    SoporteOtros e2 = new SoporteOtros();
    e2.setCodigo("02");
    e2.setDescripcion("Reinstalacion de Sistema Operativo");
    e2.setPrecio(2.0);

    SoporteOtros e3 = new SoporteOtros();
    e3.setCodigo("03");
    e3.setDescripcion("Respaldo de Informacion");
    e2.setPrecio(2.0);

    SoporteOtros e4 = new SoporteOtros();
    e4.setCodigo("04");
    e4.setDescripcion("Limpieza de Hardware");
    e4.setPrecio(2.0);

    SoporteOtros e5 = new SoporteOtros();
    e5.setCodigo("05");
    e5.setDescripcion("Instalacion de Antivirus y Antimalware");
    e5.setPrecio(1.0);

    SoporteOtros e6 = new SoporteOtros();
    e6.setCodigo("06");
    e6.setDescripcion("Configuracion de Impresoras");
    e6.setPrecio(0.0);

    SoporteOtros e7 = new SoporteOtros();
    e7.setCodigo("07");
    e7.setDescripcion("Inventariado de Equipos");
    e7.setPrecio(5.0);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4, e5, e6, e7));
  }

  @GetMapping("/soporte/hardware")
  public ResponseEntity<List<SoporteHardware>> soporteSoporteHardware() {
    SoporteHardware e1 = new SoporteHardware();
    e1.setCodigo("01");
    e1.setDescripcion("PC");
    e1.setPrecio(0.0);

    SoporteHardware e2 = new SoporteHardware();
    e2.setCodigo("02");
    e2.setDescripcion("Laptops");
    e2.setPrecio(0.0);

    SoporteHardware e3 = new SoporteHardware();
    e3.setCodigo("03");
    e3.setDescripcion("Servidores");
    e3.setPrecio(10.0);

    SoporteHardware e4 = new SoporteHardware();
    e4.setCodigo("04");
    e4.setDescripcion("Mac");
    e4.setPrecio(3.0);

    return ResponseEntity.ok(List.of(e1, e2, e3, e4));
  }
}
