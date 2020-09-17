package com.pattern.strategy;

import org.springframework.stereotype.Component;

import static com.pattern.strategy.MovementEnum.WALK_MOVEMENT;
import static java.lang.Thread.sleep;
import static java.lang.System.out;
import static java.lang.String.format;

@Component
public class WalkMovement implements Movement {

    @Override
    public void move(Integer distance) {
        Integer currentDistance = 0;

        try {
            while (currentDistance < distance) {
                currentDistance++;
                sleep(300);

                if (currentDistance % 20 == 0) {
                    sleep(300);
                    out.println("Take a break");
                }

                out.println(format("travelled distance.: %s", currentDistance));
            }
        } catch (InterruptedException error) {}
    }

    @Override
    public MovementEnum getMovementEnum() {
        return WALK_MOVEMENT;
    }
}
