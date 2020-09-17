package com.pattern.strategy;

import org.springframework.stereotype.Component;

import static com.pattern.strategy.MovementEnum.RUN_MOVEMENT;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.lang.Thread.sleep;

@Component
public class RunMovement implements Movement {

    @Override
    public void move(Integer distance) {
        Integer currentDistance = 0;

        try {
            while (currentDistance < distance) {
                currentDistance++;
                sleep(150);
                out.println(format("travelled distance.: %s", currentDistance));
            }
        } catch (InterruptedException error) {}
    }

    @Override
    public MovementEnum getMovementEnum() {
        return RUN_MOVEMENT;
    }
}
