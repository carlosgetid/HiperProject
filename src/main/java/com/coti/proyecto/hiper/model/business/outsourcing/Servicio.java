package com.coti.proyecto.hiper.model.business.outsourcing;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Servicio {

  private String codigo;
  private String descripcion;
  private List<SubServicio> subServicios;

}
