package ApiForoHub.ForoHub.domain.topicos;

import java.time.LocalDateTime;

public record DatosListaTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_creacion,
        String status,
        String autor,
        String curso
) {

    public DatosListaTopicos(Topicos topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha_creacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso());
    }
}
