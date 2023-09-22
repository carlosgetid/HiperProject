package com.coti.proyecto.hiper.model.business.soporte;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SoporteCotizacion {

  private String nroCotizacion;
  private String servicio;
  private String horario;
  private String equipos;
  private Double costoXServicio;

  @Override
  public String toString() {
    return "SoporteCotizacion{" +
        "nroCotizacion='" + nroCotizacion + '\'' +
        ", servicio='" + servicio + '\'' +
        ", horario='" + horario + '\'' +
        ", equipos='" + equipos + '\'' +
        ", costoXServicio=" + costoXServicio +
        '}';
  }
}
