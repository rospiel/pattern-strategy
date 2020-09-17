package com.pattern.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

import static com.pattern.strategy.MovementEnum.getByName;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping(value = "/StrategyController")
public class StrategyController {

    private final Person person;
    private final MovementStrategyFactory movementStrategyFactory;

    @PutMapping("/{distance}/{movementName}")
    public void movement(@PathVariable Integer distance, @PathVariable String movementName) {
        person.move(movementStrategyFactory.findMovement(getByName(movementName)), distance);
    }

    @PostConstruct
    public void setPersonName() {
        person.setName("Spring");
    }
}
