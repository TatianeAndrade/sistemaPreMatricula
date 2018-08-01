package br.edu.ufcg.preMatricula.repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufcg.preMatricula.model.DisciplinaNote;

@Repository
@Transactional
public interface DisciplinaRepository extends JpaRepository<DisciplinaNote, String> {
	
	@Query("select u from DisciplinaNote u where u.codigo = ?1")
	List<DisciplinaNote> findCodigoDisciplina(String codigo);
}
