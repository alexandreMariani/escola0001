import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;


@RestController
@RequestMapping("/professores")
class ProfessorController {
    private final ProfessorRepository repository;
    
    ProfessorController(ProfessorRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping
    public Professor criar(@RequestBody Professor professor) {
        return repository.save(professor);
    }
    
    interface ProfessorRepository extends JpaRepository<Professor, Long> {}
}

