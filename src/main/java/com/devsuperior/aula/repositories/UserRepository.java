package com.devsuperior.aula.repositories;

import com.devsuperior.aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
