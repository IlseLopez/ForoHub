package ApiForoHub.ForoHub.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopicos(

        @NotBlank String titulo,
        @NotBlank String mensaje,
         String fecha_creacion,
         String status,
        @NotNull String autor,
        @NotNull String curso
) {
}
