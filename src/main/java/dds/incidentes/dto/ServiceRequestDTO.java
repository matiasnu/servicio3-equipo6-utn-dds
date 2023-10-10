package dds.incidentes.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceRequestDTO {
    private List<EntidadDTO> entidades;
}