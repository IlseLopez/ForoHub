package ApiForoHub.ForoHub.Controller;

import ApiForoHub.ForoHub.domain.topicos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository repository;

    @Transactional
    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopicos topicos){
        repository.save(new Topicos(topicos));
    }

    @GetMapping
    public Page<DatosListaTopicos> listar(@PageableDefault(size =10, sort = {"titulo"}) Pageable paginacion){
        return repository.findAll(paginacion).map(DatosListaTopicos::new);
    }

    @Transactional
    @PutMapping
    public void modificarTopico(@RequestBody @Valid DatosActualizaTopicos topicos){
        var topicos1 = repository.getReferenceById(topicos.id());
        topicos1.actualizarInformacion(topicos);

    }

    @Transactional
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        repository.deleteById(id);

    }

    @GetMapping("/{id}")
    public ResponseEntity detalle(@PathVariable Long id){
        var topicos = repository.getReferenceById(id);
        return ResponseEntity.ok( new DatosDetalleTopico(topicos));
    }





}
