package com.seba.HealthSync.Repository;

import com.seba.HealthSync.Domain.Register.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
