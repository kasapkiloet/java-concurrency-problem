package com.example.project;

public abstract class UpdatePolicy {

  Car car;

  public abstract void start(String journeyId);

  public UpdatePolicy withContext(Car car) {
    this.car = car;
    return this;
  }
}
