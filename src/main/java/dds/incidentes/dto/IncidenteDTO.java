package dds.incidentes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncidenteDTO {
    private Integer tiempoRespuesta;
    private Boolean estaResuelto;
    private Integer miembrosAfectados;
}
