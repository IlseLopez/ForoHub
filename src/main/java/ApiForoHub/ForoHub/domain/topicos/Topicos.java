package ApiForoHub.ForoHub.domain.topicos;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
//@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Table(name = "topico")
@Entity(name = "topicos")
public class Topicos {


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha_creacion;
    private String status;
    private String autor;
    private String curso;

    public Topicos(){

    }

    public Topicos(DatosRegistroTopicos topicos) {
        this.id = null;
        this.titulo= topicos.titulo();
        this.mensaje= topicos.mensaje();
        this.fecha_creacion = LocalDateTime.now();
        this.status = topicos.status();
        this.autor = topicos.autor();
        this.curso = topicos.curso();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }


    public String getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void actualizarInformacion(@Valid DatosActualizaTopicos topicos1) {
        if(topicos1.titulo() != null){
            this.titulo = topicos1.titulo();
        }
        if(topicos1.mensaje() != null){
            this.mensaje = topicos1.mensaje();
        }
        if (topicos1.status() != null){
            this.status = topicos1.status();
        }
        if(topicos1.autor() != null){
            this.autor = topicos1.autor();
        }
        if(topicos1.curso() != null){
            this.curso = topicos1.curso();
        }
    }
}
