package com.coti.proyecto.hiper.model.business;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL) // Esta anotación excluye los campos nulos en la serialización JSON
public class SubServicioOutSourcing {
    @JsonProperty("subCodigo")
    private Integer subCodigo;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("precio")
    private Double precio;
    @JsonProperty("subServicioOutSourcings")
    private List<SubServicioOutSourcing> subServicioOutSourcings;

}
