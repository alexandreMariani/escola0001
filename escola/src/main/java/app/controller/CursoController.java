import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;


@RestController
@RequestMapping("/cursos")
class CursoController {
    private final CursoRepository repository;
    
    CursoController(CursoRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping
    public Curso criar(@RequestBody Curso curso) {
        return repository.save(curso);
    }
    
    interface CursoRepository extends JpaRepository<Curso, Long> {}
}

