package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 	
@Getter		
@Setter		
@NoArgsConstructor	
@AllArgsConstructor	
@Entity
class Turma {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String nome;
    
    @NotNull
    private Integer semestre;
    
    @NotNull
    private Integer ano;
    
    @NotBlank
    private String turno;
    
    @ManyToOne
    private Curso curso;
    
    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;
    
    @ManyToMany
    @JoinTable(name = "professor_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professores;
}