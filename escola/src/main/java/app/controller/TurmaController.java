import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;


@RestController
@RequestMapping("/turmas")
class TurmaController {
    private final TurmaRepository repository;
    
    TurmaController(TurmaRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping
    public Turma criar(@RequestBody Turma turma) {
        return repository.save(turma);
    }
    
    interface TurmaRepository extends JpaRepository<Turma, Long> {}
}
