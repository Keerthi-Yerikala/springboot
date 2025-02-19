package com.wipro.sprintboot.usecase1;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
	Optional<Quiz> findByQuestion(String question);
}