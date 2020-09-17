package com.pattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Component
public class MovementStrategyFactory {

    private Map<MovementEnum, Movement> movements;

    @Autowired
    public MovementStrategyFactory(Set<Movement> movements) {
        createMovement(movements);
    }

    public Movement findMovement(Optional<MovementEnum> movementEnum) {
        return movementEnum.isPresent() ? movements.get(movementEnum.get()) : null;
    }

    private void createMovement(Set<Movement> movements) {
        this.movements = new EnumMap(MovementEnum.class);
        movements.forEach(movement -> this.movements.put(movement.getMovementEnum(), movement));
    }
}
