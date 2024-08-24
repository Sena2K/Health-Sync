package com.seba.HealthSync.Repository;

import com.seba.HealthSync.Domain.Login.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<UserLogin, Long> {
    UserLogin findByEmail(String subject);
}
