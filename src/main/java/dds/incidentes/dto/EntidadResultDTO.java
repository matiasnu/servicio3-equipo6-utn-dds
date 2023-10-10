package dds.incidentes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntidadResultDTO {
    private String codigoEntidad;
    private Integer impactoIncidentes;

    public EntidadResultDTO(String codigoEntidad, Integer impactoIncidentes) {
        this.codigoEntidad = codigoEntidad;
        this.impactoIncidentes = impactoIncidentes;
    }
}
