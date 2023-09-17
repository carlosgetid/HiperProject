package com.coti.proyecto.hiper.model.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Jornada {

  private String codigo;
  private String descripcion;
  private Double porcentaje;
  private Double precio;

}
