package com.seba.HealthSync.Domain.Register;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Date birthDate;
    private Boolean exists;
    public User(RegisterData data) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.name = data.name();
        this.email = data.email();
        this.password = encoder.encode(data.password());
        this.birthDate = data.birthDate();
        this.exists = true;
    }

    public void deleteAcount(){
        this.exists = false;
    }
}
