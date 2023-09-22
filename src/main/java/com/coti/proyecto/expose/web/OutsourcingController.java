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
public class OutsourcingController {

  private List<CotizacionOutsourcing> cotizacionOutsourcings = new ArrayList<>();

  @GetMapping("/outsourcing/servicios/subservicios")
  public ResponseEntity<List<Servicio>> obtenerServicios() {
    SubServicio b2 = new SubServicio();
    b2.setCodigo("01");
    b2.setDescripcion("Desarrollo de aplicaciones web");
    b2.setCostoXHora(17.00);

    SubServicio b3 = new SubServicio();
    b3.setCodigo("02");
    b3.setDescripcion("Desarrollo de aplicaciones moviles");
    b3.setCostoXHora(17.00);

    SubServicio b4 = new SubServicio();
    b4.setCodigo("03");
    b4.setDescripcion("Desarrollo de software personalizado");
    b4.setCostoXHora(17.00);

    SubServicio b5 = new SubServicio();
    b5.setCodigo("04");
    b5.setDescripcion("Desarrollo de software de gestion empresarial");
    b5.setCostoXHora(17.00);

    // ===========================================================================

    SubServicio b6 = new SubServicio();
    b6.setCodigo("01");
    b6.setDescripcion("Consultoria en estrategia de TI");
    b6.setCostoXHora(16.00);

    SubServicio b7 = new SubServicio();
    b7.setCodigo("02");
    b7.setDescripcion("Consultoria en ciberseguridad");
    b7.setCostoXHora(16.00);

    SubServicio b8 = new SubServicio();
    b8.setCodigo("03");
    b8.setDescripcion("Consultoria en gestion de proyectos");
    b8.setCostoXHora(16.00);

    // ===========================================================================

    SubServicio b9 = new SubServicio();
    b9.setCodigo("01");
    b9.setDescripcion("Gestion de proyectos de desarrollo de software");
    b9.setCostoXHora(16.00);

    SubServicio b10 = new SubServicio();
    b10.setCodigo("02");
    b10.setDescripcion("Gestion de proyectos de TI");
    b10.setCostoXHora(16.00);

    SubServicio b11 = new SubServicio();
    b11.setCodigo("03");
    b11.setDescripcion("Gestion de proyectos de infraestructura");
    b11.setCostoXHora(16.00);

    // ===========================================================================

    SubServicio b12 = new SubServicio();
    b12.setCodigo("01");
    b12.setDescripcion("Administracion y mantenimiento de bases de datos");
    b12.setCostoXHora(17.00);

    SubServicio b13 = new SubServicio();
    b13.setCodigo("02");
    b13.setDescripcion("Optimizacion de bases de datos para el rendimiento");
    b13.setCostoXHora(17.00);

    SubServicio b14 = new SubServicio();
    b14.setCodigo("03");
    b14.setDescripcion("Migracion de datos entre sistemas");
    b14.setCostoXHora(17.00);

    // ===========================================================================

    SubServicio b15 = new SubServicio();
    b15.setCodigo("01");
    b15.setDescripcion("Integracion de sistemas y flujos de datos");
    b15.setCostoXHora(19.00);

    SubServicio b16 = new SubServicio();
    b16.setCodigo("02");
    b16.setDescripcion("ETL (Extraccion, Transformacion y Carga) de datos");
    b16.setCostoXHora(19.00);

    SubServicio b17 = new SubServicio();
    b17.setCodigo("03");
    b17.setDescripcion("Automatizacion de procesos de datos");
    b17.setCostoXHora(19.00);

    // ===========================================================================

    SubServicio b18 = new SubServicio();
    b18.setCodigo("01");
    b18.setDescripcion("Proyectos de analisis de Big Data");
    b18.setCostoXHora(21.00);

    SubServicio b19 = new SubServicio();
    b19.setCodigo("02");
    b19.setDescripcion("Modelado predictivo y analisis avanzado");
    b19.setCostoXHora(21.00);

    SubServicio b20 = new SubServicio();
    b20.setCodigo("03");
    b20.setDescripcion("Implementacion de soluciones de ciencia de datos");
    b20.setCostoXHora(21.00);

    // ===========================================================================

    SubServicio b21 = new SubServicio();
    b21.setCodigo("01");
    b21.setDescripcion("Automatizacion de flujos de trabajo.");
    b21.setCostoXHora(19.00);

    SubServicio b22 = new SubServicio();
    b22.setCodigo("02");
    b22.setDescripcion("Implementacion de RPA (Automatizacion de Procesos Roboticos)");
    b22.setCostoXHora(19.00);

    SubServicio b23 = new SubServicio();
    b23.setCodigo("03");
    b23.setDescripcion(
        "Identificacion de vulnerabilidades en aplicaciones, bases de datos, sistemas operativos, etc");
    b23.setCostoXHora(19.00);

    // ===========================================================================

    SubServicio b24 = new SubServicio();
    b24.setCodigo("01");
    b24.setDescripcion("Evaluacion de la seguridad de la red y la infraestructura de TI.");
    b24.setCostoXHora(23.00);

    SubServicio b25 = new SubServicio();
    b25.setCodigo("02");
    b25.setDescripcion("Desarrollo de un plan de respuesta a incidentes");
    b25.setCostoXHora(23.00);

    SubServicio b26 = new SubServicio();
    b26.setCodigo("03");
    b26.setDescripcion("Auditorias Regulares de Seguridad");
    b26.setCostoXHora(23.00);

    // ===========================================================================

    Servicio a2 = new Servicio();
    a2.setCodigo("01");
    a2.setDescripcion("Desarrollo de Software");
    a2.setSubServicios(List.of(b2, b3, b4, b5));

    Servicio a6 = new Servicio();
    a6.setCodigo("02");
    a6.setDescripcion("Consultoria y Asesoramiento");
    a6.setSubServicios(List.of(b6, b7, b8));

    Servicio a9 = new Servicio();
    a9.setCodigo("03");
    a9.setDescripcion("Gestion de Proyectos");
    a9.setSubServicios(List.of(b9, b10, b11));

    Servicio a12 = new Servicio();
    a12.setCodigo("04");
    a12.setDescripcion("Gestion de Bases de Datos");
    a12.setSubServicios(List.of(b12, b13, b14));

    Servicio a15 = new Servicio();
    a15.setCodigo("05");
    a15.setDescripcion("Integracion de Datos");
    a15.setSubServicios(List.of(b15, b16, b17));

    Servicio a18 = new Servicio();
    a18.setCodigo("06");
    a18.setDescripcion("Big Data y Ciencia de Datos");
    a18.setSubServicios(List.of(b18, b19, b20));

    Servicio a21 = new Servicio();
    a21.setCodigo("07");
    a21.setDescripcion("Automatizacion de Procesos de Negocios");
    a21.setSubServicios(List.of(b21, b22));

    Servicio a23 = new Servicio();
    a23.setCodigo("08");
    a23.setDescripcion("Evaluacion y Mejora de la Seguridad Cibernetica");
    a23.setSubServicios(List.of(b23, b24, b25, b26));

    return ResponseEntity.ok(List.of(a2, a6, a9, a12, a15, a18, a21, a23));
  }


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
