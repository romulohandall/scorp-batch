package br.gov.sema.batch.repository;

import br.gov.sema.batch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
