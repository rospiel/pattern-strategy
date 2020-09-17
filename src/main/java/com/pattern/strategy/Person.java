package com.pattern.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Objects.nonNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Component
public class Person {

    private String name;

    public void move(Movement movement, Integer distance) {
        out.println(format("%s Started the movement", name));

        if (nonNull(movement)) {
            movement.move(distance);
        }

        out.println(format("%s finished the path", name));
    }
}
