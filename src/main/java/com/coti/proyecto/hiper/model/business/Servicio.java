package com.coti.proyecto.hiper.model.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Servicio {

  private String codigo;
  private String nombre;
  private Double precio;

  @Override
  public String toString() {
    return "Servicio{" +
        "codigo='" + codigo + '\'' +
        ", nombre='" + nombre + '\'' +
        ", precio=" + precio +
        '}';
  }
}
