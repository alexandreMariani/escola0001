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
class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Pattern(regexp = "^\\S+\\s+\\S+.*$")
    private String nome;
    
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    private String cpf;
    
    private String telefone;
    
    @ManyToOne
    private Turma turma;
}
