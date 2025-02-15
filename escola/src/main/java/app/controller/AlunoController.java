import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;

@RestController
@RequestMapping("/alunos")
class AlunoController {

    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return repository.save(aluno);
    }

    interface AlunoRepository extends JpaRepository<Aluno, Long> {}
}