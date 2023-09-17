package com.coti.proyecto.hiper.model.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Requerimiento {

  private String codigo;
  private String descripcion;
  private String cantidad;
  private String precio;

}
