package com.pattern.strategy;

public interface Movement {

    public void move(Integer distance);

    public MovementEnum getMovementEnum();
}
