package com.coti.proyecto.hiper.model.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CotizacionOutsourcing {

  private String nroCotizacion;
  private String servicio;
  private String subServicio;
  private String horas;
  private String personal;
  private String tipo;
  private Double costoXServicio;

  @Override
  public String toString() {
    return "OutsourcingCotizacion{" +
        "nroCotizacion='" + nroCotizacion + '\'' +
        ", servicio='" + servicio + '\'' +
        ", subServicio='" + subServicio + '\'' +
        ", horas='" + horas + '\'' +
        ", personal='" + personal + '\'' +
        ", tipo='" + tipo + '\'' +
        ", costoXServicio=" + costoXServicio +
        '}';
  }
}
