package com.qs.courses_alpha.repository;

import com.qs.courses_alpha.domain.Disciplina;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Disciplina entity.
 */
@SuppressWarnings("unused")
public interface DisciplinaRepository extends JpaRepository<Disciplina,Long> {

}
