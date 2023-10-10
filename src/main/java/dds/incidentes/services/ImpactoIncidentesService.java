package dds.incidentes.services;

import dds.incidentes.dto.EntidadResultDTO;
import dds.incidentes.dto.ServiceRequestDTO;
import dds.incidentes.dto.ServiceResponseDTO;

public class ImpactoIncidentesService {
    private static final Integer coeficienteIncidentesNoResueltos = 1;
    public static ServiceResponseDTO calculate(ServiceRequestDTO requestDTO) {
        ServiceResponseDTO response = new ServiceResponseDTO();

        requestDTO.getEntidades().forEach(entidadDTO -> {
            EntidadResultDTO entidadResultDTO = new EntidadResultDTO(entidadDTO.getCodigo(), entidadDTO.calcularImpacto(coeficienteIncidentesNoResueltos));
            response.agregarEntidad(entidadResultDTO);
        });
        response.ordenarPorImpacto();

        return response;
    }
}
