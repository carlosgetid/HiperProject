package com.coti.proyecto.hiper.model.business;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cotizacion {

  private String codigo;

  private Servicio servicio;

  private DuracionServicio duracionServicio;

  private List<Requerimiento> requerimientos;

  private List<Canal> canales;

  private List<Dias> dias;

  private JornadaDuracion inicioJornada;

  private JornadaDuracion finJornada;

  private String cantidadUsuarios;

  private Modalidad modalidad;

  @Override
  public String toString() {
    return "Cotizacion{" +
        "codigo='" + codigo + '\'' +
        ", servicio=" + servicio +
        ", duracionServicio=" + duracionServicio +
        ", requerimientos=" + requerimientos +
        ", canales=" + canales +
        ", dias=" + dias +
        ", inicioJornada=" + inicioJornada +
        ", finJornada=" + finJornada +
        ", cantidadUsuarios='" + cantidadUsuarios + '\'' +
        ", modalidad=" + modalidad +
        '}';
  }
}
