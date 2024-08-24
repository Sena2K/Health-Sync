package com.seba.HealthSync.Domain.Register;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record RegisterData(
        @NotNull String name,
        @NotNull @Email String email,
        @NotNull String password,

        @NotNull @Valid Date birthDate) {
}
