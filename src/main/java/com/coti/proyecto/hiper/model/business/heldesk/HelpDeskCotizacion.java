package com.coti.proyecto.hiper.model.business.heldesk;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class HelpDeskCotizacion {

  private String nroCotizacion;
  private String tipoServicio;
  private String duracion;
  private String usuarios;
  private String modalidad;
  private Double costoXAno;

  @Override
  public String toString() {
    return "HelpDeskCotizacion{" +
        "nroCotizacion='" + nroCotizacion + '\'' +
        ", tipoServicio='" + tipoServicio + '\'' +
        ", duracion='" + duracion + '\'' +
        ", usuarios='" + usuarios + '\'' +
        ", modalidad='" + modalidad + '\'' +
        ", costoXAno=" + costoXAno +
        '}';
  }
}
