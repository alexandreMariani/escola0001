package app.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Pattern(regexp = "^\\S+\\s+\\S+.*$")
    private String nome;
    
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    private String cpf;
    
    @NotBlank
    @Email
    private String email;
    
    @Pattern(regexp = "(^$|^\\S+\\s+\\S+.*$)")
    private String especialidade;
    
    @ManyToMany(mappedBy = "professores")
    private List<Turma> turmas;
}
