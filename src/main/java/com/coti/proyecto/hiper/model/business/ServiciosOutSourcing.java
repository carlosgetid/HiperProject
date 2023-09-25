package com.coti.proyecto.hiper.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
public class ServiciosOutSourcing {

    @JsonProperty("codigo")
    private Integer codigoSe;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("subServicioOutSourcing")
    private List<SubServicioOutSourcing> subServicioOutSourcing;
}
