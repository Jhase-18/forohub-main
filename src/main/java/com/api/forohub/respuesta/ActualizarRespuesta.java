package com.api.forohub.respuesta;

import jakarta.validation.constraints.NotNull;

public record ActualizarRespuesta(@NotNull Long id,
                                  String mensaje,
                                  String solucion) {
}
