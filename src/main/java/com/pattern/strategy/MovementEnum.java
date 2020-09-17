package com.pattern.strategy;

import lombok.AllArgsConstructor;

import java.util.Optional;

import static java.util.Arrays.stream;

@AllArgsConstructor
public enum MovementEnum {
    WALK_MOVEMENT("walkMovement"),
    RUN_MOVEMENT("runMovement");

    private final String name;

    public static Optional<MovementEnum> getByName(String name) {
        return stream(values())
                .filter(movementEnum -> movementEnum.name.equalsIgnoreCase(name))
                .findFirst();
    }
}
