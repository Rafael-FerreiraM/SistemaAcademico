package br.com.exemplo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.exemplo.model.entity.Aluno;

import java.util.List;
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
	//pesquisa por nome
	Aluno findByNome(String nome);
	
	//lista de alunos pelo primeiro nome
	List<Aluno> findByNomeStartsWith(String nome);
	
	//lista de alunos pelo último nome
	List<Aluno> findByNomeEndsWith(String nome);
	
	//lista de qualquer aluno
	List<Aluno> findByNomeContains(String nome);
}
