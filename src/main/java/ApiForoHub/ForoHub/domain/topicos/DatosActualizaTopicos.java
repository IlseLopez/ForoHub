package ApiForoHub.ForoHub.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizaTopicos(
        @NotNull Long id,
        String titulo,
        String mensaje,
        String status,
        String autor,
        String curso
) {
}
