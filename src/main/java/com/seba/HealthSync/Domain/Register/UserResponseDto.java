package com.seba.HealthSync.Domain.Register;

import java.util.Date;

public record UserResponseDto(Long id, String name, String email, Date birthDate, String message) {
    public UserResponseDto(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getBirthDate(), "User registered successfully");
    }
}
